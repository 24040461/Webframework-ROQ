package steps;


import io.cucumber.java.en.*;
import org.junit.Assert;
import pageFactory.homePage;
import pageFactory.loginPage;
import browserFactory.browserFactory;
public class profileSteps {
	browserFactory browsers;
	private loginPage login = new loginPage(browserFactory.getdriver());
	private homePage home = new homePage(browserFactory.getdriver());
	@Given("user is on homepage of trello")
	public void user_is_on_homepage_of_trello(){
		browserFactory.getdriver().get("https://trello.com/login");
		login.txt_username.type("callumgill99@outlook.com");
		login.btn_continue.click();
		login.txt_password.type("Test1234");
		login.btn_login.click();
	}
	@When("user clicks on the profile")
	public void user_clicks_on_the_profile() {
		home.profile_btn.click();
	}
	@Then("user should see account options")
	public void user_should_see_account_options() {
		Assert.assertEquals(true,home.profile_menu.isDisplayed());
	}
}
