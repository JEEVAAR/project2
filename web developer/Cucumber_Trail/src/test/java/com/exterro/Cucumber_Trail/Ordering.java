package com.exterro.Cucumber_Trail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ordering {
	WebDriver driver= new ChromeDriver();
	@Given("Amazone home page")
	public void amazone_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\SOFT\\chromedriver.exe"); 
		driver.get("https://www.amazon.in/?ref_=nav_ya_signin");
		driver.manage().window().maximize(); 
	}

	@When("The user Search the Item")
	public void the_user_search_the_item() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Drone");
	}

	@And("click the search button")
	public void click_the_search_button() {
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@And("Select the required product in the shown searched results")
	public void select_the_required_product_in_the_shown_searched_results() {
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[17]/div/div/div/div/div[2]/div[1]/h2/a/span")).click();
	}

	@And("Click the buy now button")
	public void click_the_buy_now_button() { 
		 /*driver.findElement(By.id("submit.buy-now-announce")).click();
		driver.findElement(By.className("a-button-input")).click();
		driver.findElement(By.id("buy-now-button")).click();
		driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]")).click();*/
	}

	@Then("ordering the item")
	public void ordering_the_item() { 
	    //not working
	}
}
