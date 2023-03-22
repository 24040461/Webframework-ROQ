package steps;

import browserFactory.browserFactory;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pageFactory.homePage;
import pageFactory.loginPage;
import pageFactory.global.globalElements;

public class loginSteps {
	private WebDriver driver;
	browserFactory browsers;
	private loginPage login = new loginPage(browserFactory.getdriver());
	private homePage home = new homePage(browserFactory.getdriver());
	private globalElements global = new globalElements(browserFactory.getdriver());

	@Given("user is on login page")
	public void user_is_on_login_page() {
		browserFactory.getdriver().get("https://trello.com/login");
	}
	@When("user enters email {string}")
	public void user_enters_email(String text) {
		login.txt_username.type(text);
	}
	@And("user clicks continue")
	public void user_clicks_continue(){
		login.btn_continue.click();
	}
	@Then("user navigated to the home")
	public void user_navigated_to_the_home(){
		Assert.assertEquals(true,global.header.isDisplayed());
	}
	@And("user enters password {string}")
	public void user_navigated_to_the_home(String text) {
		login.txt_password.type(text);
		login.btn_login.click();
	}
	@And("user enters incorrect password {string}")
	public void user_enters_incorrect_password(String text){
		login.txt_password.type(text);
		login.btn_login.click();
	}
	@Then("user is shown incorrect message")
	public void user_is_shown_incorrect_message(){
		Assert.assertEquals(true, login.txt_login_error.isDisplayed());
	}


}
