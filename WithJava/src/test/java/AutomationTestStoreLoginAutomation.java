import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTestStoreLoginAutomation {

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

		
		//*[@id='loginFrm_loginname']
		
		WebElement LoginNameTextBox = driver.findElement(By.xpath("//*[@id='loginFrm_loginname']"));
		LoginNameTextBox.sendKeys("user_name");
		
		Thread.sleep(2000);
		
		WebElement PasswordTextBox = driver.findElement(By.xpath("//*[@id='loginFrm_password']"));
		PasswordTextBox.sendKeys("password");
		
		Thread.sleep(2000);
		
		WebElement LoginButton = driver.findElement(By.xpath("//*[@id='loginFrm']/fieldset/button"));
		LoginButton.click();
	 
		Thread.sleep(2000);
		
		
		
		
		
		
		
	}

}
