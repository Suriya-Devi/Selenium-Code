package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_88_Flipkart_Text {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement Mobiles = driver.findElement(By.xpath("(//span[.='Mobiles'])[1]"));
		//Mobiles.sendKeys(Keys.CONTROL);
		Thread.sleep(2000);
		Mobiles.click();
		
		

	}

}
