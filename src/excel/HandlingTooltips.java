package excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingTooltips
{
 @Test
 public void tooltip()
 {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement gendertooltips=driver.findElement(By.id("gender-help"));
	String tooltiptext=gendertooltips.getAttribute("title");
	//System.out.println(tooltiptext);
	if(tooltiptext.equalsIgnoreCase("click for more information"))
	{
		System.out.println("tooltip matching expected value");
	}
	else
	{
		System.out.println("tooltip not matching expected value");
	}
 }
}
