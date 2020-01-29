package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.KAVINYA\\Priya\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("http://www.greenstechnologies.in/selenium-training.php");
		String ti=d.getTitle();
		System.out.println(ti);
		String url=d.getCurrentUrl();
		System.out.println(url);
	    
        WebDriver driver=new ChromeDriver();
	    driver.get(" https://www.facebook.com/");

		 WebDriver dri=new ChromeDriver();
		 dri.get("https://www.amazon.in");
		 
		 WebDriver dr=new ChromeDriver();
		 dr.get("http://www.greenstechnologys.com/selenium-course-content.html");
		 WebDriver d1=new ChromeDriver();
		 
		 d1.get("http://www.flipkart.com/");
		 WebDriver drr=new ChromeDriver();
		 drr.get("http://gmail.com/");
		 
		 
	
		 
		 
		 

	     dr.quit();
	
	
//		WebElement usr=d.findElement(By.id("username"));
//		
//		usr.sendKeys("priya");
//		
//		WebElement pass=d.findElement(By.id("password"));
//		pass.sendKeys("123455");
//		
//		WebElement log=d.findElement(By.id("login"));
//		log.click();
//	
	//	WebElement e=d.findElement(By.xpath(("(//p[contains(text(),'Selenium ')])[1]")));
		//String text = e.getText();
		//System.out.println(text);
	}

}
