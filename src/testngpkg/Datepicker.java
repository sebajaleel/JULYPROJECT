package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Datepicker {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.trivago.com");
	}
	public void datepicker()
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div/fieldset/button[1]")).click();
		datepickermethod("December 2023","15");
		datepickermethod("December 2023","30");
	}
	private void datepickermethod(String expmonth,String expdate) {
		while(true)
		{
			String month=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[2]/h3")).getText();
			if(month.equals(expmonth))
			{
				System.out.println("month="+month);
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
				
			}
		}
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/button/time"));
		for(WebElement dateeElement:alldates)
		{
			String date=dateeElement.getText();
			if(date.equals(expdate))
			{
				dateeElement.click();
				break;
			}
			
			
			
		}
	
	}

}

