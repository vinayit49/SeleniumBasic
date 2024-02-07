package SeleniumSimple;

import org.openqa.jetty.html.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	      //implicit wait
	    
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	      //URL launch
	      driver.get("http://www.uitestpractice.com/Students/Select");
	      //identify dropdown
	      WebElement n = driver.findElement(By.id("countriesSingle"));

	      Select sl = new Select(n);
	      //option by value
	      sl.selectByValue("usa");
	      //get option with text
	      String s = sl.getFirstSelectedOption().getText();
	      System.out.println("Value selected: : " + s);
	      driver.quit();
	   }
	}
		
	}

}
