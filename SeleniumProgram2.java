package SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumProgram2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.navigate().to("https://www.demoblaze.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println("The title of the page is "+title);
		
		if(title.equals("STORE")) {
			System.out.println("Page landed on correct website");}
			else {
				System.out.println("Page not landed on correct website");
		}
		driver.close();
	}
	}


