package org.bench4Q.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;





public class JdbcSource {

	public static final String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/bookstore?user=root&password=1234&useSSL=true";

	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection(jdbcUrl);
	}

}
