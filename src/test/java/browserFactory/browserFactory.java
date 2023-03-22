package browserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.remote.RemoteWebDriver;

public class browserFactory {
public static WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	public WebDriver browserInstance(String browser, boolean remote) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			options.addArguments("--remote-allow-origins=*");
			if(remote) {
				tlDriver.set(new RemoteWebDriver(options));
			} else {
				tlDriver.set(new ChromeDriver(options));
			}
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions foptions = new FirefoxOptions();
			foptions.addArguments("--private");
			if(remote) {
				tlDriver.set(new RemoteWebDriver(foptions));
			} else {
				tlDriver.set(new FirefoxDriver(foptions));
			}
		}
		getdriver().manage().window().maximize();
		return getdriver();
	}
	public static synchronized WebDriver getdriver() {
		return tlDriver.get();
	}
}
