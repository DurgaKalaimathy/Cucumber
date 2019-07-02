package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class exercise2 {
	@Given("open newtours app")
	public void open_newtours_app() {
	   System.out.println("open the app");
	}

	@When("user enters un as {string} and pwd as {string}")
	public void user_enters_un_as_and_pwd_as(String un, String pwd) {
		 System.out.println("username is"+ un +"password is"+pwd);
	}

	@When("submit login form")
	public void submit_login_form() {
	    System.out.println("submitted");
	}

	@Then("verify pass")
	public void verify_pass() {
	   System.out.println("passed");
	}

	@Then("verify fail")
	public void verify_fail() {
	  System.out.println("failed");
	}


}
