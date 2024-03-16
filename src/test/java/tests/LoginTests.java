package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test
    public void loginSuccess(){

     app.getHelperUser().openLoginForm();
     app.getHelperUser().fillLoginForm("mara@gmail.com", "Mmar123456$");
     app.getHelperUser().submitLogin();
        Assert.assertTrue(app.getHelperUser().isLogged());



    }
}
