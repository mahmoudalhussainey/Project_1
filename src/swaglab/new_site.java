package swaglab;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

//import javax.xml.crypto.Data;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class new_site {

	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5501/index.html");
		
		//Date currentDate = new Date();
////	
////	String TheAcutalDate = currentDate.toString().replace(":", "-");
////
////	TakesScreenshot src = ((TakesScreenshot) driver) ; 
////	
////	File SrcFile = src.getScreenshotAs((OutputType.FILE));
////	
////	File Dest = new File(".//mypictures/"+TheAcutalDate+".png");
////	
////	FileUtils.copyFile (SrcFile,Dest); 

	List<WebElement> thestudents = driver.findElements(By.tagName("option"));

	int theTotalNumberOfStudents = thestudents.size();

	System.out.println(theTotalNumberOfStudents + "this is the orginal number");

	int HowManyItems = 10;

	System.out.println(HowManyItems + "this is the number of items i want remove");

	for (int i = 0; i < HowManyItems; i++) {
		driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();

	}

	List <WebElement> thestudentsAfterRemove = driver.findElements(By.tagName("option"));
	int ActualNumber = thestudentsAfterRemove.size();

	System.out.println("this is the new actaual number"+ActualNumber);

	int expectedITems = theTotalNumberOfStudents - HowManyItems;

	System.out.println(expectedITems + "this is the number i have expected");
	Assert.assertEquals(ActualNumber, expectedITems);
	
	
			

	}

}
