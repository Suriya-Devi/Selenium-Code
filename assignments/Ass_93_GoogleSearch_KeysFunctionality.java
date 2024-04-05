package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_93_GoogleSearch_KeysFunctionality {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search_txt =driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		search_txt.sendKeys("India");
		Thread.sleep(2000);
		search_txt.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		search_txt.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		search_txt.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		search_txt.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		search_txt.sendKeys(Keys.ENTER);

	}

}
