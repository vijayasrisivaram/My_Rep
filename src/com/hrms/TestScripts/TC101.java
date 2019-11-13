package com.hrms.TestScripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.*;
public class TC101 {
	@Test
	public void tc101()throws Exception {
		//test case steps
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openApp();
		//obj.waitStmt();
		obj.verifyTitle();
		obj.login();
		obj.verifyText();
		obj.logout();
		obj.closeApp();
		
		
	}

}
