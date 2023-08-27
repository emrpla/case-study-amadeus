package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver==null){

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("window-size=1920x1080");
            options.addArguments("--no-sandbox");
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--disable-dev-shm-usage");

            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver(options);
        }
        return driver;
    }

    public static WebDriver closeDriver(){
        if(driver!=null){
            driver.close();
            driver=null;
        }
        return null;
    }

}
