package hooks;

import java.util.Properties;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import WebApp.Configreader;
import browserFactory.browserFactory;
//import browserFactory.remoteWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class appHooks {
	WebDriver driver = null;
	browserFactory browsers;
	Configreader configreader;
	Properties properties;
	@Before(order = 0)
	public void browserSetup() {	
		configreader = new Configreader();
		properties = configreader.browserReader();
	}
	@Before(order = 1)
	public void browserSetup2() {	
		String browserName = properties.getProperty("browser");
		browsers = new browserFactory();
		driver = browsers.browserInstance(browserName, false);
	}
	@After(order = 0)
	public void teardown() {	
		driver.quit();
	}
	@After(order = 1)
	public void screenshot(Scenario scenario) {
		if(scenario.isFailed()){
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte [] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
		}
	}

}

