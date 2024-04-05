package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_95_GMT_FileUpload_PopUp {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement file_upload =driver.findElement(By.xpath("//input[@name='file']"));
		file_upload.sendKeys("C:\\Users\\M1066132\\eclipse-workspace\\Java_GroTechMinds_Learnings\\src\\assignments\\Ass_40_Multables4.java");
		

	}

}
