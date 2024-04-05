package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_97_Google_Displayed_Enabled {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement search_tf = driver.findElement(By.xpath("(//textarea)[1]"));
		//boolean ans = search_tf.isDisplayed();
		//System.out.println(ans);
		if(search_tf.isDisplayed()==true && search_tf.isEnabled()==true) {
			search_tf.sendKeys("India");

	}

	}
}
