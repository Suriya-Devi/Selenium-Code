package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_119_Amazon_Clickelement_KeysMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search_tf =driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		search_tf.sendKeys("wallet");
		search_tf.sendKeys(Keys.ENTER);
		

	}

}
