package com.cucumber.framework.stepdefinition.NewCar;

import io.appium.java_client.AppiumDriver;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cucumber.framework.Helper.Logger.LoggerHelper;
import com.cucumber.framework.Helper.TestBase.TestBase;
import com.cucumber.framework.pageobject.PageAndroidWeb_HomePage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TC_01_NewCarPageDisplayVerification {
	private final Logger log= LoggerHelper.getLogger(TC_01_NewCarPageDisplayVerification.class);
	
	TestBase testbaseObj= new TestBase();
	public AppiumDriver driver;
	PageAndroidWeb_HomePage cdHomePgObject;

	
	@Then("^user verifies home page is displayed$")
	public void user_verifies_home_page_is_displayed() throws Throwable {
		driver=TestBase.driver;
		System.out.println(driver.hashCode());
		cdHomePgObject= new PageAndroidWeb_HomePage(driver);
		System.out.println("Inside step def and browser Name is " + TestBase.deviceID);
		cdHomePgObject.verifyHomePage(TestBase.deviceID);
	    
	}

	@Then("^verify New Car button is displayed on the home page$")
	public void verify_New_Car_Button_is_displayed_on_the_home_page() throws Throwable {
	   
	   System.out.println("Inside New Button verification");
	   cdHomePgObject.verifyBtnDisplay("New Car", TestBase.deviceID);
	   
	}

	@Then("^click on New Car button$")
	public void click_on_New_Car_button() throws Throwable {
	   
	   
	}

	@Then("^Verify New Car page is displayed$")
	public void verify_New_Car_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}