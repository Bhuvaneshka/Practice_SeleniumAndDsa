package mandatoryHomeWork.selenium;

import java.sql.Time;
import java.util.concurrent.TimeUnit;
import org.joda.time.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumScenario6 {

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

		driver.findElement(By.xpath("//span[@aria-label='Appswitcher Icon']")).click();

		WebElement jiraText = driver.findElement(By.xpath("//span[text()='Jira Software']"));

		boolean enabled = jiraText.isEnabled();

		if (enabled == true) {
			System.out.println("The Jira Software is available");
		}
		driver.findElement(By.xpath("//span[text()='Jira Software']")).click();

		WebElement image = driver
				.findElement(By.xpath("//*[text()='You currently have no projects']//preceding::img[1]"));

		boolean displayed = image.isDisplayed();
		if (displayed == true) {
			System.out.println("The icon is present in the paeg");
		}

		WebElement projectText = driver.findElement(By.xpath("//h4[text()='You currently have no projects']"));
		boolean displayed2 = projectText.isDisplayed();
		if (displayed2 == true) {
			System.out.println("The no project text is present");
		}

		WebElement createProjectButton = driver.findElement(By.xpath("//span[text()='Create project']"));
		boolean enabled2 = createProjectButton.isEnabled();

		if (enabled2 == true) {
			System.out.println("The Create project Button is enabled");
		}

		createProjectButton.click();

		driver.findElement(
				By.xpath("//p[text()='Sprint toward your project goals with a board, backlog, and roadmap.']")).click();
		driver.findElement(By.xpath("//span[text()='Use template']")).click();
		driver.findElement(By.xpath("//span[text()='Select a team-managed project']")).click();

		WebElement projectName = driver.findElement(By.id("project-create.create-form.name-field.input"));
		projectName.sendKeys("Test Project");
		projectName.sendKeys(Keys.ENTER);

		// driver.findElement(By.id("project-create.create-form.advanced-dropdown.key-field.input")).sendKeys("TT");

		driver.findElement(By.xpath("//span[text()='Next']")).click();

		driver.findElement(By.xpath("//*[text()='Go To Projects']")).click();

		driver.findElement(By.xpath("//span[@data-test-id='favouriting.favourite-button-stateless.icon-wrapper']"))
				.click();

		boolean toDo = driver.findElement(By.xpath("//div[text()='To Do']")).isDisplayed();
		if (toDo == true) {
			System.out.println("To-Do is Present");
		}

		boolean inProgress = driver.findElement(By.xpath("//div[text()='In Progress']")).isDisplayed();
		if (inProgress == true) {
			System.out.println("In Progress is Present");
		}

		boolean done = driver.findElement(By.xpath("//div[text()='Done']")).isDisplayed();
		if (done == true) {
			System.out.println("Done is Present");
		}

		driver.findElement(By.xpath("//span[text()='Backlog']")).click();

		String noSprints = driver.findElement(By.xpath("//div[text()='TEST Sprint 1']//following::div[3]")).getText();
		if (noSprints.equals("0 issues")) {
			System.out.println("There is no sprints started");
		}

		WebElement addDates = driver.findElement(By.xpath("//span[text()='Add dates']"));

		addDates.click();
		
		//driver.findElement(By.xpath("//div"))

		WebElement sprintNameField = driver.findElement(By.xpath("//input[@name='sprintName']"));
		sprintNameField.clear();
		sprintNameField.sendKeys(" Project_Name - Sprint_1_2W");

		Select dd = new Select(driver.findElement(By.xpath(
				"//*[@data-test-id='software-sprint-form-components.ui.sprint-period.sprint-duration.select']")));
		dd.selectByValue("2 weeks");

		driver.findElement(By.xpath("//span[text()='Update']")).click();

		boolean isEnabled = driver.findElement(By.xpath("//span[text()='Start sprint']")).isEnabled();

		if (isEnabled == false) {
			System.out.println("The Sprint button is disabled");
		}

		driver.findElement(By.xpath("//div[text()='Create issue']")).click();

		driver.findElement(By.xpath("//img[@alt='Task']")).click();

		driver.findElement(By.xpath("//span[text()='Story']")).click();

		WebElement textArea1 = driver.findElement(By.xpath("//textarea[@placeholder='Add a task you’re working on']"));
		textArea1.sendKeys("Test 1");
		textArea1.sendKeys(Keys.ENTER);

		boolean bugId1 = driver.findElement(By.xpath("//a[text()='TEST-2']")).isDisplayed();
		if (bugId1 == true) {
			System.out.println("New Item created & Verified");
		}

		WebElement textArea2 = driver.findElement(By.xpath("//textarea[@placeholder='Add a task you’re working on']"));
		textArea2.sendKeys("Test 2");
		textArea2.sendKeys(Keys.ENTER);

		boolean bugId2 = driver.findElement(By.xpath("//a[text()='TEST-3']")).isDisplayed();
		if (bugId2 == true) {
			System.out.println("New Item created & Verified");
		}

		driver.findElement(By.xpath("//img[@alt='Story']")).click();

		driver.findElement(By.xpath("//span[text()='Bug']")).click();
		
		
		WebElement bug1 = driver.findElement(By.xpath("//textarea[@placeholder='Add a task you’re working on']"));
		bug1.sendKeys("Bug 1");
		bug1.sendKeys(Keys.ENTER);

		boolean bugId3 = driver.findElement(By.xpath("//a[text()='TEST-4']")).isDisplayed();
		if (bugId3 == true) {
			System.out.println("New Item created & Verified");
		}

		WebElement bug2 = driver.findElement(By.xpath("//textarea[@placeholder='Add a task you’re working on']"));
		bug2.sendKeys("Bug 2");
		bug2.sendKeys(Keys.ENTER);

		boolean bugId4 = driver.findElement(By.xpath("//a[text()='TEST-5']")).isDisplayed();
		if (bugId4 == true) {
			System.out.println("New Item created & Verified");
		}
		
		WebElement startSprintButton = driver.findElement(By.xpath("//span[text()='Start sprint']"));
		boolean isEnabled1 = startSprintButton.isEnabled();
		if(isEnabled1==true)
		{
			System.out.println("The start sprint button is enabled");
		}
		
		startSprintButton.click();
		
		driver.findElement(By.xpath("//span[text()='Start']")).click();
		
		boolean sprintStarted = driver.findElement(By.xpath("//span[text()='Sprint started']")).isDisplayed();
		if(sprintStarted==true)
		{
			System.out.println("The Sprint has Started");
		}
		
		driver.findElement(By.xpath("//span[@aria-label='Dismiss']")).click();
		
		LocalTime localTime = new LocalTime();
	}
}
