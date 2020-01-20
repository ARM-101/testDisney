package testdisney;

import java.util.List;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Accountcreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.get("http://www.disney.com");
		 driver.manage().window().maximize();
		 WebDriverWait wait=new WebDriverWait(driver, 100);
		
		 WebElement shoplabel;
		 shoplabel= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#goc-bar-left > li:nth-child(3) > a")));
		 boolean status = shoplabel.isDisplayed();
		 
		//*[@id="goc-bar-left"]/li[3]/a
		 
		 if (status) {
			 //shoplabel.click();	
			 System.out.println("===== WebDriver is visible======");
			} else {
				System.out.println("===== WebDriver is not visible======");
			}
		 
		 	 
				 //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"goc-bar-left\"]/li[3]/a")));
				 
				 
		 //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.navigate().refresh();
		 driver.findElement(By.xpath("//*[@id=\"goc-bar-left\"]/li[3]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[1]/div/div/div[2]/div[2]/div[1]/div/ul/li[3]/div/button/span/span")).click();
		
		driver.switchTo().frame(1);
		
		//driver.findElement(By.xpath("//*[@id=\"did-ui-view\"]/div/section/section/form/section/div[1]/div/label/span[2]/input")).sendKeys("Aravind");
		//click on Create an Account
		driver.findElement(By.xpath("//*[@id=\"did-ui-view\"]/div/section/section/form/section/div[5]/a")).click();
		
		/*JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript(Script,Arguments);
		
		String MainWindow=driver.getWindowHandle();	
		Set<String> s1=driver.getWindowHandles();
		System.out.println(s1);
		
		Iterator<String> i1=s1.iterator();		
		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            System.out.println("===== childwindow is visible======");	
            driver.switchTo().window(ChildWindow);*/	
		//driver.switchTo().frame(1);
		
		WebElement firstnamelabel;
		firstnamelabel= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName")));
		 boolean fnstatus = firstnamelabel.isDisplayed();
		 WebElement fnTextbox = driver.findElement(By.name("firstName"));
		 fnTextbox.sendKeys(Keys.ENTER);
            driver.findElement(By.name("firstName")).sendKeys("Peter");
            
            /*if(MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
            	System.out.println("===== childwindow is not mainwindow======");	 
                    // Switching to Child window
                    	
                    		*/
                    
		//driver.switchTo().frame(2);
		//Firstname textbox
		WebElement lnTextbox=driver.findElement(By.name("lastName"));
		lnTextbox.sendKeys("williams");
		
		WebElement emailtextbox=driver.findElement(By.name("email"));
		emailtextbox.sendKeys("mail.1@mailinator.com");
		
		WebElement newPassword=driver.findElement(By.name("newPassword"));
		newPassword.sendKeys("Password123");
		
		WebElement verifyPassword=driver.findElement(By.name("verifyPassword"));
		verifyPassword.sendKeys("Password123");
		
		
		WebElement dateOfBirth=driver.findElement(By.name("dateOfBirth"));
				dateOfBirth.sendKeys("04/29/1976");

		
	}


        }

	
