package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_98_GTM_IsSelected {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/is-selected/");
		WebElement checkBox = driver.findElement(By.xpath("(//input[@name='vehicle2'])[2]"));
		Thread.sleep(3000);
		checkBox.isSelected();
		if(checkBox.isSelected() ==false) {
			checkBox.click();
		}

	}

}
