package task17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		// load URL
		driver.get("https://demoblaze.com/index.html#");

		// maximize browser
		driver.manage().window().maximize();

		// selecting laptops
		driver.findElement(By.xpath("//a[@id=\"itemc\"][2]")).click();

		// Select the first Laptop from the result
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class=\"hrefch\"])[1]")).click();

		// Proceed with Add to Cart
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class=\"btn btn-success btn-lg\"]")).click();

	}

}
