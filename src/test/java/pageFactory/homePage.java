package pageFactory;

import browserFactory.browserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import seleniumElements.seleniumElements;
public class homePage {
	browserFactory browser;
	WebDriver driver;
	public seleniumElements profile_btn;
	public seleniumElements profile_menu;
	public seleniumElements create_board_btn;
	public seleniumElements board_title_input;
	public seleniumElements board_create_btn;
	public homePage(WebDriver driver){
		this.driver = driver;
		WiniumElements();
	}
	public void WiniumElements(){
		profile_btn = new seleniumElements(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[1]/div/nav/div[3]/div[5]/button"),driver);
		profile_menu= new seleniumElements(By.xpath("/html/body/div[3]/div/section/div/div/div/h2[1]"),driver);
		create_board_btn = new seleniumElements(By.cssSelector("div.board-tile"),driver);
		board_title_input = new seleniumElements(By.cssSelector(".nch-textfield__input"),driver);
		board_create_btn = new seleniumElements(By.xpath("/html/body/div[3]/div/section/div/form/button"),driver);



	}





}
