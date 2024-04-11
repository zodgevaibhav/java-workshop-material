package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBOperations {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zeal_demo_db", "saas",
				"DnyanYog#2024_W22");
		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("select  count(*) from users"); // Select
		
		System.out.println(getResultSetCount(rs));

		// rs.last();
		// rs.getRow();
		while (rs.next()) {
			System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4));
		}
		con.close();
	
	}
	
	private static int getResultSetCount(ResultSet rs) throws SQLException
	{
		int rowCount=0;
		while(rs.next())
		{
			System.out.println("First record "+rs.getString(1));
			rowCount=rowCount+1;
		}
		return rowCount;
	}
}
