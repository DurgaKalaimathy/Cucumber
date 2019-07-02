package stepdef;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class exercise5 {
	WebDriver driver;
	
	@Given("open testmeapp")
	public void open_testmeapp() {
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
	}
	@When("user enters username")
	public void user_enters_username() {
		//WebElement var2=driver.findElement(By.name("userName"));
		//var2.sendKeys("Lalitha");
		PageObject p1= PageFactory.initElements(driver, PageObject.class);
		PageObject.un.sendKeys("mercury");
		
	}
	@When("user enters password")
	public void user_enters_password() {
		//WebElement var3=driver.findElement(By.name("password"));
		//var3.sendKeys("password123");
		PageObject p1= PageFactory.initElements(driver, PageObject.class);
		PageObject.pwd.sendKeys("mercury");
	}
	@When("user clicks submit button")
	public void user_clicks_submit_button() {
		WebElement var4=driver.findElement(By.name("login"));
		var4.click();
	}
	@Then("verify login")
	public void verify_login() {
	 // WebElement var5=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img"));
		WebElement var5=driver.findElement(By.linkText("SIGN-OFF"));
		WebElement var6=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"));
		Assert.assertEquals(var5,var6);
	}
	
}
