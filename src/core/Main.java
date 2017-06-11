package core;

import java.sql.*;
import connections.MySQL_Connection;

public class Main {

	public static void main(String[] args) {
		Connection con;
		try
		{
			con = MySQL_Connection.dbConnector();
			String query = "SELECT * FROM Sermon";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
				System.out.println(rs.getString(6));
			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		Main_Menu Menu = new Main_Menu();

	}
}
