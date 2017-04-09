public class SensorNode {
	private String nodeId;
	private String nodeName;
	private int mediumValue;
	private double linkStrength;
	private String location;
	private int medium;
	private double batteryLevel;
	private String incomingPort;
	private SensorData sensorData;
	private String timeStamp;
	private String status;
	
	public SensorNode(String nodeId,String nodeName,int mediumValue,double linkstrength,String location,int medium,double batteryLevel,String incomingPort,SensorData sensorData,String timeStamp,String status){
		this.nodeId = nodeId;
		this.nodeName = nodeName;
		this.mediumValue = mediumValue;
		this.linkStrength = linkstrength;
		this.location = location;
		this.medium = medium;
		this.batteryLevel = batteryLevel;
		this.incomingPort = incomingPort;
		this.sensorData = null;
		this.timeStamp = timeStamp;
		this.status = status;
		
	} 
	public SensorNode(){
		this.nodeId = null;
		this.nodeName = null;
		this.mediumValue = 0;
		this.linkStrength = 0;
		this.location = null;
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
	public String getNodeName(){
		return this.nodeName;
	}
	public String getTimeStamp(){
		return this.timeStamp;
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
	
	public String getLocation(){
		
		return this.location;
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
	
	public SensorData getSensorData(){
		
		return this.sensorData;
	}
	
	public void setNodeId(String nodeid){
		
		this.nodeId = nodeid;
	}
	
	public void setNodeName(String nodeName){
		
		this.nodeName = nodeName;
	}
	
	public void setMediumValue(int mediumvalue){
		
		this.mediumValue = mediumvalue;
	}
	
	public void setLinkSterngth(double linkStrength){
		
		this.linkStrength = linkStrength;
	}
	
	public void setLocation(String location){
		
		this.location = location;
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
	
	public void setSensorData(SensorData sensorData){
		
		this.sensorData = sensorData;
	}
	public void setTimeStamp(String timeStamp){
		this.timeStamp = timeStamp;
	}
	public void setStatus(String status){
		this.status = status;
	}
}
