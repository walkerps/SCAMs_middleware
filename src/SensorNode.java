public class SensorNode {
	private String nodeId;
	private int mediumValue;
	private double linkStrength;
	private double coOrdinates;
	private int medium;
	private double batteryLevel;
	private String incomingPort;
<<<<<<< HEAD
	private String sensorData;
	private String timeStamp;
	private String status;
	
	public SensorNode(String nodeId,int mediumValue,double linkstrength,double coordinates,int medium,double batteryLevel,String incomingPort,String sensorData,String timeStamp,String status){
=======
	private SensorData sensorData;
	
	public SensorNode(String nodeId,int mediumValue,double linkstrength,double coordinates,int medium,double batteryLevel,String incomingPort,SensorData sensorData){
>>>>>>> 1487f0bc5a69a8ffff63588a050fd27bba22d0d8
		this.nodeId = nodeId;
		this.mediumValue = mediumValue;
		this.linkStrength = linkstrength;
		this.coOrdinates = coordinates;
		this.medium = medium;
		this.batteryLevel = batteryLevel;
		this.incomingPort = incomingPort;
		this.sensorData = sensorData;
		this.timeStamp = timeStamp;
		this.status = status;
		
<<<<<<< HEAD
	} 
	public SensorNode(){
		this.nodeId = null;
		this.mediumValue = 0;
		this.linkStrength = 0;
		this.coOrdinates = 0;
		this.batteryLevel = 0;
		this.medium = 0;
		this.incomingPort = null;
		this.sensorData = null;
		this.timeStamp = null;
		this.status = null;
		}
	public String getStatus(){
		return this.status;
	}
	public String getTimeStamp(){
		return this.timeStamp;
=======
>>>>>>> 1487f0bc5a69a8ffff63588a050fd27bba22d0d8
	}
	public String getNodeId(){
		
		return this.nodeId;
	}
	
	public int getMediumValue(){
		return this.mediumValue;
	}
	
	public double getLinkStrength(){
		return this.linkStrength;
	}
	
	public double getCoordinates(){
		
		return this.coOrdinates;
	}
	
	public int getMedium(){
		
		return this.medium;
	}
	
	public double getBatteryLevel(){
		
		return this.batteryLevel;
	}
	
	public String getIncomingPort(){
		
		return  this.incomingPort;
	}
	
<<<<<<< HEAD
	public String getSensorData(){
=======
	public SensorData getSensorData(){
>>>>>>> 1487f0bc5a69a8ffff63588a050fd27bba22d0d8
		
		return this.sensorData;
	}
	
	public void setNodeId(String nodeid){
		
		this.nodeId = nodeid;
	}
	
	public void setMediumValue(int mediumvalue){
		
		this.mediumValue = mediumvalue;
	}
	
	public void setLinkSterngth(double linkStrength){
		
		this.linkStrength = linkStrength;
	}
	
	public void setCoordinates(int coordinates){
		
		this.coOrdinates = coordinates;
	}
	
	public void setMedium(int medium){
		
		this.medium= medium;
		
	}
	
	public void setbatteryLevel(double batteryLevel){
		
		this.batteryLevel = batteryLevel;
		
	}
	
	public void setincomingPort(String incomingPort){
		
		this.incomingPort = incomingPort;
	}
	
<<<<<<< HEAD
	public void setSensorData(String data){
=======
	public void setSensorData(SensorData data){
>>>>>>> 1487f0bc5a69a8ffff63588a050fd27bba22d0d8
		
		this.sensorData = data;
	}
	public void setTimeStamp(String timeStamp){
		this.timeStamp = timeStamp;
	}
	public void setStatus(String status){
		this.status = status;
	}
}
