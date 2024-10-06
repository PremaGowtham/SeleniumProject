package SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumProgram1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println("The Title of Google is " +title);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.close();

	}

}
