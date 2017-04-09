import java.io.*;
import java.net.*;
import java.util.*;


public class DataListner {
	
	public static void main(String args[])throws Exception{
		
		try{
			ServerSocket ss = new ServerSocket(8094);
			ss.setReuseAddress(true);
			while(true)
			{
				Socket nodeSocket = ss.accept();
				System.out.println(nodeSocket);
				NodeServiceThread nodeThread = new NodeServiceThread(nodeSocket);
				nodeThread.start();
			}			
		}catch(Exception e){System.out.println(e);}
	}
}

class NodeServiceThread extends Thread{
	Socket nodeSocket;
	boolean running = true;
	Queue<String> sensorDataQueue = new LinkedList<>();
	String nodeData = null;
	
	NodeServiceThread(Socket s){
		nodeSocket = s;
	}
	
	@SuppressWarnings("null")
	public void run(){
		
		System.out.println("Listening for Node Data");
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(nodeSocket.getInputStream()));
			while(running){
				
				while((nodeData =br.readLine()) != null) {
					System.out.println("Data is " + nodeData);
					sensorDataQueue.add(nodeData);
					/* Create a object of queue data and forward the data to diaggregration stage*/
					String NodeData = sensorDataQueue.remove();
					SensorNode sensorNode_ = new SensorNode();
					String listData[] = NodeData.split(",");
					System.out.println(listData.length);
					sensorNode_.setNodeId(listData[0]);
					sensorNode_.setNodeName(listData[1]);
					sensorNode_.setMediumValue(Integer.parseInt(listData[2]));
					sensorNode_.setLinkSterngth(Double.parseDouble(listData[3]));
					sensorNode_.setLocation(listData[4]);
					sensorNode_.setMedium(Integer.parseInt(listData[5]));
					sensorNode_.setbatteryLevel(Double.parseDouble(listData[6]));
					sensorNode_.setincomingPort(listData[7]);
					String SensorData = listData[8];
					String sensorList[] = SensorData.split("_");
					SensorData sensorData_ = new SensorData();
					sensorData_.setNoOfSensors(Integer.parseInt(sensorList[0]));
					String[] sensorTypeList = sensorList[1].split(";");
//					ArrayList<Integer> sensorTypeArrayList = null;
					ArrayList<Integer> sensorTypeArrayList = new ArrayList<Integer>();
					for (int i=0;i<sensorTypeList.length;i++){
						sensorTypeArrayList.add(Integer.parseInt(sensorTypeList[i]));
					}
					sensorData_.setTypesOfSensors(sensorTypeArrayList);
					String[] sensorDataValue = sensorList[2].split(";");
					ArrayList <Double> sensorDataValueArrayList = new ArrayList<Double>();
					for(int i=0;i<sensorDataValue.length;i++){
						sensorDataValueArrayList.add(Double.parseDouble(sensorDataValue[i]));
					}
					sensorData_.setData(sensorDataValueArrayList);
					sensorNode_.setSensorData(sensorData_);
					sensorNode_.setTimeStamp(listData[9]);
					sensorNode_.setStatus(listData[10]);
				}
			}
		}catch(Exception e){e.printStackTrace();
		}
	}
}