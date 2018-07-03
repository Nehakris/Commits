package selenium;

import javax.print.DocFlavor.BYTE_ARRAY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {
	
	@Test
	public void testGitHubLogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b7c.06.13\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		driver.findElement(By.id("login_field")).sendKeys("Nehakris");
		
		driver.findElement(By.id("password")).sendKeys("Neha3695!");
		driver.findElement(By.name("commit")).click();
		String title= driver.getTitle();
		Assert.assertEquals(title, "GitHub");
		
		System.out.println("Continue with test code..");
	}
}
