package assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_117_Naukri_GetWindowHandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//button[@name='google-register']")).click();
		driver.findElement(By.xpath("//span[.='Google']")).click();
		
		Set<String> parent_ctrl =driver.getWindowHandles();
		System.out.println(parent_ctrl);
		Iterator<String> i1 =parent_ctrl.iterator();
		String parent_window =i1.next();
		String child_window =i1.next();
		driver.switchTo().window(child_window);
		driver.quit();

	}

}
