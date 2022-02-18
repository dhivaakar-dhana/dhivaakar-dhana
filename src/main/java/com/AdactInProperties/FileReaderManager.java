package com.AdactInProperties;

public class FileReaderManager {
	
	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstancereaderManager() {
		FileReaderManager frm = new FileReaderManager();
		return frm;
	}

	
	public AdactinFileReader getInstanceFileReader() throws Throwable {
		AdactinFileReader afr = new AdactinFileReader();
		return afr;
		
	}
}
