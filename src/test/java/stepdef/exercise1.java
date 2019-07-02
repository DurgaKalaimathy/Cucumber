package stepdef;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class exercise1 {
	WebDriver driver;
	
	@Test
	@Given("user opens login in newtour's application")
	public void user_opens_login_in_newtour_s_application() {
		driver.get("http://10.232.237.143:443/TestMeApp/");
		WebElement ll=driver.findElement(By.linkText("SignIn"));
		ll.click();
	  System.out.println("done 1");
	}
    
	@Test
	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String un, String pwd) {
		WebElement login=driver.findElement(By.name("userName"));
		login.sendKeys(un);
		WebElement p=driver.findElement(By.name("password"));
		p.sendKeys(pwd);
	   System.out.println("done 2");
	}
    
	@Test
	@When("Click Submit button")
	public void click_Submit_button() {
		WebElement l=driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]"));
		l.click();
		 System.out.println("done 2");
	}
    @Test
	@Then("verify login success")
	public void verify_login_success() {
		 System.out.println("done 2");
	}
    @BeforeTest
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
}
