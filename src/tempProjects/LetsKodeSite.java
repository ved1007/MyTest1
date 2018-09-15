package tempProjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LetsKodeSite {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.ie.driver", "C:\\Users\\PC User1\\Desktop\\SeleniumFiles\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.letskodeit.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"DrpDwnMn00label\"]")).click();
		Thread.sleep(2000);
		
		
		
		driver.close();
		
	}

}
