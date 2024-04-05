package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass_91_Amazon_DropdownSelect {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.xpath("(//select)[1]"));
		
		Select s1 = new Select(dropdown);
		//s1.selectByIndex(5);
		s1.selectByVisibleText("Books");
		WebElement search_tf=driver.findElement(By.id("twotabsearchtextbox"));
		search_tf.sendKeys("world");
		search_tf.sendKeys(Keys.ENTER);
		WebElement first_pdt=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]"));
		first_pdt.click();
	}

}
