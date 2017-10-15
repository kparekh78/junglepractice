package com.wellsfargo.practice.jungletest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SockTest {

	static WebDriver driver;
	
	/*@BeforeClass
	public static void launchBrowser(){
		driver = new ChromeDriver();
		
		driver.navigate().to("https://jungle-socks.herokuapp.com/");
		
	}
	*/
	
	@Test
	public void elementFind(){
		
		assertEquals("mansi", "mansi");
	}

	
}
