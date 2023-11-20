package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com");
		String actualtitle =driver.getTitle();
		String exp="rediff";
		if(actualtitle.equalsIgnoreCase(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		String src=driver.getPageSource();
		if(src.contains("Money"))
		{
			System.out.println("Money text is present");
		}
		else
		{
			System.out.println("Money text is not present");
		}
		

	}

}
