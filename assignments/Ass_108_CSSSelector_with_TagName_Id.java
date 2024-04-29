package Suriya.Selenium_Maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_108_CSSSelector_with_TagName_Id {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search_tf = driver.findElement(By.cssSelector("textarea#APjFqb"));
		search_tf.sendKeys("Bangalore");
        //driver.close();
	}

}
