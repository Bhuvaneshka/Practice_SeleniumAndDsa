package Docker;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DocketImplementation {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");

		// Set the URL of the Selenium Grid Hub
		String seleniumGridUrl = "http://13.53.150.176:4444/wd/hub";

		// Create a new instance of the Chrome driver
		RemoteWebDriver driver = new RemoteWebDriver(new URL(seleniumGridUrl), capabilities);

		// Open the website
		driver.get("https://www.google.com");

		// Print the title of the website
		System.out.println("Page title is: " + driver.getTitle());

		String browserVersion = driver.getCapabilities().getBrowserVersion();
		System.out.println(browserVersion);

		// Close the browser
		driver.quit();
	}
}
