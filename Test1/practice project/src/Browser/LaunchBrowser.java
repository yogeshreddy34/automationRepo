 package Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public void launchChromeBrowser() {

		System.setProperty("webdriver.chrome.driver","E:\\Automation_Concetps\\practice project\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.amazon.com/");
		}
		public static void main(String[] args) {
			LaunchBrowser obj=new LaunchBrowser();
			obj.launchChromeBrowser();
}
}