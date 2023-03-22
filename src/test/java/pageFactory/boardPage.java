package pageFactory;

import browserFactory.browserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import seleniumElements.seleniumElements;

public class boardPage {
	browserFactory browser;
	WebDriver driver;
	public seleniumElements board_title;

	public boardPage(WebDriver driver){
		this.driver = driver;
		WiniumElements();
	}
	public void WiniumElements(){
		board_title = new seleniumElements(By.xpath("//h1[@class='js-board-editing-target board-header-btn-text' and text()='Test']"),driver);

	}





}
