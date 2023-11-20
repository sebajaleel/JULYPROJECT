package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationExcersisePgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/signup");
	}
	@Test
	public void signup()
	{
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("seba");
		driver.findElement(By.xpath("//form[@action='/signup']/input[3]")).sendKeys("sebajali20@gmail.com");
		driver.findElement(By.xpath("//*[@id='form']/div/div/div[3]/div/form/button")).click();
		driver.findElement(By.xpath("//*[@id='id_gender1']")).click();
		driver.findElement(By.xpath("//*[@id='id_gender2']")).click();
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("seba@123");
		WebElement day=driver.findElement(By.xpath("//*[@id='days']"));
	    Select daydetails=new Select(day);
	    daydetails.selectByValue("2");
		WebElement month=driver.findElement(By.xpath("//*[@id='months']"));
		Select monthdetails=new Select(month);
		monthdetails.selectByValue("8");
		WebElement year=driver.findElement(By.xpath("//*[@id='years']"));
		Select yeardetails=new Select(year);
		yeardetails.selectByValue("2001");
		driver.findElement(By.xpath("//*[@id='newsletter']")).click();
		driver.findElement(By.xpath("//*[@id='optin']")).click();
		driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("seba");
		driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("jaleel");
		driver.findElement(By.xpath("//*[@id='company']")).sendKeys("luminar");
		driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("abab");
		driver.findElement(By.xpath("//*[@id='address2']")).sendKeys("cdcd");
		WebElement country=driver.findElement(By.xpath("//*[@id='country']"));
	    Select countrydetails=new Select(country);
	    countrydetails.selectByValue("Canada");
	    driver.findElement(By.xpath("//*[@id='state']")).sendKeys("toronto");
	    driver.findElement(By.xpath("//*[@id='city']")).sendKeys("ontario");
	    driver.findElement(By.xpath("//*[@id='zipcode']")).sendKeys("123456");
	    driver.findElement(By.xpath("//*[@id='mobile_number']")).sendKeys("123456789");
	    driver.findElement(By.xpath("//*[@id='form']/div/div/div/div[1]/form/button")).click();
		
	}
}
