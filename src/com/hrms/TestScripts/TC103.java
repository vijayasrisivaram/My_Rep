package com.hrms.TestScripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.*;

public class TC103 {
	@Test
	public void tc103()throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openApp();
		obj.login();
		//obj.pimMenuadd();
		//obj.addEmployee();
		//obj.navigate();
		//obj.pimMenulist();
		obj.delEmployee();
		obj.logout();
		obj.closeApp();
	}
	

}
