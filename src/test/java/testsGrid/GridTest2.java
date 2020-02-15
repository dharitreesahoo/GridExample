package testsGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridTest2 extends TestBase{
	@Test
	public void mailTest() throws MalformedURLException, InterruptedException {
		driver.navigate().to("https://google.com/");
		Thread.sleep(5000);
		driver.close();

	}
}
