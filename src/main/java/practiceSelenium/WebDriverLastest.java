package practiceSelenium;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverLastest {
	
//	<version>4.9.0</version>
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://id.atlassian.com/login");
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("letsmailbhuvanesh@gmail.com");
		
		WebElement continueButton = driver.findElement(By.xpath("//*[text()='Continue']"));
		continueButton.click();
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Easytravel@06");
		
		WebElement loginButton = driver.findElement(By.xpath("//*[text()='Log in']"));
		loginButton.click();
		
		driver.findElement(By.xpath("//div[text()='Jira Software']")).click();
		
		WebElement addIcon = driver.findElement(By.id("createGlobalItem"));
		addIcon.click();
		
		List<WebElement> options = driver.findElements(By.xpath("//*[@id='assignee-field-label']/following::div[2]"));
		Random rand = new Random();
		int list= rand.nextInt(options.size());
		options.get(list).click();
		
		WebElement summaryField = driver.findElement(By.id("summary-field"));
		summaryField.sendKeys("Test Summary");
		
		WebElement createButton = driver.findElement(By.xpath("//*[@form='issue-create.ui.modal.create-form']"));
		createButton.click();
	}
}
