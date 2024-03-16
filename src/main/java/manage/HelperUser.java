package manage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperUser extends HelperBase {
    public HelperUser(WebDriver wd) {
        super(wd);
    }

    public void openLoginForm(){
//        WebElement btnLogin = wd.findElement(By.cssSelector("a[href='/login']"));
//        btnLogin.click();
        click(By.cssSelector("a[href='/login']"));
    }
    public void fillLoginForm(String email,String password ){
        //WebElement emailInput= wd.findElement(By.cssSelector("input[name='email']"));
        //WebElement passwordInput= wd.findElement(By.cssSelector("input[name='password']"));

        type(By.cssSelector("input[name='email']"), email);
        type(By.cssSelector("input[name='password']"), password);
    }
    public void submitLogin(){
        click(By.name("login"));

    }

    public boolean isLogged() {
        return isElementPresent(By.xpath("//button[text()='Sign Out']"));
    }
}
