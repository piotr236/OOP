package com.jpa_boot.Empl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnetionManager {
	private Connection conn;
	
	private static DataBaseConnetionManager conectionInstance = new DataBaseConnetionManager();
	
	private DataBaseConnetionManager() {
		
	}
	
	public static DataBaseConnetionManager getDataBaseConnetionManager() {
		return conectionInstance;
	}
	
	public void connect() throws SQLException {
		conn = DriverManager.getConnection("/URL");
		System.out.println("established connectio");
	}
	
	public Connection getConnection() {
		return conn;
	}
	
}
