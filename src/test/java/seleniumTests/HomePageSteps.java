package seleniumTests;


import PageObjects.HomePage;
import cucumber.TestContext;
import cucumber.api.java.en.Given;



public class HomePageSteps {
	 TestContext testContext;
	 HomePage homePage;
	 
	 public HomePageSteps(TestContext context) {
		 testContext = context;
		 homePage = testContext.getPageObjectManager().getHomePage();
		 }
		 
	
	 @Given("^User is on login page$")
		public void user_is_on_login_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			 homePage.navigateLoginPage();
		    
		}

}
