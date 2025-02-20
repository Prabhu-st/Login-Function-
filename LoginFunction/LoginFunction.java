package JAVAPAKAGE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFunction {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demos.themeselection.com/sneat-bootstrap-html-admin-template-free/html/forms-input-groups.html");
		
		driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("prabhudev");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Chilboydev");
		
		driver.findElement(By.xpath("//div[contains(@class,'row g-6')]//div[1]//div[1]//div[1]//div[3]//input[1]")).sendKeys("prabhudev129");
		
		driver.findElement(By.xpath("//input[@id='basic-url1']")).sendKeys("//input[@id='basic-url1']");
		
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("5000");
		
		driver.findElement(By.xpath("//textarea[@placeholder='Comment']")).sendKeys("Hi Prabhudev How are you");
		
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Search...')])[2]")).sendKeys("Hey Hi Gyes how are you");
		
		driver.findElement(By.xpath("(//input[@id='basic-default-password32'])[1]")).sendKeys("Chilboydev");
		
		driver.findElement(By.xpath("//div[@class='input-group input-group-merge']//input[@placeholder=\"Recipient's username\"]")).sendKeys("whatsapp bro..");
		
		driver.findElement(By.xpath("//input[@id='basic-url3']")).sendKeys("9358");
		
		driver.findElement(By.xpath("//input[@placeholder='100']")).sendKeys("25000");
		
		driver.findElement(By.xpath("//div[@class='input-group input-group-merge']//textarea[@aria-label='With textarea']")).sendKeys("IN Banaglore");
		
		driver.findElement(By.xpath("//div[contains(@class,'input-group input-group-lg')]//input[contains(@placeholder,'Username')]")).sendKeys("prabhudev");
		
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Username')])[3]")).sendKeys("hi ");
		
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Username')])[4]")).sendKeys("Metro Mail");
		
		driver.findElement(By.xpath("//input[contains(@aria-label,'Text input with checkbox')]")).sendKeys("Perfect Done");
		
		WebElement CheckBox=driver.findElement(By.xpath("(//input[contains(@aria-label,'Checkbox for following text input')])[1]"));
		
		CheckBox.click();
		
		driver.findElement(By.xpath("//input[@aria-label='Text input with radio button']")).sendKeys("Btm Layout");
		
		WebElement RadioBtn=driver.findElement(By.xpath("//input[@aria-label='Radio button for following text input']"));
		
		RadioBtn.click();
		
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("CHil");
		
		driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("Boy Dev");
		
		

	}

}
