package assignments;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ass_86_90_Amazon_RelativeXpath_ClickFirstShoe {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//Thread.sleep(10000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input)[5]")).sendKeys("shoes");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span)[25]")).click();
		driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")).click();
		
	}

}
