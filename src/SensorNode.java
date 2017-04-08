public class SensorNode {
	private String nodeId;
	private int mediumValue;
	private double linkStrength;
	private double coOrdinates;
	private int medium;
	private double batteryLevel;
	private String incomingPort;
	private String sensorData;
	private String timeStamp;
	private String status;
	
	public SensorNode(String nodeId,int mediumValue,double linkstrength,double coordinates,int medium,double batteryLevel,String incomingPort,String sensorData,String timeStamp,String status){
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
	
	public String getSensorData(){
		
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
	
	public void setSensorData(String data){
		
		this.sensorData = data;
	}
	public void setTimeStamp(String timeStamp){
		this.timeStamp = timeStamp;
	}
	public void setStatus(String status){
		this.status = status;
	}
}
