package org.bench4Q.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class TestIgniteXML {
	
  public static void main(String[] args) {
	  Connection con = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		try {
			  Class.forName("org.apache.ignite.IgniteJdbcDriver"); 
			  
			  con = DriverManager
						.getConnection("jdbc:ignite:cfg://cache=Item@clientjdbc.xml");
				statement = con
						.prepareStatement("SELECT * from \"Item\".item");
				// Set parameter
				rs = statement.executeQuery();
				// Results
				System.out.println("¿ªÊ¼²éÑ¯");
				while(rs.next()){
					System.out.println("1111");
			//	System.out.println(rs.getInt(1));
			//	System.out.println(rs.getString(2));
			//	System.out.println(rs.getDate("c_login"));
				System.out.println();

				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("222222");
			e.printStackTrace();
		}
	  
	  System.out.println("sadasd");
  }
}
