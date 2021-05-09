import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class iCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dsudh\\eclipse-workspace\\Driver\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
       String url = "https://rahulshettyacademy.com/seleniumPractise/#/";
        wd.get(url);
        wd.manage().window().maximize();
        Thread.sleep(2000);
       
        int size =0;
        List<WebElement> alist =new ArrayList<WebElement>();
        String vegName;
        alist=wd.findElements(By.cssSelector("h4.product-name"));
        size=alist.size();
        System.out.println("Size is: " + size);
        String[] vegArr= {"Cauliflower","Beetroot","Beans"};
        List<String> vegList = Arrays.asList(vegArr);
        System.out.println(vegList);
        int count =0;
        int vegSize = vegArr.length;
        System.out.println("length size: " +vegSize);
        //int vegListSize = vegList.size();
        //System.out.println("length size: "+ vegListSize);
        
	    Thread.sleep(2000);
	    String veggyName,quantity;
	    for(int i =0;i<size;i++) {
	    	
	    	vegName = alist.get(i).getText();
	    	System.out.println(vegName);
	    	 String[] vegSplit=vegName.split(" - ");
	    	 veggyName=vegSplit[0]; 
	    	 //quantity=vegSplit[1];
	    	 
	    	
    		  	   	 
	    	 if(vegList.contains(veggyName)) {
	    		
	    		//wd.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]")).get(i).click();
	    		//Thread.sleep(5000);
	    		 if(veggyName.contains("Beans")) {
	    	    	 wd.findElements(By.cssSelector("a.increment")).get(i).click();
	    	    	
	    	     }else if(veggyName.contains("Beetroot")){
	    	    	 
	    	    	 wd.findElements(By.cssSelector("input.quantity")).get(i).clear();
	    	    	 wd.findElements(By.cssSelector("input.quantity")).get(i).sendKeys("4");
	    	    	// Thread.sleep(3000); 
	    	    	 
	    	     }
	    		  count = count+1;
	    		 wd.findElements(By.cssSelector("div.product-action")).get(i).click();
	    		 
	    		 if(count ==vegSize ) {
		    		 break;
		    	 }
	    		
	    	    
	    	}
	    	 
	     	
	    }
	    
	   
	    List<WebElement> cartInfo=new ArrayList<WebElement>();
	    cartInfo =wd.findElements(By.cssSelector("div.cart-info strong"));
	    String items=cartInfo.get(0).getText();
	    String price=cartInfo.get(1).getText();
	    System.out.println("Items: "+items);
	    System.out.println("Price: "+price);
	    Thread.sleep(5000);
	    
	   wd.quit();
	
	  }
}
	
	
	
    

