package Suriya.Selenium_Maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ass_110_CSSSelector_with_AN_AV {

public static void main(String[] args) {
	Ass_110_CSSSelector_with_AN_AV a1 = new Ass_110_CSSSelector_with_AN_AV();
	a1.search_Google();
}
	public void search_Google() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search_tf = driver.findElement(By.cssSelector("[name='q']"));
		search_tf.sendKeys("India");
	}
}
