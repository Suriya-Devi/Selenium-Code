package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass_104_GTM_DoubleClick_Courses {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/");
		driver.manage().window().maximize();
		WebElement course_tab =driver.findElement(By.partialLinkText("Courses"));
		Actions a1 = new Actions(driver);
		Thread.sleep(2000);
		a1.doubleClick(course_tab).perform();
	
		

	}

}
