package action;

import common.CommonObject;
import common.Sleep;
import object.LoginObject;
import org.openqa.selenium.WebDriver;

public class LoginAction extends CommonObject {
    public LoginAction(WebDriver driver) {
        super(driver);
    }

    public void login(String user, String pwd) {
        LoginObject loginObject = new LoginObject(driver);

        //刷新页面
       // driver.navigate().refresh();

        logger.info("登录");

        loginObject.username.clear();
        //输入用户名
        loginObject.username.sendKeys(user);

        //输入密码
        loginObject.password.sendKeys(pwd);

        //设置时间等待
        Sleep.sleep(2000);

        //点击登录
        loginObject.loginButton.click();

    }
}
