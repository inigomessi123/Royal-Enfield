package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone 13 pro max (256GB)");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		Thread.sleep(5000);
		
		WebElement text = driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 Pro Max (256GB) - Graphite']//ancestor::div[@class='a-section a-spacing-none s-padding-right-small s-title-instructions-style']//following-sibling::div[@class='sg-row']//child::span[@class='a-price-whole'])[1]"));
		
		String text2 = text.getText();
		System.out.println(text2);
	}

}
