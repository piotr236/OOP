package com.jpa_boot.Empl;

import java.sql.SQLException;

public class EmployeeDAO {
	
	public void saveEmployee(Employee emp){
	/*	DataBaseConnetionManager connetionManager = DataBaseConnetionManager.getDataBaseConnetionManager();
		try {
			connetionManager.connect();
			connetionManager.getConnection().createStatement().executeQuery("get");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/	
		System.out.println("save employee" + emp.toString());
	}
	public void deleteEmployee(Employee emp){
		System.out.println("delete employee" + emp.toString());
	}
}
