package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_87_Facebook_Login {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
		String title =driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		WebElement email_Address =driver.findElement(By.xpath("//input[@name='email']"));
		email_Address.sendKeys("suriyadevi06@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("Hanikuty20-@");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		

	}

}
