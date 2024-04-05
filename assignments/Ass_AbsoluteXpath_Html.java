package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_AbsoluteXpath_Html {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/61066132/OneDrive%20-%20LTIMindtree/Documents/learningHTML1.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//html/body/input)[1]")).sendKeys("Suriya");
		driver.findElement(By.xpath("(//html/body/input)[2]")).sendKeys("I have a Hint");
		driver.findElement(By.xpath("(//html/body/input)[3]")).sendKeys("Password@123");
		driver.findElement(By.xpath("(//html/body/form/input)[1]")).sendKeys("Devi");
		//driver.findElement(By.xpath("(//html/body/form/input)[2]")).sendKeys("Selvaraj");
		//html/body/form/input)[3]
		//driver.findElement(By.xpath("(//html/body/form/input)[3]")).click();
		driver.findElement(By.xpath("((//html/body/form)[2]/input)[1]")).click();
		driver.findElement(By.xpath("((//html/body/form)[2]/input)[2]")).click();
		driver.findElement(By.xpath("((//html/body/form)[2]/input)[3]")).click();
		
		driver.findElement(By.xpath("(//html/body/input)[5]")).click();
		driver.findElement(By.xpath("(//html/body/input)[6]")).click();
		driver.findElement(By.xpath("(//html/body/a)[1]")).click();
		

	}

}
