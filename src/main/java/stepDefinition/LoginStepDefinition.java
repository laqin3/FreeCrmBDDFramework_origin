package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {

	WebDriver driver;
	@Given("^user is already in login page$")
	public void user_is_already_in_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laqin3\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com");
	}

	@When("^title of login page is free crm$")
	public void title_of_login_page_is_free_crm()  {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM software in the cloud for sales and service", title);
	}

	@Then("^click on Login_in button$")
	public void click_on_Login_in_button() {
		driver.findElement(By.xpath("//a[@href='https://ui.cogmento.com']")).click();
	}

	@Then("^user enters username and user enter password$")
	public void user_enters_username_and_user_enter_password(){
		driver.findElement(By.name("email")).sendKeys("laqin3@gmail.com");
		driver.findElement(By.name("password")).sendKeys("laqin32019");
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()  {
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	}

	@And("^user is on home page$")
	public void user_is_on_home_page() throws InterruptedException  {
		String title2=driver.getTitle();
		System.out.println("last page title is:  " + title2);
		Assert.assertEquals("", title2);
		Thread.sleep(2000);
		if (!(driver.equals(null))) {
			driver.quit();
		}
	}
	
	
	
	
	

}
