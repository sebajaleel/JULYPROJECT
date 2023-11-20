package testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametertest {
	@Parameters("v")
	@Test
	public void test(String v)
	{
		System.out.println(v);
		
	}

}
