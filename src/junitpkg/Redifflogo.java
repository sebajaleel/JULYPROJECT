package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifflogo {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
		@Test
		public void test()
		{
			boolean logo=driver.findElement(By.xpath("//img[@title='Rediff.com']")).isDisplayed();
			if(logo)
			{
				System.out.println("logo is displayed");
			}
			else
			{
				System.out.println("logo is not displayed");
			}
		}
		@Test
		public void testmaleisselected()
		{
			boolean male=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[1]")).isSelected();
			if(male)
			{
				System.out.println("male is selected");
			}
			else
			{
				System.out.println("male is not selected");
			}
		}
}
			
		
		
	


