import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAdvanced {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();

////		driver.findElement(By.xpath("(//table[@role='grid']/tbody/tr[" + row + "]/td[5])")).getText();
//
//		List<WebElement> cols = driver.findElements(By.xpath("(//table[@role='grid'])[2]/thead/tr/th"));
//		int colsSize = cols.size();
//		System.out.println(colsSize);
//		Map<Integer, String> countries = new HashMap();
//
//		List<WebElement> allPages = driver.findElements(By.className("ui-paginator-pages"));
//		System.out.println(allPages.size());
//		//for (int page = 1; page < allPages.size(); page++) {
//			//driver.findElement(By.xpath("//a[text()="+page+"]")).click();
//			for (int i = 1; i < colsSize; i++) {
//				String country = driver.findElement(By.xpath("(//table[@role='grid']/tbody/tr[" + i + "]/td[2])"))
//						.getText();
//				countries.put(i, country);
//				
//				String name = driver.findElement(By.xpath("(//table[@role='grid']/tbody/tr[" + i + "]/td[1])")).getText();
//				String Representative = driver.findElement(By.xpath("(//table[@role='grid']/tbody/tr[" + i + "]/td[3])")).getText();
//				String Join_Date = driver.findElement(By.xpath("(//table[@role='grid']/tbody/tr[" + i + "]/td[4])")).getText();
//				String Status = driver.findElement(By.xpath("(//table[@role='grid']/tbody/tr[" + i + "]/td[5])")).getText();
//				
//				System.out.println("Name:"+name+" "+Representative+" "+Join_Date+" "+Status+" ");
//			}
//		}
		
		
	List<WebElement> headers = driver.findElements(By.tagName("th"));	
	for (WebElement each : headers) {
		System.out.println(each.getText());
	}
	
	List<WebElement> body = driver.findElements(By.className("ui-datatable-data ui-widget-content"));
		
	for(WebElement each : body)
	{
		
	}
	
	}

	}
//}
