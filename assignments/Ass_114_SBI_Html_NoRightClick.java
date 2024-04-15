package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_114_SBI_Html_NoRightClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement login_btn =driver.findElement(By.xpath("(//a[.='CONTINUE TO LOGIN'])[1]"));
		login_btn.click();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Suriya");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("test123");
		
		
		
		
		
		
		

	}

}
