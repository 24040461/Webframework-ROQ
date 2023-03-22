package seleniumElements;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class seleniumElements {
    private By Locator;
    WebDriver Driver;

    public seleniumElements(By locator, WebDriver driver){
        Locator = locator;
        Driver = driver;
    }
    public void click(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.Locator));
        Driver.findElement(this.Locator).click();
    }
    public boolean isDisplayed(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.Locator));
        boolean displayed = Driver.findElement(this.Locator).isDisplayed();
        return displayed;
    }
    public void type(String s){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.Locator));
        Driver.findElement(this.Locator).sendKeys(s);
    }
    public void wordCompare(String wordCompare){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.Locator));
        Assert.assertEquals(wordCompare, Driver.findElement(this.Locator).getText());
    }
}
