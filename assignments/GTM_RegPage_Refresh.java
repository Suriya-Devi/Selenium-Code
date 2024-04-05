package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GTM_RegPage_Refresh {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registeration-form/");
		WebElement first_name =driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		first_name.sendKeys("Suriya");
		WebElement last_name = driver.findElement(By.xpath("//input[@id='lastName']"));
		last_name.sendKeys("Devi");
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("suriyadevi06@gmail.com");
		WebElement phone_no = driver.findElement(By.xpath("//input[@pattern='[0-9]{10}']"));
		phone_no.sendKeys("2353454546");
		WebElement gender_dd = driver.findElement(By.xpath("(//select)[1]"));
		Select s = new Select(gender_dd);
		s.selectByValue("female");
		WebElement state_dd =driver.findElement(By.id("state"));
		Select s1  = new Select(state_dd);
		s1.selectByVisibleText("Karnataka");
		WebElement aadhar_tf = driver.findElement(By.id("aadhaar"));
		aadhar_tf.sendKeys("343242354433");	
		WebElement pan = driver.findElement(By.name("pan"));
		pan.sendKeys("ABCDE3456F");
		WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		checkbox.click();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		WebElement first_name1 =driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		first_name1.sendKeys("Selva");
		WebElement last_name1 = driver.findElement(By.xpath("//input[@id='lastName']"));
		last_name1.sendKeys("Suriya");
		WebElement email1 = driver.findElement(By.xpath("//input[@name='email']"));
		email1.sendKeys("selvasuriya06@gmail.com");
		WebElement phone_no1 = driver.findElement(By.xpath("//input[@pattern='[0-9]{10}']"));
		phone_no1.sendKeys("4567354546");
		WebElement gender_dd1 = driver.findElement(By.xpath("(//select)[1]"));
		Select s2 = new Select(gender_dd1);
		s2.selectByValue("female");
		WebElement state_dd1 =driver.findElement(By.id("state"));
		Select s3  = new Select(state_dd1);
		s3.selectByVisibleText("Karnataka");
		WebElement aadhar_tf1 = driver.findElement(By.id("aadhaar"));
		aadhar_tf1.sendKeys("343242354433");	
		WebElement pan1 = driver.findElement(By.name("pan"));
		pan1.sendKeys("ABCDE3456F");
		
		WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		checkbox1.click();
		Thread.sleep(2000);
		WebElement submit_btn =driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		submit_btn.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		

	}

}
