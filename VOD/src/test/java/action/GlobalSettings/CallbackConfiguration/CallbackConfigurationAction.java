package action.GlobalSettings.CallbackConfiguration;

import common.CommonObject;
import common.Sleep;
import object.GlobalSettings.CallbackConfiguration.CallbackConfigurationObject;
import org.openqa.selenium.WebDriver;

public class CallbackConfigurationAction extends CommonObject {
    public CallbackConfigurationAction(WebDriver driver) {
        super(driver);
    }

    public void callback(String url) {
       CallbackConfigurationObject callbackConfigurationObject = new CallbackConfigurationObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        Sleep.sleep(4000);

        logger.info("进入回调配置");


        //回调配置
        callbackConfigurationObject.callback.click();
        //设置时间等待
        Sleep.sleep(4000);
        //叉号
        callbackConfigurationObject.x.click();
        //设置时间等待
        Sleep.sleep(4000);
        //回调配置
        callbackConfigurationObject.callback.click();
        //设置时间等待
        Sleep.sleep(4000);
        //取消
        callbackConfigurationObject.cancel.click();
        //设置时间等待
        Sleep.sleep(4000);
        //回调配置
        callbackConfigurationObject.callback.click();
        //设置时间等待
        Sleep.sleep(4000);
        //回调配置
        //callbackConfigurationObject.url.sendKeys(url);
        //设置时间等待
        Sleep.sleep(4000);
        //回调配置
        callbackConfigurationObject.sure.click();



    }
}
