package org.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Yamaha {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("royal enfield");
		Thread.sleep(10000);
		
		List<WebElement> findElements = driver.findElements(By.xpath("//span[text()='royal enfield']"));
		 for (WebElement x : findElements) {
			
			 String attribute=x.getText();
			System.out.println(attribute);
		 
		}
	}

}
