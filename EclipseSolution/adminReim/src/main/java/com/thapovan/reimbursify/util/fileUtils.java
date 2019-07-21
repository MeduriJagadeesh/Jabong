package com.thapovan.reimbursify.util;

import java.io.File;
import java.util.Calendar;

public class fileUtils {

	public void setUpResultsFolder(String testCaseName) {
		
		
		String subFolder=Calendar.getInstance().getTime().toString().substring(0, 10);
		String path = new File(System.getProperty("user.dir")).getParent();		
		File newDir = new File(path + File.separator + subFolder);
		newDir.mkdir();
		
		File newFileDir=new File(newDir.getParent());
		
		
	}
}
