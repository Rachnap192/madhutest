package com.org.learningMaven.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.org.learningMaven.Project.dummy;
import com.org.learningMaven.page.Sample_login;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition_login{

	
Sample_login obj= new Sample_login();

/*public StepDefinition_login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}*/

@Given("^The User is in the  login page$")
public void the_User_is_in_the_login_page() throws Throwable {
String url = "https://qa-slz2.scholasticlearningzone.com/slz-custportal/#/";
  obj.login(url);
  
}

@When("^The User enters the valid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
public void the_User_enters_the_valid_credentials_and(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	obj.usercredential(arg1,arg2);
}

@And("^User clicks on Login button$")
public void user_clicks_on_Login_button() throws Throwable {
    //getlogin().click();
	obj.submit();
}

@Then("^User should be redirected to Home page$")
public void user_should_be_redirected_to_Home_page() throws Throwable {
    System.out.println("user in home screen");
}

}
