package SeleniumSimple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchProduct {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	//1. Open link http://automationpractice.com/index.php
		driver.get("https://www.limeroad.com/");
	
		//2. Move your cursor over Women's link.
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"shopWomen\"]/svg")).click();
     
	}

}
