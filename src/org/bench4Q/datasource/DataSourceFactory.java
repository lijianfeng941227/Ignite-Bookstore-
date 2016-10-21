package org.bench4Q.datasource;

import javax.cache.configuration.Factory;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DataSourceFactory<T> implements Factory<T>{

	@Override
	public T create() {
		DriverManagerDataSource dataSource = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			dataSource = new DriverManagerDataSource("jdbc:mysql://localhost:3306/bookstore", "root","1234");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (T)dataSource;
	}

}
