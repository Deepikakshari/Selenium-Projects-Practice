

    import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;


 public class CalenderSel {

   public static void main(String[] args) throws InterruptedException {
	
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\dsudh\\eclipse-workspace\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	List<WebElement> ele=new ArrayList();

	String str=null;
	WebElement wb;
	String url="https://www.expedia.com/";
	driver.get(url);
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Flights")).click();

	List<WebElement> monList= new ArrayList<WebElement>();
	List<WebElement> dateList= new ArrayList<WebElement>();
	List<WebElement> dayList= new ArrayList<WebElement>();

	driver.findElement(By.cssSelector("div[id='location-field-leg1-origin-menu']")).click();
	driver.findElement(By.id("location-field-leg1-origin")).sendKeys("stl");
	Thread.sleep(1000);
	selectLocation(driver,"Lambert");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("div[id='location-field-leg1-destination-menu']")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("location-field-leg1-destination")).sendKeys("ord");
	Thread.sleep(1000);
	selectLocation(driver,"Chicago");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("button#d1-btn")).click();
	Thread.sleep(1000);

	List<WebElement> monDet=new ArrayList<WebElement>();
	List<WebElement> datePicker=new ArrayList<WebElement>();
	WebElement tableElement;

	int i=0;
	List<WebElement> butClick=new ArrayList<WebElement>();
	List<WebElement> dateSelector=new ArrayList<WebElement>();
	String dateValStr;
	int dateVal;
	while(true) {
	monDet=driver.findElements(By.cssSelector("div.uitk-date-picker-month h2"));
	//WebElement=driver.fin
	datePicker=driver.findElements(By.cssSelector("div.uitk-date-picker-month table"));
	System.out.println("size of table :"+datePicker.size());
	Thread.sleep(1000);
	String name=monDet.get(i).getText();

	if(name.contains("July"))
	{
	System.out.println("found");
	tableElement=datePicker.get(i);
	dateSelector=tableElement.findElements(By.cssSelector("tbody tr td button"));
	for(int k=0;k<dateSelector.size();k++)
	{
	dateValStr=dateSelector.get(k).getAttribute("data-day");
	dateVal=Integer.parseInt(dateValStr);
	if(dateVal==14)
	{
	System.out.println("14 is selected");
	dateSelector.get(k).click();
	}
	}

	break;
	}
	else
	{
	System.out.println("Not found");
	}
	i++;
	if(i==2)
	{
	i=0;
	butClick=driver.findElements(By.xpath("//div[@class='uitk-calendar']/div/button"));
	for(int j=0;j<2;j++)
	{
	butClick.get(1).click();
	Thread.sleep(1000);
	   }
    }
	
	
  }

}

	public static void selectLocation(WebDriver driver, String location) throws InterruptedException
	{
	List<WebElement> ele=new ArrayList();
	String str=null;
	//Thread.sleep(2000);
	ele=driver.findElements(By.cssSelector("ul li.uitk-typeahead-result-item.has-subtext strong"));
	System.out.println("size of ele"+ele.size());
	for(int i=0;i<ele.size();i++)
	{
	str=ele.get(i).getText();
	// System.out.println();
	System.out.println(str);
	if (str.contains(location))
	{
	ele.get(i).click();
	break;
	   }
     }
  }

}


