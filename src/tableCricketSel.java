import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableCricketSel {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dsudh\\eclipse-workspace\\Driver\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        WebElement wb = null;
        String str;
        String st;
        List<WebElement> ele = new ArrayList();
        String url = "https://www.espncricinfo.com/series/ipl-2021-1249214/mumbai-indians-vs-chennai-super-kings-27th-match-1254084/full-scorecard";
        wd.get(url);
        wd.manage().window().maximize();
        wd.findElement(By.cssSelector("div.card.content-block.match-scorecard-table div.Collapsible"));
        WebElement tableChennai;
        for(int i=0;i<ele.size();i++) {
        	tableChennai=ele.get(i);
        	str=tableChennai.findElement(By.cssSelector("div.col h5")).getText();
        	if(str.contains("MUMBAI")) {
        		ele=tableChennai.findElements(By.cssSelector("table.table.batsman tbody td:nth-child(3)"));
        		for(int k=0;k<ele.size();k++) {
        			st=ele.get(k).getText();
        			System.out.println(st);
        			
        		}
        	}
        }

	}

}
