package stepdef;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.java.en.Given;

public class exercise4 {
	WebDriver driver;
	
	@Test
	@Given("app displays welcome settings")
	public void app_displays_welcome_settings() {
	    System.out.println("Welcome");
	}
	
	@Test
	@Given("users un and pwd")
	public void users_un_and_pwd() {
		driver.get("http://10.232.237.143:443/TestMeApp/");
		WebElement ll=driver.findElement(By.linkText("SignIn"));
		ll.click();
		WebElement login=driver.findElement(By.name("userName"));
		login.sendKeys("Lalitha");
		WebElement p=driver.findElement(By.name("password"));
		p.sendKeys("password123");
	}
	
	@Test
	@Given("click signin")
	public void click_signin() {
		WebElement l=driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]"));
		l.click();
		System.out.println("signed in");
	}
	
	/*@Test
	@Given("user searches for iphone")
	public void user_searches_for_iphone() {
	   System.out.println("iphone purchased");
	}
	
	@Test
	@Given("user adding the searched product to cart")
	public void user_adding_the_searched_product_to_cart() {
	   System.out.println("iphone in cart");
	}
	
	@Test
	@Given("user paid")
	public void user_paid() {
	   System.out.println("paid");
	}
	
	@Test
	@Given("user signed out")
	public void user_signed_out() {
	    System.out.println("signed out");
	}*/
	
	@BeforeTest
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
}
