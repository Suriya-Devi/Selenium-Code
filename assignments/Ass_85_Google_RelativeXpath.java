package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_85_Google_RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search_txt =driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		search_txt.sendKeys("India");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]")).click();

	}

}
