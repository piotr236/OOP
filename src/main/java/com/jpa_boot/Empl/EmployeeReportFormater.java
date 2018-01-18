package com.jpa_boot.Empl;

public class EmployeeReportFormater extends ReportFormatter {

	public EmployeeReportFormater(Employee obj, FormatType format) {
		super(obj, format);
		// TODO Auto-generated constructor stub
	}
	public String getFormater() {
		return getFormat();
	}
	
}
