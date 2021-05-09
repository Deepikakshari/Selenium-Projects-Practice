import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class footerSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dsudh\\eclipse-workspace\\Driver\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
       String url = "https://www.rahulshettyacademy.com/AutomationPractice/";
        wd.get(url);
        wd.manage().window().maximize();
        Thread.sleep(2000);
        String fList;
      
       List<WebElement>footerList=new ArrayList<WebElement>();
      footerList=wd.findElements(By.cssSelector("div#gf-BIG a"));
       System.out.println(footerList);
       
       for(int i=0;i<footerList.size();i++) {
    	  //fList=footerList.get(i).getText();
    	   System.out.println("Links Found: "+ footerList.get(i).getText());
       }
       wd.quit();
	}
  
}
