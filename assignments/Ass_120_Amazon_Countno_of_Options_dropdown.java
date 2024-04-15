package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass_120_Amazon_Countno_of_Options_dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select s= new Select(dropdown);
        List<WebElement> list =s.getOptions();
        int count=list.size();
        System.out.println(count);
        
        //All the text of the dropdown
        for(int i=0;i<count;i++) {
        	WebElement single_text =list.get(i);
        	String text =single_text.getText();
        	System.out.println(text);
        	
        }
	}

}
