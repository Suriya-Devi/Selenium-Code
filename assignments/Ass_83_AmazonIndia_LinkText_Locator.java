package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_83_AmazonIndia_LinkText_Locator {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement mobile_Link =driver.findElement(By.linkText("Mobiles"));
		mobile_Link.sendKeys(Keys.ENTER);

	}

}
