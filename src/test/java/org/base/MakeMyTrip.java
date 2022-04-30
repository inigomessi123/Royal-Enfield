package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BLR-01/05/2022&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng&cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Variants|Brand-Variants-Exact|RSA|Regular|V2|274470846615");
		
		Thread.sleep(5000);
		
		/*WebElement search = driver.findElement(By.xpath("//a[text()='Search']"));
		search.click();  */
		
		driver.findElement(By.xpath("// span[@class='bgProperties icon20 overlayCrossIcon']")).click();
		
		WebElement click = driver.findElement(By.xpath("(//p[text()='Airlines']//parent::div[@class='filtersOuter']//child::span[@class='box'])[5]"));
		 click.click();
	}

}
