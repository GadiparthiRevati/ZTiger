package practicee;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VtigerCrm {
	WebDriver driver;
	Properties property;
	@Test(enabled=false)
	public void loginTest() throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/cData.properties");
		property=new Properties();
		property.load(fis);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		Assert.assertEquals(driver.getTitle(), "vtiger CRM 5 - Commercial Open Source CRM");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(property.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(property.getProperty("password"));
		
		driver.findElement(By.id("submitButton")).click();
		WebElement logo=driver.findElement(By.xpath("//img[@title='vtiger-crm-logo.gif']"));
		String title = logo.getText();
		System.out.println(title);
		//Assert.assertEquals("title","vtiger");

		
	}
	
	@Test()
	public void dropdown() throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/cData.properties");
		property=new Properties();
		property.load(fis);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(property.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(property.getProperty("password"));
		
		driver.findElement(By.id("submitButton")).click();
		
	driver.findElement(By.xpath("//img[@align='left']")).click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//td[text()='Organizations']/input")).click();
	driver.findElement(By.xpath("driver.findElement(By.xpath")).click();
	
		
		
	/*	Select sel=new Select(dd);
		
		sel.isMultiple();
		
		sel.selectByIndex(0);
		*/

		
		
		
	}
}


