package mandatoryHomeWork.selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.UrlTemplate.Match;

public class WeeklyAssessment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();

		//		2. Click on the Holidays from the top menu
		driver.findElement(By.xpath("//a[text()='Holidays']")).click();
		
		//		3. Choose From and To City
		Set<String> windowHandles = driver.getWindowHandles();
		for(String each : windowHandles)
		{
			driver.switchTo().window(each);
		}
		
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From' and class='autoSuggest_input']")).sendKeys("Mumbai");
		WebElement from = driver.findElement(By.xpath("//li[@data-testid='Mumbai']"));
		from.click();
		from.sendKeys(Keys.TAB);
		
		driver.findElement(By.xpath("//div[@class='dest-search-list']")).sendKeys("Chennai");
		WebElement destination = driver.findElement(By.xpath("//div[@class='dest-city-name']"));
		destination.click();

		//	4.	Select Date
		
//		5. Select Default room
		driver.findElement(By.xpath("//p[text()='Select Rooms']")).click();
		driver.findElement(By.className("applyBtn")).click();
		
//		6. On the Filter choose with Flight options
		driver.findElement(By.xpath("//div[text()='Select Filters (Optional)']")).click();
		driver.findElement(By.xpath("//lable[text()='With Flights']")).click();
		driver.findElement(By.xpath("//button[text()='APPLY' and @class='action']")).click();
		
//		7. Click Search
		driver.findElement(By.id("search_button")).click();
		
//		8. On the Budget choose between 20K to Max limit
		
//		9. On the search result choose package for 4N with lowest prices of the
//		given filter
		List<WebElement> listOfNights = driver.findElements(By.xpath("//span[@class='daysbadge']"));
		
		List<WebElement> listOf4N = new ArrayList<>();
		for(WebElement each : listOfNights)
		{
			if(each.getText().contains("4N"))
			{
				listOf4N.add(each);
			}
		}
		
		List<WebElement> listOfPrices = driver.findElements(By.xpath("//p[@data-testid='package-actual-price']"));
		int maxValue = Integer.MAX_VALUE;
		int lowestPrice = 0;
		
		for(WebElement eachPrice : listOfPrices)
		{
			int price = Integer.parseInt(eachPrice.getText());
			lowestPrice = Math.min(maxValue, price);
		}

		if(listOf4N.contains("4N") && listOfPrices.contains(lowestPrice) )
		{
			String lowPriceStr = Integer.toString(lowestPrice);
			driver.findElement(By.xpath("//p[text()=''+lowPriceStr+'']")).click();
		}
		
//		10.Validate the trip is planned for 4 days and Price is displayed as same in
//		the before page
		
		
	}
	

}
