package com.qa.certificacion.pruebamakers.utils.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriver {
	
	private static WebDriver driver;
	
	public static MyDriver web() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\Web Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		return new MyDriver();
	}
	
	public WebDriver enLaPagina(String url) {
		driver.get(url);
		return driver;
	}

}
