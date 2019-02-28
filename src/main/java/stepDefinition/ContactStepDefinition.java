package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ContactStepDefinition {
	WebDriver driver;
	
	
	@Given("^user is already in homepage$")
	public void user_is_already_in_homepage() {
		try {
		WebElement userDisplay=driver.findElement(By.xpath("//div[@className='user-display']"));
		String user=userDisplay.getText();
		Assert.assertEquals("Kasimu Shawutijiang", user);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("no such element");
		}
	}

	@When("^user click on contact$")
	public void user_click_on_contact() {
	    driver.findElement(By.xpath("html/body/div/div/a[3]")).click();
	}

	@Then("^click on new button$")
	public void click_on_new_button() {
	    driver.findElement(By.xpath("//a[@href='/contacts/new']")).click();
	}

	@Then("^user enter first name and last name$")
	public void user_enter_first_name_and_last_name()  {
	    driver.findElement(By.name("first_name")).sendKeys("a1");
	    driver.findElement(By.name("last_name")).sendKeys("a1a");
	}

	@Then("^user clicks in save button$")
	public void user_clicks_in_save_button()  {
	    driver.findElement(By.xpath("//*[text()='Save']")).click();
	}

	@Then("^verify new contact created$")
	public void verify_new_contact_created() {
	    
	}

}
