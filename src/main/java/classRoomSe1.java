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

//	List<WebElement> rows = driver.findElements(By.xpath("//span[text='QUALIFIED']"));
//	int i =0;
//	for (WebElement row : rows) {
//		if(row.getText().equals("QUALIFIED"))
//		{
//			WebElement ele = driver.findElement("//*[text()='Status']//following::td[i]");
//		}
//	}

		// No.of Columns
		List<WebElement> cols = driver.findElements(By.xpath("//table[@role='grid'])[2]/tbody/tr"));
		int colsSize = cols.size();
		System.out.println("No of cols are : " + colsSize);

		// No.of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@role='grid'])[2]/thead/tr/th"));
		int rowsSize = rows.size();
		System.out.println("No of rows are : " + rowsSize);
		
		for (int row = 1; row <= rowsSize; row++) {
            String status = driver.findElement(By.xpath("(//table[@role='grid']/tbody/tr[" + row + "]/td[5])")).getText();
            if (status.equals("NEGOTIATION") || status.equals("QUALIFIED")) {
                String name = driver.findElement(By.xpath("(//table[@role='grid']/tbody/tr[" + row + "]/td[1])")).getText();
                System.out.println("Name for status " + status + ": " + name);
            }
		
//		// To find third row of table
//		WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
//		String rowtext = tableRow.getText();
//		System.out.println("Third row of table : " + rowtext);
//
//		// to get 3rd row's 2nd column data
//		WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
//		String valueIneed = cellIneed.getText();
//		System.out.println("Cell value is : " + valueIneed);
		
		
		// *[@id='Grid']/table
		// Number of columns
		//List<WebElement> cols = driver.findElements(By.xpath("//th[@scope='col']"));

		// *[text()='Status']following::td[1]
//	rows.get(1);
//	System.out.println(rows.get(1));

		// span[text='QUALIFIED']

	}
	}
}
