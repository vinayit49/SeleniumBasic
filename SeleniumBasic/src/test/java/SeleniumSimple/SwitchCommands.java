package SeleniumSimple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchCommands {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//1. Open link https://blazedemo.com/
		driver.get("https://blazedemo.com/");
		Thread.sleep(3000);
		
		//2. Select Portland from departure city.
		WebElement ele=driver.findElement(By.name("fromPort"));
		Select sle=new Select(ele);
		sle.selectByVisibleText("Portland");
		Thread.sleep(2000);
		
		//3. Select London from destination city.
		
		WebElement ele1=driver.findElement(By.name("toPort"));
		Select sle1=new Select(ele1);
		sle1.selectByVisibleText("London");
		Thread.sleep(2000);
		//4. Click on Find Flights.
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//5. Find How many flights displayed (from Portland to London)
		
		//6. Click on choose this flight button (2nd button).
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		//7. Verify the details below displayed.
	//	8. Provide all the detail and click on Purchase Flight button.
		driver.findElement(By.id("inputName")).sendKeys("Inapanurthi");
		driver.findElement(By.id("address")).sendKeys("Jaggayyapet");
		driver.findElement(By.id("city")).sendKeys("Vijayawada");
		driver.findElement(By.id("state")).sendKeys("Andhrapradesh");		
		driver.findElement(By.id("zipCode")).sendKeys("521175");			
		Thread.sleep(2000);
		WebElement ele3=driver.findElement(By.name("cardType"));
		Select sle3=new Select(ele3);
		sle3.selectByVisibleText("American Express");
		driver.findElement(By.name("creditCardNumber")).sendKeys("56789456");
		driver.findElement(By.name("nameOnCard")).sendKeys("vinay");
		driver.findElement(By.name("rememberMe")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	
}
}
