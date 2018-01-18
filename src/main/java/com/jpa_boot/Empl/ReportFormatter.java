package com.jpa_boot.Empl;

public class ReportFormatter {

	private String formatOut;
	
	public ReportFormatter(Object e,FormatType f) {
		
		switch (f) {
		case XML:
			formatOut = getXMl(e);
			break;
		case CSV:
			formatOut = getCSV(e);
			break;
		default:
			break;
		}
	}

	private String getCSV(Object e) {
		// TODO Auto-generated method stub
		return "CSV" + e.toString();
	}

	private String getXMl(Object e) {
		// TODO Auto-generated method stub
		return "XML" + e.toString();
	}
	
	protected String getFormat() {
		return formatOut;
	}
}
