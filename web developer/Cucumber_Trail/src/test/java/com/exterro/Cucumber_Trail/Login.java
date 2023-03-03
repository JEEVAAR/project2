package com.exterro.Cucumber_Trail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
  //WebDriver driver=null;
	 WebDriver driver= new ChromeDriver();
   @Given("Open the Amazon website")
     public void open_the_amazon_website() {
	System.setProperty("webdriver.chrome.driver", "C:\\SOFT\\chromedriver.exe"); 
	driver.navigate().to("http://www.Amazon.in");
	driver.manage().window().maximize();
	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
}

   @When("The user name is Entered")
   public void the_user_name_is_entered() {
	driver.findElement(By.id("ap_email")).sendKeys("jeeva.a.r01@gmail.com"); 
	driver.findElement(By.id("continue")).click();
}

  @And("The password is Entered")
public void the_password_is_entered() {
	  driver.findElement(By.id("ap_password")).sendKeys("amazonrpr"); 
}

  @And("Click the Loginin button")
public void click_the_loginin_button() {
	driver.findElement(By.id("signInSubmit")).click();
}

}