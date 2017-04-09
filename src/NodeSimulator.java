
import java.net.*;
import java.io.*;
import java.util.*;
public class NodeSimulator {
	@SuppressWarnings("resource")
	public static void main(String args[])throws Exception{
		
		InetAddress host = InetAddress.getLocalHost();
		Socket nodeSocket = null;
		PrintWriter outer = null;
		System.out.println("Node is Sending Data");
		nodeSocket = new Socket(host.getLocalHost(),8093);
		outer = new PrintWriter(nodeSocket.getOutputStream(),true);

		Random rnd = new Random();
		rnd.setSeed(41330);
		
		HashSet<Integer> set = new HashSet<Integer>();
		int times = 10;
		while(times>0) {
			--times;
			//String query = "n1,Node1,30,80.6,lt1,2,80.0,9876,6_1;2;3;4;5;6_67;45;56;76;87;54,23/12/33,active";
			String Query = "";
			
			int id = -1;
			while(id==-1) {
				id = rnd.nextInt(1000) + 1;
				if(set.contains(id)) id = -1;
				else set.add(id);
			}
			Query += id;
			Query += "a,";

			int other = rnd.nextInt(1000) + 1;
			Query += other;
			Query += "b,";
			
			other = rnd.nextInt(1000) + 1;
			Query += other;
			Query += ",";
			
			double otherDouble = rnd.nextDouble();
			otherDouble *= 100;
			Query += otherDouble;
			Query += ",";
			
			other = rnd.nextInt(1000) + 1;
			Query += other;
			Query += "c,";
			
			other = rnd.nextInt(3) + 1;
			Query += other;
			Query += ",";
			
			otherDouble = rnd.nextDouble();
			otherDouble *= 100;
			Query += otherDouble;
			Query += ",";

			other = rnd.nextInt(1000) + 1;
			Query += other;
			Query += ",";

			int numOfSensors = rnd.nextInt(6) + 1;
			Query += numOfSensors;
			Query += "_";
			HashSet<Integer> ID = new HashSet<Integer>();
			for(int i=1; i<= numOfSensors-1; i++) {
				int sensorId = rnd.nextInt(numOfSensors) + 1;
				if(ID.contains(sensorId)) {
					--i;
					continue;
				}
				ID.add(sensorId);
				Query += sensorId;
				Query += ";";
			}
			int sensorId = rnd.nextInt(numOfSensors) + 1;
			while(ID.contains(sensorId)) {
				sensorId = rnd.nextInt(numOfSensors) + 1;				
			}
			Query += sensorId;
			Query += "_";
			
			for(int i=1; i<= numOfSensors-1; i++) {
				int data = rnd.nextInt(1000) + 1;
				Query += data;
				Query += ";";
			}
			int data = rnd.nextInt(1000) + 1;
			Query += data;
			Query += ",";
			
			other = rnd.nextInt(1000) + 1;
			Query += other;
			Query += "d,";
			
			Query += "active";
			outer.write(Query);
			System.out.println(Query);
		}
		outer.close();
	}
}
