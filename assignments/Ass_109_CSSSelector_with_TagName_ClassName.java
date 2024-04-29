package Suriya.Selenium_Maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_109_CSSSelector_with_TagName_ClassName {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search_tf = driver.findElement(By.cssSelector("textarea.gLFyf"));
		search_tf.sendKeys("India");
		//driver.close();

	}

}
