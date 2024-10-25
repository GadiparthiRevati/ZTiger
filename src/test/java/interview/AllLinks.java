package interview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllLinks {
	@Test
	public void linktest() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement ele : links)
		{
			System.out.println(ele.getAttribute("href  "));
		}
		driver.quit();
		
		
	}

}
