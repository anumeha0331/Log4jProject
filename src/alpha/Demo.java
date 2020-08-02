package alpha;
import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
 private static Logger log= LogManager.getLogger(Demo.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("Setting chrome driver property");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 log.info("Window Maximized");
		   log.debug("Now hitting makemytrip server");
		driver.get("https://www.makemytrip.com/");
		 log.info("Landed on makemytrip home page");
		try {
			Thread.sleep(60000L);
			log.info("waiting for the home page to be displayed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			log.error("home page is not displayed in the mentioned time frame");
			e.printStackTrace();
		}
	
		
  WebElement source= driver.findElement(By.id("fromCity"));
		source.click();
		try {
			Thread.sleep(2000L);
			log.info("field from city is now active to take the data");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			log.error("field couldnot become active in the mentioned time frame");
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("MUM");
		try {
			Thread.sleep(2000L);
			log.info("waiting for options of the field from city to be visible");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			log.error(" the options of the  field from city is not displayed within mentioned time frame"); 
			e.printStackTrace();
		}
		log.debug("pressing down arrow key and enter");
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		log.info("selecting data  success");
		//log.debug("I am debugging");
		//log.info("object is present");
		//log.error("object is not present");
		//log.fatal("this is fatal");
	}

}
