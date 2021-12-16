package marathishadiscript;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.marathishaadi.com/");
		
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//button[@data-testid='lets_begin']")).click();
	Thread.sleep(4000);
	
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shitalsc2021@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shital0903");
		Thread.sleep(4000);
	
		driver.findElement(By.xpath("//div[@class='Dropdown-placeholder']")).click();
		
		driver.findElement(By.xpath("(//*[@class='Dropdown-menu postedby_options']/div)[2]")).click();
		
		driver.findElement(By.xpath("//button[@data-testid='next_button']")).click();
		Thread.sleep(4000);
		
		WebElement community = driver.findElement(By.xpath("(//*[@class='Dropdown-placeholder is-selected'])[2]"));
	
		String actual=community.getText();
		
		  Assert.assertEquals("Marathi",actual);
		  if(actual.equals("Marathi")) {
			  System.out.println("verification is successful result is: "+actual);
			  
		  }
		  else {
			  System.out.println("verification is not successful");
		  }
	
		driver.quit();
	
		
		  
		  

	}

}
