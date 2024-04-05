package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_79_Amazon_LogIn {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	
	driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to="
			+ "https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs"
			+ ".openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode="
			+ "checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2."
			+ "0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	
	WebElement mobile_no =driver.findElement(By.id("ap_email"));
	mobile_no.sendKeys("9791837256");
	WebElement continue_btn=driver.findElement(By.xpath("//input[@class='a-button-input']"));
	continue_btn.click();
	WebElement password =driver.findElement(By.id("ap_password"));
	password.sendKeys("Sudikuty11@");
	WebElement signIn_btn=driver.findElement(By.id("signInSubmit"));
	signIn_btn.click();
	
	}

}
