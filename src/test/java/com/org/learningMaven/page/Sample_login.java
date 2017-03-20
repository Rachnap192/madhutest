package com.org.learningMaven.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.org.learningMaven.Project.dummy;

  public class Sample_login extends dummy {
	public By email  = By.name("email");
	public By password = By.name("password");
	public By login = By.xpath("html/body/div/div/div/div/div/div/div/section/form/div[3]/button");
	public By forgot_password = By.xpath("html/body/div/div/div/div/div/div/div/section/a");
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	public WebElement getlogin()
	{
		return driver.findElement(login);
	}
	public WebElement getforgot_password()
	{
		return driver.findElement(forgot_password);
	}
	public void login(String url)
	{
		driver.get(url);
	}

	public void usercredential(String email, String password)
	{
		getEmail().sendKeys(email);
		getpassword().sendKeys(password);
	}

	public void submit()
	{
		getlogin().click();
	}
	
}
