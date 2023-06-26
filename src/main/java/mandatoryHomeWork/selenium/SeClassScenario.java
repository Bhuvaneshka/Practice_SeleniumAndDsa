package mandatoryHomeWork.selenium;
import java.awt.Window;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeClassScenario {

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

		// Click on the Projects
		driver.findElement(By.xpath("//span[text()='Projects']")).click();

		// Click on "View All Projects"
		driver.findElement(By.xpath("//span[text()='View all projects']")).click();

		// Enter the value in Search bar
		WebElement searchField = driver.findElement(By.xpath("//input[@id='searchfield' or @name='search']"));
		searchField.sendKeys("Test");
		searchField.sendKeys(Keys.ENTER);

		// validate the text
		WebElement expectedText = driver.findElement(By.xpath(
				"//*[text()='Create a new software project to plan, track, and release great software with your team.']//preceding::h4"));
		String actualText = expectedText.getText();
		boolean result = expectedText.equals(actualText);
		if (result == false) {
			System.out.println("There is no matching project");
		}

		searchField.sendKeys(Keys.ESCAPE);

		// Enter the valid project name
		searchField.sendKeys("SDET 23");
		searchField.sendKeys(Keys.ENTER);

		// click on the project name
		driver.findElement(By.xpath("//span[text()='SDET 23']")).click();

		// collect the number of items
		List<WebElement> findElements = driver.findElements(By.xpath("//*[@alt='Task']"));
		System.out.println("Number of Issues in the Board" + findElements.size() + 1);

		// Open a new Tap
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://bhuvaneshkvp.atlassian.net/jira/software/projects/S2/boards/1");

		// get window handles
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {

			driver.switchTo().window(windowHandle);
		}

		// click on the create button
		driver.findElement(By.id("createGlobalItem")).click();

		WebElement summaryField = driver.findElement(By.id("summary-field"));
		summaryField.sendKeys("Newly created Summary");

		WebElement createButton = driver.findElement(By.xpath("//*[@form='issue-create.ui.modal.create-form']"));
		createButton.click();

		// go back to old tab
		driver.switchTo().window(windowHandles.iterator().next());
		driver.navigate().refresh();

		//Check the bug is created or not
		WebElement newlyCreated = driver.findElement(By.xpath("//*[text()='Newly created Summary']"));
		if (newlyCreated.isDisplayed()) {
			System.out.println("New bug created");
		} else {
			System.out.println("The bug is not created yet");
		}
		
		// click on the create button
		driver.findElement(By.id("createGlobalItem")).click();
		
		driver.findElement(By.id("summary-field")).sendKeys("Bug to check");
		
		//Click on the Linked Issues dropdown
		driver.findElement(By.xpath("//*[@id='issuelinks-field-label']//following::div[3]")).click();
		
		//Click on the blocks option
		driver.findElement(By.xpath("//*[text()='blocks']")).click();
		
		//click on create button
		driver.findElement(By.xpath("//*[text()='Create']")).click();
		
		//click on the newly created bug
		driver.findElement(By.xpath("//*[text()='Bug to check']")).click();
		
		//Click on the TO Do dropdown
		driver.findElement(By.xpath("//*[text()='To Do']")).click();
		
		//Click on the Done option
		driver.findElement(By.xpath("//*[text()='Done']")).click();
		
		
	}
}
