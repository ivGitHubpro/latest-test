package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ABVPage {
   WebDriver driver;
    protected String url = "";

    @FindBy(how = How.ID, using = "bla bla")
    private WebElement PASSWORDFIELD;

    @FindBy(how = How.ID, using = "bla bla")
    private WebElement USERNAME;

    public void initElements() {
        PageFactory.initElements(driver, this);
    }

    public ABVPage(WebDriver driver) {
        this.driver = driver;
    }


    public ABVPage goToAbvPage() {
        driver.get("");
        return  new ABVPage(driver);
    }

    public void logIn(String username, String password){

    PASSWORDFIELD.sendKeys(password);
    USERNAME.sendKeys(username);
    }

}
