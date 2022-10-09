package action.ApplicationManager;

import common.CommonObject;
import common.Sleep;
import object.ApplicationManager.EnterApplicationObject;
import org.openqa.selenium.WebDriver;

public class EnterApplicationAction extends CommonObject {
    public EnterApplicationAction(WebDriver driver) {
        super(driver);
    }

    public void enter() {
        EnterApplicationObject enterApplicationObject = new EnterApplicationObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        logger.info("进入应用管理");

        //概览界面
        enterApplicationObject.overview.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择角色
        enterApplicationObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //管理员
        enterApplicationObject.admin.click();
        //设置时间等待
        Sleep.sleep(2000);
        //应用管理
        enterApplicationObject.applicationmanager.click();

    }
}
