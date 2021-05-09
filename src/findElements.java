import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class findElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dsudh\\eclipse-workspace\\Driver\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        WebElement wb = null;
        String str;
        List<WebElement> ele = new ArrayList();
        String url = "https://www.expedia.com/";
        wd.get(url);
        wd.manage().window().maximize();
        wb = wd.findElement(By.linkText("Flights"));
        wb.click();
		wd.findElement(By.id("location-field-leg1-origin-menu")).click();
		Thread.sleep(2000);
		wd.findElement(By.cssSelector("input#location-field-leg1-origin")).sendKeys("ind");
		Thread.sleep(2000);
		ele =wd.findElements(By.cssSelector("li.uitk-typeahead-result-item.has-subtext strong"));
		for(int i =0;i<ele.size();i++)
		{
			str = ele.get(i).getText();
			System.out.println(str);
			
			if(str.contains("Delhi")) {
				ele.get(i).click();
				System.out.println("Delhi is found");
				break;
				
			}
		
		}
		Thread.sleep(2000);
         wd.quit();
	}

}
