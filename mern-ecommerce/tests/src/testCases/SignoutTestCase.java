package testCases;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignoutTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Projects\\Java\\Drivers\\Chrome Drivers\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver =  new ChromeDriver();
		
		driver.navigate().to("http://35.78.107.92/signin");
		driver.findElement(By.name("email")).sendKeys("as@as.com");
		driver.findElement(By.name("password")).sendKeys("asasas12");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/main/div[2]/form/button/span[1]")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/header/div/div[2]/span/button/span[1]/p")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		if (driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/h2")).getText().contains("Home page")) {
			System.out.println("Sign out test case passed");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.quit();
		
		}
		else {
			System.out.println("Sign out test case failed");
			driver.quit();		
			}
		

	}

}
