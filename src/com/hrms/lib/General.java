package com.hrms.lib;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hrms.utility.Log;

public class General extends Global {
	//Re-Usable Functions
	@BeforeClass
	public void openApp() {
		Log.info("**********Started Execution***********");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Desktop\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		Reporter.log("Application Opened");
		Log.info("Application Opened Succesfully");
	}
	@Test(priority=2)
	public void verifyTitle() {
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			Reporter.log("Title Matched");
			Log.info("Title Matched");
	  }
		else {
			Reporter.log("Title not Matched");
		}
	}
	@Test(priority=3)
	public void verifyText() {
		assertTrue(driver.findElement(By.xpath(text)).getText().matches("Welcome admin"));
		Reporter.log("Welcome admin");
		Log.info("Welcome Admin");
	}
	public void waitStmt()throws Exception {
		Thread.sleep(3000);
	}
	@AfterClass
	public void closeApp() {
		driver.quit();
		Reporter.log("Application Closed");
		Log.info("Application Closed");
		
	}
	@Test(priority=1)
	public void login()throws Exception {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.xpath(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		Reporter.log("Login Successful");
		Log.info("Login Successful");
		Thread.sleep(3000);
	}
	@Test(dependsOnMethods="login")
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		Reporter.log("Logout Successful");
		Log.info("Logout Successful");
	}
	@Test(priority=5)
	public void addEmployee()throws Exception {
		driver.switchTo().frame("rightMenu");
		//driver.findElement(By.xpath(btn_add)).click();
		Thread.sleep(3000);
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("siva");
		Thread.sleep(3000);
		driver.findElement(By.name(txt_lastname)).sendKeys(ln);
		Thread.sleep(3000);
		driver.findElement(By.xpath(btn_save)).click();
		Thread.sleep(3000);
		Reporter.log("Entered into Frame");
		Log.info("Entered into Frame");
		driver.switchTo().defaultContent();
		Reporter.log("Exit From Frame");
		Log.info("Exit From Frame");
		Reporter.log("Employee added successfully");
		Log.info("New Employee Added");
		
	}
	@Test(priority=4)
	public void pimMenuadd()throws Exception {
		WebElement pimmenu = driver.findElement(By.linkText(link_pim));
		Actions ac = new Actions(driver);
		ac.moveToElement(pimmenu).perform();
		Reporter.log("PIM");
		Thread.sleep(3000);
		driver.findElement(By.linkText(link_addemp)).click();
		Reporter.log("Add Employee");
		Log.info("Add Employee");
		
	}
	@Test(priority=6)
	public void delEmployee()throws Exception {
		WebElement pimmenu = driver.findElement(By.linkText("PIM"));
		Actions ac = new Actions(driver);
		ac.moveToElement(pimmenu).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Employee List")).click();
		Thread.sleep(3000);
		Reporter.log("SubMenu");
		driver.switchTo().frame("rightMenu");
		Select st = new Select(driver.findElement(By.name(drp_select)));
		st.selectByVisibleText("Emp. ID");
		Thread.sleep(3000);
		driver.findElement(By.xpath(txt_search)).sendKeys(sfor);
		driver.findElement(By.xpath(btn_Search)).click();
		driver.findElement(By.name("chkLocID[]")).click();
		//driver.findElement(By.xpath(chk_box)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(btn_delete)).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Reporter.log("Deleted Empid");
		Log.info("Deleted Employee");
	}

}
