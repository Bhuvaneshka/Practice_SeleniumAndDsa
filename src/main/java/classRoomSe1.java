import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classRoomSe1 {

	public static void main(String[] args) {
		
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.leafground.com/table.xhtml");
	driver.manage().window().maximize();
	
	List<WebElement> rows = driver.findElements(By.xpath("//span[text='QUALIFIED']"));
	int i =0;
	for (WebElement row : rows) {
		if(row.getText().equals("QUALIFIED"))
		{
			WebElement ele = driver.findElement("//*[text()='Status']//following::td[i]");
		}
	}
	
	//*[@id='Grid']/table
	//Number of columns
	List<WebElement> cols = driver.findElements(By.xpath("//th[@scope='col']"));
	for (int j = 0; j < cols.size(); j++) {
		cols.get
	}
	
	//*[text()='Status']following::td[1]
//	rows.get(1);
//	System.out.println(rows.get(1));
	
	
	//span[text='QUALIFIED']
	}

}
