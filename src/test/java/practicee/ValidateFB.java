package practicee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateFB {
	@Test
	public void validataionTest() {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapp.skillrary.com/login.php?type=login");
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("admin");
	driver.findElement(By.name("login")).click();
	Assert.assertEquals(driver.getTitle(), "SkillRary Ecommerce");
	driver.findElement(By.xpath("//span[text()='SkillRary Admin']")).click();
	driver.findElement(By.xpath("//a[text()='Sign out']")).click();
	Assert.assertEquals(driver.getTitle(),"SkillRary Courses");
	
	
	}
}
