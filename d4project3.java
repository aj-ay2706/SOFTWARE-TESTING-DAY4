package day4pro2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d4project3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		WebElement rname=driver.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
		rname.sendKeys("AJAY");
		WebElement ename=driver.findElement(By.xpath("//*[@id=\"input-to-email\"]"));
		ename.sendKeys("727721eucs008@skcet.ac.in");
		WebElement yname=driver.findElement(By.xpath("//*[@id=\"input-from-name\"]"));
		yname.sendKeys("AJAYB");
		WebElement yemail=driver.findElement(By.xpath("//*[@id=\"input-from-email\"]"));
		yemail.sendKeys("babuajay359@gamil.com");
		
		Thread.sleep(3000);
		WebElement gift=driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]"));
		gift.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)","");
		WebElement mess=driver.findElement(By.xpath("//*[@id=\"input-message\"]"));
		mess.sendKeys("GOOD");
		JavascriptExecutor us=(JavascriptExecutor)driver;
		us.executeScript("window.scrollBy(0,250)","");
		Thread.sleep(3000);
		WebElement button=driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input"));
		button.click();
		WebElement cont=driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button"));
		cont.click();
		
		
		
		
		
		
	}

}