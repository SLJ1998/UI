package action.GlobalSettings.CallbackConfiguration;

import common.CommonObject;
import common.Sleep;
import object.GlobalSettings.CallbackConfiguration.CallbackModeObject;
import org.openqa.selenium.WebDriver;

public class CallbackModeAction extends CommonObject {
    public CallbackModeAction(WebDriver driver) {
        super(driver);
    }

    public void mode() {
       CallbackModeObject callbackModeObject = new CallbackModeObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        Sleep.sleep(4000);

        logger.info("进入回调配置");

        //回调模式
        callbackModeObject.mode.click();
        //设置时间等待
        Sleep.sleep(4000);
        //叉号
        callbackModeObject.x.click();
        //设置时间等待
        Sleep.sleep(4000);
        //回调模式
        callbackModeObject.mode.click();
        //设置时间等待
        Sleep.sleep(4000);
        //取消
        callbackModeObject.cancel.click();
        //设置时间等待
        Sleep.sleep(4000);
        //回调模式
        callbackModeObject.mode.click();
        //设置时间等待
        Sleep.sleep(4000);
        //回调模式
        //callbackModeObject.normal.click();
        //设置时间等待
        Sleep.sleep(4000);
        //回调配置
        callbackModeObject.sure.click();



    }
}
