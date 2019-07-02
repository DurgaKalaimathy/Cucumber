package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class exercise3 {
	@Given("oprn signup page")
	public void oprn_signup_page() {
	   System.out.println("signup page opened");
	}

	@When("user enters fn as {string}")
	public void user_enters_fn_as(String fn) {
	   System.out.println("firstname is "+fn);
	}

	@When("user enters ln as {string}")
	public void user_enters_ln_as(String ln) {
	   System.out.println("lastname is "+ln);
	}

	@When("user enters dob as {string}")
	public void user_enters_dob_as(String dob) {
	   System.out.println("dob is "+dob);
	}

	@When("user enters pwd as {string}")
	public void user_enters_pwd_as(String pwd) {
	   System.out.println("password: "+pwd);
	}

	@When("user enters cpwd as {string}")
	public void user_enters_cpwd_as(String cpwd) {
		System.out.println("confirm password : "+cpwd);
	}



}
