package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass_92_GTM_RegPage_dropdowns {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registeration-form/");
		WebElement gender_dd = driver.findElement(By.xpath("(//select)[1]"));
		Select s = new Select(gender_dd);
		s.selectByValue("female");
		WebElement state_dd =driver.findElement(By.id("state"));
		Select s1  = new Select(state_dd);
		s1.selectByVisibleText("Karnataka");

	}

}
