package abstactpillar;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import basicprogramming.Confriguration123;

public class SpiceJet {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Confriguration123.Chromepath);
		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-geolocation");

				WebDriver ss=new ChromeDriver(option);
				
				
				ss.get("https://www.goindigo.in/");
				Thread.sleep(2000);
				
				

}
}
