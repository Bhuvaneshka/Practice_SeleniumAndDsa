package mandatoryHomeWork.selenium;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment2_Amazon {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

//		1.Load the URL https://www.amazon.in/
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		2.search as oneplus 9 pro
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();

//		3.Get the price of the first product
		String priceOfFirstProduct = driver
				.findElement(By.xpath("//span[text()='Results']//following::span[@class='a-price-whole']")).getText();
		System.out.println("Price of the first product is" + priceOfFirstProduct);

//		4. Print the number of customer ratings for the first displayed product
		String noOfratings = driver.findElement(By.xpath(
				"//span[text()='Results']//following::div[@class='a-section a-spacing-none a-spacing-top-micro']//span[2]"))
				.getText();
		System.out.println("The Number of customer Rating is" + noOfratings);

//		5. Click the first text link of the first image
		driver.findElement(By
				.xpath("//span[text()='Results']//following::span[@class='a-size-medium a-color-base a-text-normal']"))
				.click();
		
		//handle the window
			ArrayList<String> al = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(al.get(1));

//		6. Take a screen shot of the product displayed
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File source = screenShot.getScreenshotAs(OutputType.FILE);

//		7. Click 'Add to Cart' button
		driver.findElement(By.xpath("//input[@id='add-to-cart-button' and @title='Add to Shopping Cart']")).click();

//		8. Get the cart subtotal and verify if it is correct.
		String subTotalAmount = driver.findElement(By.xpath("//b[text()='Cart subtotal']//following::span")).getText();
		System.out.println(subTotalAmount);
		if (subTotalAmount.equals(priceOfFirstProduct) == true) {
			System.out.println("The Amount of the product is verified in subtotal");
		} else {
			System.out.println("The Amount of the product is different in subtotal");
		}

//		9.close the browser
		driver.close();

	}
}
