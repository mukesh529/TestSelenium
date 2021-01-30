package TestPckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMJ {

	public static void main(String[] args) {
		WebDriver driver = null; 
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Selenium Softwares//Driver//chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.amazon.com");

	}

}
