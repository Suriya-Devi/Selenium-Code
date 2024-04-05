package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_Count_no_of_EmptyLinks_Amazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in");
		driver.manage().window().maximize();
		
		List<WebElement> links =driver.findElements(By.tagName("a"));
		
		int count_of_links =links.size();
		System.out.println("Total no of links are "+count_of_links);
		int count_of_emptyLinks=0;
		for(int i=0;i<count_of_links;i++) {
			WebElement single_link = links.get(i);
			String message = single_link.getText();
			//System.out.println(message);
			boolean empty_link =message.isEmpty();
			if(empty_link == true) {
				count_of_emptyLinks++ ;
			}
		}
		System.out.println("Total no of empty links are "+count_of_emptyLinks);
		

	}

}
