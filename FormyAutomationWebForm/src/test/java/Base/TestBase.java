package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

//
//    public static WebDriver driver;
//    public static Properties prop;
//    public  static EventFiringWebDriver e_driver;
//
//
//    public TestBase(){
//        try {
//            prop = new Properties();
//            FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/crm"
//                    + "/qa/config/config.properties");
//            prop.load(ip);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public static void initialization(){
//        String browserName = prop.getProperty("browser");
//
//        if(browserName.equals("chrome")){
//            System.setProperty("webdriver.chrome.driver", "/Users/Laptop/Desktop/QAtools/WebDrivers/ChromeWebDriver/chromedriver.exe");
//            driver = new ChromeDriver();
//        }
//
//
//
//
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//
//        driver.get(prop.getProperty("url"));
//
//    }
//
//
//
//
//    @AfterSuite
//    public static void cleanUp(){
//        driver.manage().deleteAllCookies();
//        driver.close();
//    }
}
//
//
