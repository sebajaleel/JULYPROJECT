package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Datepicker2 {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.booking.com");
	}
		public void datepicker()
		{
			driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div")).click();
			datepickermethod("Novemeber 2023","10");
			datepickermethod("November 2023","30");
		}
		private void datepickermethod(String expmonth, String expdate) {
			while(true)
			{
				String month=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/h3")).getText();
				if(month.equals(expmonth))
				{
					System.out.println("month="+month);
					break;
				}
				else
				{
					driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button/span/span")).click();
				}
					List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/table/tbody/tr/td/span"));
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
}
			
					
				
		
		

	
						
			
		
			

