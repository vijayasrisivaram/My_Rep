package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	//var
	public WebDriver driver;
	public String url = "http://127.0.0.1/orangehrm-2.6/login.php";
	public String un = "admin";
	public String pw = "admin";
	public String fn = "SivaRam";
	public String ln = "Krishna";
	public String sfor = "0033";
	
	//obj
	public String txt_loginname = "txtUserName";
	public String txt_password = "//input[@name='txtPassword']";
	public String btn_login = "Submit";
	public String link_logout = "Logout";
	public String btn_add = "//input[@value='Add']";
	public String txt_firstname = "txtEmpFirstName";
	public String txt_lastname = "txtEmpLastName";
	public String btn_save = "//input[@value='Save']";
	public String btn_delete = "//input[@value='Delete']";
	public String chk_box = "//input[@value='0012']";
	public String text = "//ul[@id='option-menu']/li";
	public String link_pim = "PIM";
	public String link_addemp = "Add Employee";
	public String link_elist = "//li[@id='pim']/ul/li[1]/a/span";
	public String drp_select = "loc_code";
	public String txt_search = "//input[@name='loc_name']";
	public String btn_Search = "//input[@value='Search']";
	
	

}
