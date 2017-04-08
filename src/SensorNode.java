public class SensorNode {
	private String nodeId;
	private int mediumValue;
	private double linkStrength;
	private double coOrdinates;
	private int medium;
	private double batteryLevel;
	private String incomingPort;
	private SensorData sensorData;
	
	public SensorNode(String nodeId,int mediumValue,double linkstrength,double coordinates,int medium,double batteryLevel,String incomingPort,SensorData sensorData){
		this.nodeId = nodeId;
		this.mediumValue = mediumValue;
		this.linkStrength = linkstrength;
		this.coOrdinates = coordinates;
		this.medium = medium;
		this.batteryLevel = batteryLevel;
		this.incomingPort = incomingPort;
		this.sensorData = sensorData;
		
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
	
	public SensorData getSensorData(){
		
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
	
	public void setSensorData(SensorData data){
		
		this.sensorData = data;
	}
}
