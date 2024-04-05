package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_78_Google_Search {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search_tf =driver.findElement(By.id("APjFqb"));
		search_tf.sendKeys("India");
		Thread.sleep(2000);
		search_tf.sendKeys(Keys.ENTER);

	}

}
