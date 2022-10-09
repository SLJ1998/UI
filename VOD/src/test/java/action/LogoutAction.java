package action;

import common.CommonObject;
import object.LogoutObject;
import org.openqa.selenium.WebDriver;

public class LogoutAction extends CommonObject {
    public LogoutAction(WebDriver driver) {
        super(driver);
    }

    public void logout() {
        LogoutObject logoutObject = new LogoutObject(driver);

        //刷新页面
        driver.navigate().refresh();

        logger.info("登出");

        //点击登录者头像
        logoutObject.name.click();

        //点击退出
        logoutObject.logout.click();


    }
}
