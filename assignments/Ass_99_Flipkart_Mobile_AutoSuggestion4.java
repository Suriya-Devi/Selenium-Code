package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ass_99_Flipkart_Mobile_AutoSuggestion4 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("mobile");
		System.out.println(driver.getTitle());
		
		//Thread.sleep(2000);
		
		List<WebElement> auto_Sugg =driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		WebDriverWait w1 = new WebDriverWait(driver,Duration.ofSeconds(5));
		w1.until(ExpectedConditions.titleContains("Online Shopping"));
		int count = auto_Sugg.size();
		System.out.println(count);
		Thread.sleep(3000);
		//auto_Sugg.get(7).click();//mobile holder
		auto_Sugg.get(count - 2).click();

	}

}
