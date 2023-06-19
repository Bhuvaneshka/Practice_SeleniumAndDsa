package mandatoryHomeWork.Selenium;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

		driver.findElement(By.id("project-create.create-form.name-field.input")).sendKeys("Test Project");
		driver.findElement(By.id("project-create.create-form.advanced-dropdown.key-field.input")).sendKeys("TT");

		driver.findElement(By.xpath("//span[text()='Next']")).click();

		driver.findElement(By.xpath("//*[text()='Go To Projects']")).click();

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
			System.out.println("In Progress is Present");
		}
		
		driver.findElement(By.xpath("//span[text()='Backlog']")).click();
		
		WebElement addDates = driver.findElement(By.xpath("//span[text()='Add dates']"));
		
		addDates.click();
		
		WebElement sprintNameField = driver.findElement(By.xpath("//input[@name='sprintName']"));
		sprintNameField.clear();
		sprintNameField.sendKeys(" Project_Name - Sprint_1_2W");
		
		Select dd = new Select(driver.findElement(By.xpath("//*[@data-test-id='software-sprint-form-components.ui.sprint-period.sprint-duration.select']")));
		dd.selectByValue("2 weeks");
		
		driver.findElement(By.xpath("//span[text()='Update']")).click();
	
		boolean isEnabled = driver.findElement(By.xpath("//span[text()='Start sprint']")).isEnabled();
		
		if(isEnabled==false)
		{
			System.out.println("The Sprint button is disabled");
		}
		
		driver.findElement(By.xpath("//span[text()='Create']")).click();
		
	}
}
