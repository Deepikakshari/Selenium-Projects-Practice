import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BoxSelecSpicejetSel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dsudh\\eclipse-workspace\\Driver\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        WebElement wb = null;
        wd.get("https://www.spicejet.com/");
		wd.manage().window().maximize();
		wb=wd.findElement(By.cssSelector("input#ctl00_mainContent_rbtnl_Trip_1"));
		wb.click();
		Thread.sleep(2000);
        wd.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("COK");
        Thread.sleep(2000);
        wd.findElement(By.cssSelector("input#ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("DEL");
        Thread.sleep(2000);
         wd.findElement(By.cssSelector("div#divpaxinfo")).click();
        Thread.sleep(2000);
        WebElement adults;
        adults = wd.findElement(By.id("ctl00_mainContent_ddl_Adult"));
      	Select AdultList = new Select(adults);
      	AdultList.selectByValue("5");
      	Thread.sleep(2000);
      	WebElement childele;
      	childele=wd.findElement(By.id("ctl00_mainContent_ddl_Child"));
      	Select ChildList=new Select(childele);
      	ChildList.selectByValue("3");
      	Thread.sleep(2000);
      	WebElement infantele;
      	infantele=wd.findElement(By.cssSelector("select#ctl00_mainContent_ddl_Infant"));
      	Select InfantList=new Select(infantele);
      	InfantList.selectByIndex(3);
      	Thread.sleep(2000);
      	WebElement currency;
      	currency=wd.findElement(By.cssSelector("select#ctl00_mainContent_DropDownListCurrency"));
      	Select dropCurrency= new Select(currency);
      	dropCurrency.selectByIndex(4);
      	Thread.sleep(2000);
      	wb = wd.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']"));
    	
        if(!wb.isSelected()) {
         wb.click();
         }
         
         Thread.sleep(2000);
         if(wb.isSelected()) {
         	System.out.println("Checkbox Selected");
         	//wb.click();
         
         }
      	
	    Thread.sleep(5000);
	    wd.quit();	
		
	}

}
