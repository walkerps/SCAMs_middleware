
import java.net.*;
import java.io.*;

public class NodeSimulator {
	@SuppressWarnings("resource")
	public static void main(String args[])throws Exception{
		
		InetAddress host = InetAddress.getLocalHost();
		Socket nodeSocket = null;
		PrintWriter outer = null;
		
			System.out.println("Node is Sending Data");
			nodeSocket = new Socket(host.getLocalHost(),8093);
			outer = new PrintWriter(nodeSocket.getOutputStream(),true);
			String query = "n1,Node1,30,80.6,lt1,2,80.0,9876,6_1;2;3;4;5;6_67;45;56;76;87;54,23/12/33,active";
			outer.write(query);
			outer.close();
			System.out.println(query);
		}
		
		
	}
