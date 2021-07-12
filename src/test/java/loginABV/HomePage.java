package loginABV;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageObjects.ABVPage;
import setUp.BaseClass;

public class HomePage extends BaseClass {



    ABVPage ABVPage = new ABVPage(driver);
    @Before
    public void SetUp(){
        setUp();
        OpenBrowser("https://www.sinoptik.bg/sofia-bulgaria-100727011/5-days");
    }

    @Test
    public void openABVPage(){

        ABVPage.goToAbvPage();
        ABVPage.logIn("", "");
    }

    @After
    public  void Close(){
        CloseBrowser();
    }

}
