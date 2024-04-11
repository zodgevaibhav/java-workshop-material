package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBOperations {

	private static Connection connection;
	private static Statement sqlStatement;
	private static String dbConnectionUrl = "jdbc:mysql://localhost:3306/zeal_demo_db";
	private static String dbUser = "saas";
	private static String dbPassword = "DnyanYog#2024_W22";

	static {
		try {
			connection = DriverManager.getConnection(dbConnectionUrl, dbUser, dbPassword);
			sqlStatement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static ResultSet executeQueryToGetResult(String query) throws SQLException {

		ResultSet rs = sqlStatement.executeQuery(query); // Select

		return rs;
	}
}
