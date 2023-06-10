package testCases;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateProfileTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Projects\\Java\\Drivers\\Chrome Drivers\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver =  new ChromeDriver();
		driver.navigate().to("http://35.78.107.92/signin");
		driver.findElement(By.name("email")).sendKeys("as@as.com");
		driver.findElement(By.name("password")).sendKeys("asasas12");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/main/div[2]/form/button/span[1]")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.findElement(By.linkText("Update profile")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/form/div[1]/input")).sendKeys("as");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/form/div[3]/input")).sendKeys("asasas12");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/form/button")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		if (driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/p")).getText().contains("asas")) {
			System.out.println("Update profile test case passed");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.quit();
		
		}
		else {
			System.out.println("Update profile test case failed");
			driver.quit();		
			}
		

	}

}

