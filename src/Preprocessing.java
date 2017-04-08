import java.sql.*;
import java.util.*;
//import com.mysql.jdbc.Driver;

public class Preprocessing {
	
	public static void main(String[] args) {
	 	String driver,url,name,pass;
		String str = null;
		try {
			driver = "com.mysql.jdbc.Driver";
			url = "jdbc:mysql://127.0.0.1/classcol";
			name = "root";
			pass = "rishivik";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection( url, name, pass );
			Statement stat = con.createStatement();
			Statement stat1 = con.createStatement();
			Connection cnn=DriverManager.getConnection(url,name,pass);
			if(cnn!=null)
			{	
				ResultSet rs=stat.executeQuery("select e.course_id,c.course_name from enrolled e join course c on e.course_id=c.course_id where e.user_id='"+str+"'");  
				while(rs.next()) { 
				} 
				cnn.close();  
			}
			cnn.close();
		}
		catch (SQLException sqle) {
		}
		catch(ClassNotFoundException cnfe) {
		}
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