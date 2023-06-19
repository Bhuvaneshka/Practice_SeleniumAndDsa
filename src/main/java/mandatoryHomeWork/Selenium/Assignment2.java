package mandatoryHomeWork.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
//		1. Launch URL
//		"http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
//		3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
//		4. Click on CRM/SFA Link
		driver.findElement(By.xpath("//div[@for='crmsfa']")).click();
		
//		5. Click on Leads Button
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
//		6. Click on Create Lead
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
//		7. Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
//		8. Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bhuvanesh");
		
//		9. Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K A");
		
//		10. Enter FirstName(Local) Field Using id Locator4
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Bhuvi");
		
//		11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Baii");
		
//		12. Enter Description Field Using any Locator of your choice
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Description");
		
//		13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testmail@gmail.com");
		
//		14. Select State/Province as NewYork Using Visible Text
		Select options = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		options.selectByVisibleText("New York");
		
//		15. Click on Create Button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
//		16. Click on edit button
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
//		17. Clear the Description Field using .clear()
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
//		18. Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("some importent notes");
		
//		19. Click on update button
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
//		20. Validate the Title of Resulting Page
		System.out.println(driver.getTitle().equals("View Lead | opentaps CRM"));
	}
	
	

}
