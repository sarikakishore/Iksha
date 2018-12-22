package Naukri1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","E:\\javaselenium\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver st= new ChromeDriver();
		
		
		st.get("https://www.myntra.com/login?referer=https://www.myntra.com/?gclid=EAIaIQobChMI0LSU2Ouy3wIVFCQrCh1SIAPCEAAYASAAEgKVKfD_BwE&utm_source=google&utm_medium=cpc&utm_campaign=&utm_term=myntra&utm_content=&matchtype=e");
		
		// By username = By.name("email");
		By username = By.xpath("//input[@placeholder='Your Email Address']");
		By password = By.xpath("//input[@placeholder='Enter Password']");
		By login = By.xpath("//button[@class='login-login-button']");

	//	By password = By.name("password");
		st.findElement(username).sendKeys("sarika");
		st.findElement(password).sendKeys("xxx");     
		st.findElement(login).click();   




	}

}
