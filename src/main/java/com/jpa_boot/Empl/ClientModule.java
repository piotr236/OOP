package com.jpa_boot.Empl;

public class ClientModule {
	public static void  main(String arg[]) {
		Employee emp = new Employee(1,"s1","s2",false);
		hireNewEmployee(emp);
		print(emp);
		terminateEmployee(emp);
		
	}
	public static void hireNewEmployee(Employee empl) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.saveEmployee(empl);
	}
	
	public static void terminateEmployee(Employee empl) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.deleteEmployee(empl);
	}
	
	public static void print(Employee ee) {
		EmployeeReportFormater empCSV = new EmployeeReportFormater(ee,FormatType.CSV);
		EmployeeReportFormater empXML = new EmployeeReportFormater(ee, FormatType.XML);
		
		System.out.println(empCSV.getFormater());
		System.out.println(empXML.getFormater());
	}
}
