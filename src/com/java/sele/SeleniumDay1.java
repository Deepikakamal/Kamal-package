package com.java.sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay1 {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepi\\SeleniumProject\\driver\\chromedriver.exe");
	//interface	                //class
		WebDriver driver = new ChromeDriver();  //upcasting
		//parent                  //child
		
	driver.get("https://www.google.com/");
		
	}

}
