package SeleniumProject;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumProgram3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);

        try {
            // Navigate to Wikipedia
            driver.get("http://www.wikipedia.org/");

            // Locate the search input and enter the query
            WebElement searchInput = driver.findElement(By.name("search"));
            searchInput.sendKeys("artificial intelligence");
            searchInput.submit(); // Submit the search

            // Wait until the search results page is loaded and the "History" link is visible
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
            WebElement historyLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("History")));

            // Click on the "History" section link
            historyLink.click();

            String title = driver.getTitle();
    		System.out.println("The title of the page is "+title);
        } finally {
        	
        }
        driver.close();
	}}