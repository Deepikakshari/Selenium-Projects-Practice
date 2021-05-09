import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dsudh\\eclipse-workspace\\Driver\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        WebElement wb = null;
		wd.manage().window().maximize();
		/*String url = "http://demo.guru99.com/test/delete_customer.php";
		wd.get(url);
		wd.findElement(By.name("cusid")).sendKeys("Deepz");
		wd.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		
		String alertstr =wd.switchTo().alert().getText();
		System.out.println(alertstr);
		Thread.sleep(2000);*/
		
		
		//iframe
		
		
		
		
		
		
		wd.quit();
		
	}
	

}
