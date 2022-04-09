package pom123;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import basicprogramming.Confriguration123;

public class Pom1Runner {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", Confriguration123.Chromepath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
		Utility1 util =new Utility1();
		
		Pom1 signup = new Pom1(driver);
		
		
		signup.enterFirstName(util.readexcel(1, 0));
		Thread.sleep(1000);
		signup.enterLastName(util.readexcel(1, 1));
		Thread.sleep(1000);
		signup.enterEmail(util.readexcel(1, 2));
		Thread.sleep(2000);
		signup.reenterMail(util.readexcel(1, 3));
		Thread.sleep(1000);
		signup.enterNewPassword(util.readexcel(1, 4));
		Thread.sleep(1000);
        signup.selectDay(util.readexcel(1, 5));
        Thread.sleep(1000);
		signup.selectMonth(util.readexcel(1, 6));
		Thread.sleep(1000);
		signup.selectyear(util.readexcel(1, 7));
		Thread.sleep(1000);
		signup.radio();
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		signup.enterFirstName("rahul");
		Thread.sleep(1000);
		signup.enterLastName("bokde");
		Thread.sleep(1000);
        signup.enterEmail("rahul123@gmail.com");
		Thread.sleep(2000);
		signup.reenterMail("rahul123@gmail.com");
		Thread.sleep(1000);
        signup.enterNewPassword("1234569");
		Thread.sleep(1000);
        signup.selectDay("18");
		Thread.sleep(1000);
        signup.selectMonth("Aug");
		Thread.sleep(1000);
        signup.selectyear("1996");
		signup.radio();
		
	}

}
