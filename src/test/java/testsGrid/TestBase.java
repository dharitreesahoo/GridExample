package testsGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestBase {
	public WebDriver driver;
	@Parameters({ "browser","IPAddress", "port" })
	@BeforeTest
	public void setup(String browser, String IPAddress , String port ) throws MalformedURLException {
		DesiredCapabilities dr = null;

		dr = DesiredCapabilities.chrome();
		dr.setBrowserName(browser);
		dr.setPlatform(Platform.WINDOWS);
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http:/".concat(IPAddress).concat(":").concat(port).concat("/wd/hub")), dr);
		driver.get("https://google.com");
	}
}
