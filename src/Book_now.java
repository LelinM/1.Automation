import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Book_now {
	WebDriver driver;

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","/Users/Lelin/eclipse-workspace/1_Automation_BS/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://phptravels.net/");
	}
	
	public void selectTour () {
		driver.findElement(By.xpath("//*[@id=\"tours-tab\"]/span[2]")).click();
		
	}
	
	public void Input () {
		driver.findElement(By.xpath("/html[1]/body[1]/span[1]/span[1]/span[1]/input[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/span[1]/span[1]/span[1]/input[1]")).sendKeys("Johor Bahru");
	}
	
	public void datePicker () {
		driver.findElement(By.xpath("/html[1]/body[1]/div[10]/div[1]/table[1]/tbody[1]/tr[4]/td[5]")).click();
	}
		public void count_search (){
			driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div[2]/div/div[3]/form/div/div/div[3]/div/div/div/a")).click();	    
		    driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div[2]/div/div[3]/form/div/div/div[3]/div/div/div/div/div[1]/div/div/div[2]/i")).click(); 
		    driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div[2]/div/div[3]/form/div/div/div[4]/div/button")).click();
		
	}
		public void legoland (){
			JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript("window.scrollBy(0,1800)", "");
			   
			   driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/section/ul/li[6]/div/div[2]/div/div[2]/div/a")).click();
		}
		
		public void bookNow (){
			driver.findElement(By.xpath("/html/body/section[2]/div[2]/div/div/div[2]/div/div/div/form/div[3]/button")).click();
		}
		
		public void completeBooking (){
			driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[1]/div[2]/div/div/div[1]/div/div/input")).sendKeys("abc");
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[1]/div[2]/div/div/div[2]/div/div/input")).sendKeys("xyz");
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[1]/div[2]/div/div/div[3]/div/div/input")).sendKeys("abc@xyzxxx");
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[1]/div[2]/div/div/div[5]/div/div/input")).sendKeys("Dhaka,Bangladesh");
			   
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[1]/div[2]/div/div/div[6]/div/div/div/span/span[1]/span/span[1]")).click();
			   driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Bangladesh");
			   
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[1]/div[2]/div/div/div[7]/div/div/div/span/span[1]/span/span[1]")).click();
			   driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Bangladesh");
			   
		  //travellers info
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div/div[2]/input")).sendKeys("abc");
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div/div[3]/input")).sendKeys("xyz");
			   
			   JavascriptExecutor js1 = (JavascriptExecutor) driver;
			   js1.executeScript("window.scrollBy(0,2000)", "");
			   
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div[2]/input")).sendKeys("AAAA");
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div[3]/input")).sendKeys("BBBB");
			   
		  //payment method
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[3]/div[2]/div/ul/div[2]/div/div/input")).click();
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[4]/div/div/div/input")).click();
			   
		  //confirm booking
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[5]/div/button")).click();
	    
		}
		
		public void closeBrowser() {
		driver.quit();
	}

	public static void main(String[] args) {
		Book_now obj = new Book_now();
		obj.launchBrowser();
		obj.selectTour();
		obj.Input ();
		obj.datePicker ();
		obj.count_search ();
		obj.legoland ();
		obj.completeBooking();
		obj.closeBrowser();
	}
}
