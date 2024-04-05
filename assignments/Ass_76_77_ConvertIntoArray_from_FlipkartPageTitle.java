package assignments;

import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_76_77_ConvertIntoArray_from_FlipkartPageTitle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		   
		title = title.replaceAll("[^a-zA-Z0-9]", " ");  
		System.out.println(title);
		String[] words = title.split("\\s+");
		
		
		System.out.println(Arrays.toString(words));
		driver.close();

	}

}
