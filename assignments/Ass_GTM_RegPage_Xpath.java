package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass_GTM_RegPage_Xpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement email =driver.findElement(By.xpath("//input[@class='email form-control inp']"));
		email.sendKeys("suriyadevi06@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@class='password form-control']"));
		password.sendKeys("password@123");
		WebElement radio_btn = driver.findElement(By.xpath("//input[@class='Female form-check-input']"));
		radio_btn.click();
		WebElement skill_dd= driver.findElement(By.xpath("//select[@class='Skills ss form-control']"));
		Select s = new Select(skill_dd);
		s.selectByValue("select1");
		
		WebElement country_dd= driver.findElement(By.xpath("//select[@class='Country ss form-control']"));
		Select s1 = new Select(country_dd);
		s1.selectByVisibleText("India ");
		
		WebElement present_add = driver.findElement(By.xpath("//textarea[@class='Present-Address form-control']"));
		present_add.sendKeys("RR Nagar,Bengaluru");
		
		WebElement permanent_add = driver.findElement(By.xpath("//textarea[@class='Permanent-Address form-control']"));
		permanent_add.sendKeys("RR Nagar,Bengaluru");
		
		WebElement pincode = driver.findElement(By.xpath("//input[@class='Pincode form-control']"));
		pincode.sendKeys("560098");
		
		WebElement religion_dd = driver.findElement(By.xpath("//select[@class='Relegion ss form-control']"));
		Select s2 = new Select(religion_dd);
		s2.selectByIndex(1);
		Thread.sleep(5000);
		//not working for checkbox
		WebElement relocate_checkbox = driver.findElement(By.xpath("//input[@id='relocate']"));
		relocate_checkbox.click();
		

	}

}
