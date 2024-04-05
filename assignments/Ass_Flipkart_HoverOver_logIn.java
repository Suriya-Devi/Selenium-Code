package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass_Flipkart_HoverOver_logIn {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement login =driver.findElement(By.xpath("//span[.='Login']"));
		Actions a1= new Actions(driver);
		a1.moveToElement(login).perform();
		WebElement signUp = driver.findElement(By.xpath("//span[.='Sign Up']"));
		signUp.click();
		
		WebElement existing_user = driver.findElement(By.xpath("//span[.='Existing User? Log in']"));
		existing_user.click();
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		email.sendKeys("suriyadevi06@gmail.com");
		driver.findElement(By.xpath("//button[.='Request OTP']")).click();
		//Thread.sleep(10000);
		
		

	}

}
