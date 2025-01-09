package mahantesh.SeleniumFrameworkDesign;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Mahantesh
 *
 */
public class AutomationExercise {		

	@FindBy(xpath = "//div[@id='gh-ac-box2']//input[@type='text']")
    private static WebElement searchBar;
	
	@FindBy(xpath = "//input[@type='submit']")
    private static WebElement searchButton;
	
	@FindBy(xpath = "(//div[@class='s-item__title']//span[@role='heading'])[3]")
	private static WebElement listFirstBook;
	
	
	
	@FindBy(xpath = "(//div[contains(@class,'s-item__image-wrapper')]//img)[3]")
    private static WebElement bookImage;
	
	@FindBy(xpath = "//div[@data-testid='x-item-title']/h1/span")
    private static WebElement bookTitleText;
	
	@FindBy(xpath = "//a[@id='atcBtn_btn_1']")
    private static WebElement addToCartBtn;
	
	@FindBy(xpath = "//i[@id='gh-cart-n']")
    private static WebElement cartUpdateCheckImage;
	
	
	//i[@id='gh-cart-n']
	
	
	//a[@id='atcBtn_btn_1']
	
	
	
	//div[@data-testid='x-item-title']/h1/span
	
		public static void main(String[] args) throws IOException {
			
			try {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver  driver = new ChromeDriver();
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
				driver.get("https://ebay.com");
				driver.manage().window().maximize();
				
		WebElement SearchBar= driver.findElement(By.xpath("//div[@id='gh-ac-box2']//input[@type='text']"));	
				
		        		
		SearchBar.click();
		
		SearchBar.sendKeys("book");
		
		WebElement SearchButton= driver.findElement(By.xpath("//input[@type='submit']"));	
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.visibilityOf((WebElement) SearchButton));		
		
        SearchButton.click();
		
		WebElement bookImage = driver.findElement(By.xpath("(//div[contains(@class,'s-item__image-wrapper')]//img)[3]"));
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.visibilityOf((WebElement) bookImage));
		
	//	WebElement bookImage = driver.findElement(By.xpath("(//div[@class='s-item__title']//span[@role='heading'])[3]");
		
		bookImage.isDisplayed();
		
		WebElement ListFirstBook = driver.findElement(By.xpath("(//div[@class='s-item__title']//span[@role='heading'])[3]"));
		
		ListFirstBook.click();
		
		String titleOftheBook = ListFirstBook.getText();
		System.out.println(titleOftheBook);
		
		
		  try { String title = driver.getTitle();
		  
		  
		  
		  ArrayList<String> handleList = new ArrayList<>(driver.getWindowHandles());
		  
		  if (handleList.size() > 1) {
		  
		  driver.switchTo().window(handleList.get(1)); 
		  }		  
		  
		  
		  } catch (Exception e) { e.printStackTrace(); }
		 
    
	WebElement BookTitleText = driver.findElement(By.xpath("//div[@data-testid='x-item-title']/h1/span"));
        
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait2.until(ExpectedConditions.visibilityOf((WebElement) BookTitleText));
        
		String titleOftheBookCheck = BookTitleText.getText();
		System.out.println(BookTitleText);
		
	// title before clicking on first link and Inside page after clicking on link Book title will be different so
	/*
	 * if(titleOftheBook.trim().equals(titleOftheBookCheck.trim())) {
	 * 
	 * System.out.println("Loading page for first book link has been successful"); }
	 */
	
		WebElement AddToCartBtn = driver.findElement(By.xpath("//a[@id='atcBtn_btn_1']"));
		
		
		AddToCartBtn.isDisplayed();
		
		AddToCartBtn.click();
		
		WebElement CartUpdateCheckImage = driver.findElement(By.xpath("//i[@id='gh-cart-n']"));
		
		String cartUpdateNumber = CartUpdateCheckImage.getText();
		
		System.out.println(cartUpdateNumber);		
		 
			 driver.quit();
		}	

			catch (Exception e){
				e.getMessage();
				
				System.out.println("Test case execution has not been doe");
			}

	}
}


