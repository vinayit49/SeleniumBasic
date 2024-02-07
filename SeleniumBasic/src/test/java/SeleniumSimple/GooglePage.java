package SeleniumSimple;

import java.util.List;

import org.openqa.jetty.html.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePage {

	public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver", "C:\Users\New\eclipse-workspace\Vinay\SeleniumBasic\driver\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println("The title is:"+driver.getTitle());
		System.out.println("The URL is:"+driver.getCurrentUrl());
		driver.findElement(By.id("APjFqb")).sendKeys("Capgemini");
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
        
        Thread.sleep(3000);

        //Links
       List <WebElement>links=driver.findElements(By.tagName("a"));
        for(int i=0;i<=links.size();i++)
        {
        	WebElement element=links.get(i);
        	System.out.println("The links are:" +links);
        	
        	
        	
        }
        
        WebElement n=driver.findElement(By.id("countries"));
        Select s = new Select(n);
        s.selectByVisibleText("India");
        String s1=s.getFirstSelcectedOptions().getText();
        System.out.println("The value is:" +s1);
        
        
        
        
        
        
        
	}

}
