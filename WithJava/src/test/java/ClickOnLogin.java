import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Testing for karuna\\WithJava\\BrowserDrivers\\chromedriver.exe");
		
		//gecko - firefox
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://automationteststore.com/");
		
		driver.manage().window().maximize();
		
		
		WebElement LoginLink = driver.findElement(By.xpath("//*[@id='customer_menu_top']/li/a"));
		
		LoginLink.click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}
