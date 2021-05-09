import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dsudh\\eclipse-workspace\\Driver\\chromedriver.exe");
         WebDriver wd = new ChromeDriver();
         WebElement wb = null;
         //WebDriver wd1 = new FirefoxDriver();
		//wd.get("https://www.spicejet.com/");
		wd.manage().window().maximize();
          //wb =wd.findElement(By.xpath("//div[@class ='RNNXgb']/div/div[2]/input"));
            //wb.sendKeys("Deepz");
            
           // "//div[@class='']//a[@href='/accounting.html'][i[@class='icon-usd']]/preceding::input::h4"
            //wd.findElement(By.xpath("//*[@class='LX3sZb']/preceding-sibling::a[2]")).click();
            wb = wd.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
            Select dropSelect = new Select(wb);
            dropSelect.selectByIndex(0);
            Thread.sleep(2000);
            wb = wd.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']"));
            wb.click();
            Thread.sleep(2000);
            //dropSelect.selectByIndex(0);
            wb = wd.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']"));
            //wb.click();
            
            if(!wb.isSelected()) {
            wb.click();
            }
            
            Thread.sleep(2000);
            if(wb.isSelected()) {
            	System.out.println("Checkbox Selected");
            	wb.click();
            	//Thread.sleep(5000);
            }
            Thread.sleep(5000);
          	/*wb = wd.findElement(By.name("email"));//
          	wb.clear();
          	wb = wd.findElement(By.linkText("Forgot Password?"));
          	//from xPath formula: //tagname[@attribute='value']
          	wb = wd.findElement(By.xpath("//input[@name='email']"));
          	wb.sendKeys("Deepika");
          	//wb = wd.findElement(By.cssSelector("input[id='pass']"));
          	wb = wd.findElement(By.cssSelector("input#pass"));
          	wb = wd.findElement(By.cssSelector("input.inputtext._55r1._6luy"));
          	wb.sendKeys("Pass");*/
          		
          	Thread.sleep(5000);
          wd.quit();
		
	
		
	}

}
