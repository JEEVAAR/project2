package com.exterro.Trail_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Order2 {
	WebDriver driver= new ChromeDriver();
	@Given("Amazon home page")
	public void amazon_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\SOFT\\chromedriver.exe"); 
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize(); 
	}

	@When("Search the Item")
	public void search_the_item() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Remote helicopter");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@And("Select the required product")
	public void select_the_required_product() {
		//driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span")).click();  
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span")).click();
	}

	@Then("Click the buynow button")
	public void click_the_buynow_button() {
		//driver.findElement(By.id("submit.buy-now-announce")).click();	    
	}

	

}
