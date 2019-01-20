package seleniumTests;


import PageObjects.LoginPage;
import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.FileReaderManager;
import testDataTypes.UsersInfo;

public class LoginPageSteps {
	
	TestContext testContext;
	 LoginPage login;
	 
	 public LoginPageSteps(TestContext context) {
		 testContext = context;
		 login = testContext.getPageObjectManager().getLoginPage();
		 }

	 @When("^user login with \\\"(.*)\\\"$")
		public void user_login_with_invalid_credential(String userEmail) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		/*
		 * Users user =
		 * FileReaderManager.getInstance().getJsonReader().getUserByEmail(userEmail);
		 * login.signInForm(user.email, user.password);
		 */
		 login.signInForm(userEmail, "Password123");
	 }

		
		@Then("^user navigate to error page$")
		public void user_navigate_to_error_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			String exp = "http://automationpractice.com/index.php?controller=authentication";
			login.validateErrorPage(exp, testContext.getWebDriverManager().getDriver());
			//testContext.getWebDriverManager().closeDriver();
		    
		}


}
