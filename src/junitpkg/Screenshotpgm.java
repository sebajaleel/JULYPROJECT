package junitpkg;

import java.io.File;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpgm {
	ChromeDriver driver;
	@Before
	public void setup() {
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void  test() throws Exception {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./Screenshot/rediff.png"));
		WebElement button=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
		File src1=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("./Screenshot/buttonscreenshot.png"));
		
	}

}
