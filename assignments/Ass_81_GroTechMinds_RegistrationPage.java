package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass_81_GroTechMinds_RegistrationPage {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("suriyadevi06@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Student123@");
		driver.findElement(By.id("Female")).click();
		
		driver.findElement(By.name("Present-Address")).sendKeys("RR Nagar,Bengaluru");
		driver.findElement(By.name("Permanent-Address")).sendKeys("Gandhi Nagar,Coimbatore");
		driver.findElement(By.name("Pincode")).sendKeys("560098");
		//Thread.sleep(3000);
		//driver.findElement(By.className("btn btn-primary")).click();

	}

}
