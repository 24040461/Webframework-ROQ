package pageFactory;

import browserFactory.browserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import seleniumElements.seleniumElements;
public class loginPage {
	browserFactory browser;
	WebDriver driver;
	public seleniumElements txt_username;
	public seleniumElements txt_password;
	public seleniumElements btn_continue;
	public seleniumElements btn_login ;
	public seleniumElements txt_login_error;

	public loginPage(WebDriver driver) {
		this.driver = driver;
		WiniumElements();
	}
	public void WiniumElements(){
		txt_username = new seleniumElements(By.id("user"),driver);
		txt_password = new seleniumElements(By.id("password"),driver);
		btn_continue= new seleniumElements(By.id("login"),driver);
		btn_login= new seleniumElements(By.id("login-submit"),driver);
		txt_login_error= new seleniumElements(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/section/div[2]/div/section"),driver);
	}
}
