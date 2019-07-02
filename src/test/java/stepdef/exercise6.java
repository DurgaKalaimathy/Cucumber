package stepdef;

import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class exercise6 {
	WebDriver driver;
	@Given("user enters product")
	public void user_enters_product(io.cucumber.datatable.DataTable dataTable) {
		List<String> p=dataTable.asList();
		for(String p1:p)
		{
			System.out.println(p1);
		}
	}

	@Given("verify products displayed")
	public void verify_products_displayed() {
	 System.out.println("verified");
	}

	@Then("close the app")
	public void close_the_app() {
	  System.out.println("close");
	}


}
