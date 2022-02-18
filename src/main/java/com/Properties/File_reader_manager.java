package com.Properties;

public class File_reader_manager {
	
	private File_reader_manager() {
		
	}
	
	public static File_reader_manager getInstanceFRM() {
		File_reader_manager frm = new File_reader_manager();
		return frm;
	}
	
	public PropertiesReader getInstancePR() throws Throwable {
		PropertiesReader pr = new  PropertiesReader();
		return pr;
	}

}
