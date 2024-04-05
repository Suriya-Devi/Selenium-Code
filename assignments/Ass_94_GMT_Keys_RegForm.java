package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass_94_GMT_Keys_RegForm {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement present_address =driver.findElement(By.xpath("//textarea[@id='Present-Address']"));
		present_address.sendKeys("RRNagar Bangalore");
		present_address.sendKeys(Keys.CONTROL + "a");
		present_address.sendKeys(Keys.CONTROL + "c");
		WebElement permanent_adress = driver.findElement(By.xpath("//textarea[@id='Permanent-Address']"));
		permanent_adress.sendKeys(Keys.CONTROL + "v");

	}

}
