package action.GlobalSettings.CallbackConfiguration;

import common.CommonObject;
import common.Sleep;
import object.GlobalSettings.CallbackConfiguration.EnterCallbackConfigurationObject;
import org.openqa.selenium.WebDriver;

public class EnterCallbackConfigurationAction extends CommonObject {
    public EnterCallbackConfigurationAction(WebDriver driver) {
        super(driver);
    }

    public void enter() {
        EnterCallbackConfigurationObject enterCallbackConfigurationObject = new EnterCallbackConfigurationObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        //driver.navigate().refresh();

        logger.info("进入回调配置");

        //概览界面
        enterCallbackConfigurationObject.overview.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择角色
        enterCallbackConfigurationObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //管理员
        enterCallbackConfigurationObject.mainapplication.click();
        //设置时间等待
        Sleep.sleep(2000);
        //全局设置
        enterCallbackConfigurationObject.globalsettings.click();
        //设置时间等待
        Sleep.sleep(2000);
        //回调配置
        enterCallbackConfigurationObject.callback.click();


    }
}
