package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_80_Facebook_LogIn {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
		String title =driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("suriyadevi06@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Hanikuty20-@");
		driver.findElement(By.id("loginbutton")).click();
		

	}

}
