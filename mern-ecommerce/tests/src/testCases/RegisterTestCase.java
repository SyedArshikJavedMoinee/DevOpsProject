package testCases;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterTestCase{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Projects\\Java\\Drivers\\Chrome Drivers\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver =  new ChromeDriver();
		
		driver.navigate().to("http://35.78.107.92/signup");
		driver.findElement(By.name("name")).sendKeys("chad");
		driver.findElement(By.name("email")).sendKeys("chad@chad.com");
		driver.findElement(By.name("password")).sendKeys("chad12");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/main/div[3]/form/button/span[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/main/div[3]/form/div[2]/div")).click();

		
		driver.findElement(By.name("email")).sendKeys("chad@chad.com");
		driver.findElement(By.name("password")).sendKeys("chad12");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/main/div[2]/form/button/span[1]")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		if (driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[1]/div/h4")).getText().contains("User links")) {
			System.out.println("Register test case passed");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.quit();
		
		}
		else {
			System.out.println("Register test case failed");
			driver.quit();		
			}
		

	}

}

