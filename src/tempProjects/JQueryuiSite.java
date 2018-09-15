package tempProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class JQueryuiSite {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.ie.driver", "C:\\Users\\PC User1\\Desktop\\SeleniumFiles\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://jqueryui.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[4]/a")).click();
		
		
		driver.close();
		
		
	}

}
