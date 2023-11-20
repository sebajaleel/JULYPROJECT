package junitpkg;

import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResponsecodPgm {
	String baseurl="https://www.ebay.com" ;                                         //url import is java.net package
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void test() throws Exception
	{
		URL u=new URL(baseurl);
		HttpsURLConnection con=(HttpsURLConnection)u.openConnection();
		con.connect();
		System.out.println(con.getResponseCode());
		if(con.getResponseCode()==200)
		{
			System.out.println("valid"+baseurl);
		}
			
	}
	

}
