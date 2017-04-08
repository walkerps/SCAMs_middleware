
import java.sql.*;
public class Preprocessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void process(SensorNode node) {
		String nodeId = node.getNodeId();
		int mediumValue = node.getMediumValue();
		double linkStrength = node.getLinkStrength();
		double coOrdinates = node.getCoordinates();
		int medium = node.getMedium();
		double batteryLevel = node.getBatteryLevel();
		String incomingPort = node.getIncomingPort();
		SensorData sensorData = node.getSensorData();
		
	}
}
