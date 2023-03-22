package pageFactory.global;

import browserFactory.browserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import seleniumElements.seleniumElements;

public class globalElements {
    browserFactory browser;
    WebDriver driver;
    public seleniumElements header;
    public globalElements(WebDriver driver){
        this.driver = driver;
        WiniumElements();
    }
    public void WiniumElements(){
        header = new seleniumElements(By.id("header"),driver);
    }
}
