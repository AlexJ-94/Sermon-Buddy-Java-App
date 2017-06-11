package connections;

import java.sql.*;
import javax.swing.*;

import javax.swing.JOptionPane;

public class MySQL_Connection {
	Connection con = null;
	public static Connection dbConnector()
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://192.168.0.109:3306/SermonBuddy", "Alex", "password");
			JOptionPane.showMessageDialog(null, "SQL Connection successful.");
			return con;
		}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, "Sorry the SQL Connection was unsuccessful.");
			e.printStackTrace();
			return null;
		}
	}
}
