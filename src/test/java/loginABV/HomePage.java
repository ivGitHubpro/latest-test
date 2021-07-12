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
        OpenBrowser("");
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
