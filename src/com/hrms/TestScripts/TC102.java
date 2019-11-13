package com.hrms.TestScripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.*;

public class TC102 {
	
	@Test
	//public static void main(String args[])throws Exception {
		public void tc102()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openApp();
		//obj.waitStmt();
		obj.verifyTitle();
		obj.login();
		obj.verifyTitle();
		obj.verifyText();
		obj.pimMenuadd();
		obj.addEmployee();
		obj.logout();
		obj.closeApp();
	}

}
