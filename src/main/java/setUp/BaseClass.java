package setUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BaseClass {


    public static WebDriver driver;


    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ivanka.stoilova\\Downloads\\chromedrivernew\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    public static void OpenBrowser(String url){
        driver.get(url);
    }

    public void CloseBrowser(){
        driver.quit();
    }
}
