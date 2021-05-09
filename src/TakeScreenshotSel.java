import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotSel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dsudh\\eclipse-workspace\\Driver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> ele=new ArrayList();

		String str=null;
		WebElement wb;
		String url="https://www.expedia.com/";
		wd.get(url);
		wd.manage().window().maximize();
		wd.findElement(By.linkText("Flights")).click();
		takeSnapshot(wd,"sanpshott");
		//takeSnapshot(wd,"C:\\Users\\dsudh\\Desktop\\screenshot\\snaptest");
	}
	
     public static void takeSnapshot(WebDriver wd,String filePath ) throws InterruptedException {
    	 String pathLoc="C:\\Users\\dsudh\\Desktop\\screenshot\\";
    	 TakesScreenshot tscshot=(TakesScreenshot) wd;
    	 File SrcFile=tscshot.getScreenshotAs(OutputType.FILE);
    	 try {
			FileUtils.copyFile(SrcFile, new File(pathLoc+filePath+".jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Thread.sleep(5000); 
    	wd.quit();
	}
   
}
