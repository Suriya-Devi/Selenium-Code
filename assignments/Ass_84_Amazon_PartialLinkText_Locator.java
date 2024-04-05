package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_84_Amazon_PartialLinkText_Locator {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement customer_partialLink = driver.findElement(By.partialLinkText("Customer"));
		customer_partialLink.sendKeys(Keys.ENTER);

	}

}
