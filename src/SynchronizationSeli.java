import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynchronizationSeli {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dsudh\\eclipse-workspace\\Driver\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
       String url = "https://rahulshettyacademy.com/seleniumPractise/#/";
        wd.get(url);
        wd.manage().window().maximize();
        //Thread.sleep(2000);

	}

}
