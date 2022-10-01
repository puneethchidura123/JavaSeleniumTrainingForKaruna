import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationTestStoreRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		int x = 2;
		
		double d = x;
		
		
		x = (int) d;
		
System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Testing for karuna\\WithJava\\BrowserDrivers\\chromedriver.exe");
		
		//gecko - firefox
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://automationteststore.com/");
		
		driver.manage().window().maximize();
		
		
		WebElement LoginLink = driver.findElement(By.xpath("//*[@id='customer_menu_top']/li/a"));
		
		LoginLink.click();
		
		Thread.sleep(5000);

		WebElement ContinueButton = driver.findElement(By.xpath("//*[@id='accountFrm']/fieldset/button"));
		ContinueButton.click();
		
		WebElement RegionOrStateDropdownWe = driver.findElement(By.xpath("//*[@id='AccountFrm_zone_id']"));
		
		Select RegionOrStateDropdown = new Select(RegionOrStateDropdownWe);
		//RegionOrStateDropdown.selectByIndex(2);
		//RegionOrStateDropdown.selectByValue("3518");
		RegionOrStateDropdown.selectByVisibleText("Devon");
		
		
		WebElement YesRadioButton = driver.findElement(By.xpath("//*[@id='AccountFrm_newsletter1']"));
		YesRadioButton.click();
		
		Thread.sleep(5000);
		
		WebElement PrivatePolicyCheckBox = driver.findElement(By.xpath("//*[@id='AccountFrm_agree']"));
		PrivatePolicyCheckBox.click();
		
		
		WebElement ContinueButtonInRegistraction = driver.findElement(By.xpath("//*[@id='AccountFrm']/div[5]/div/div/button"));
		ContinueButtonInRegistraction.click();
		
		
	}

}
