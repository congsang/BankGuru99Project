package modules.EditCustomer;

import configurations.TestBase;
import libs.EditCustomerFuncs;
import libs.HomePageFuncs;
import libs.ManagePageFuncs;
import org.testng.Assert;
import org.testng.annotations.Test;
import support.Settings;

public class Tc4 extends TestBase {

    @Test
    public void test() {
        HomePageFuncs homePage = new HomePageFuncs(driver);
        homePage.logIn();

        ManagePageFuncs managePage = new ManagePageFuncs(driver);
        managePage.goToTheEditCustomerPage();

        EditCustomerFuncs editCustomer = new EditCustomerFuncs(driver);
        editCustomer.typeCustomerIDField(Settings.getParam("CUSTOMERID"));
        editCustomer.clickSubmit();
        Assert.assertEquals(editCustomer.getEditCustomerHeading(),"Edit Customer");
    }
}
