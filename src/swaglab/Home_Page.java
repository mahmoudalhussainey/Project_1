package swaglab;

//import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class Home_Page {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		String user_name = "standard_user";
		String password = "secret_sauce";
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(user_name);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        
        String actualTitle = driver.getTitle();
        
        String expectedTitle = "Swag Labs";
        
//        Assert.assertEquals(actualTitle, expectedTitle);
        
        
        
//        if(actualTitle==expectedTitle) {
//        	
//        	System.out.println("Pass");
//        	
//        }
//        else System.out.println("Ghalat");
				


	}

}
