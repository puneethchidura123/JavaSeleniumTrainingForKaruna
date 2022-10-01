import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Testing for karuna\\WithJava\\BrowserDrivers\\chromedriver.exe");
		
		//gecko - firefox
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
		
		
	}

}
