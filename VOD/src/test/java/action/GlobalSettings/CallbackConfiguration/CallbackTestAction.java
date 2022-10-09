package action.GlobalSettings.CallbackConfiguration;

import common.CommonObject;
import common.Sleep;
import object.GlobalSettings.CallbackConfiguration.CallbackTestObject;
import org.openqa.selenium.WebDriver;

public class CallbackTestAction extends CommonObject {
    public CallbackTestAction(WebDriver driver) {
        super(driver);
    }

    public void callback(String test) {
        CallbackTestObject callbackTestObject = new CallbackTestObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        Sleep.sleep(4000);

        logger.info("进入回调配置");

        //回调配置
        callbackTestObject.callback.click();
        //设置时间等待
        Sleep.sleep(4000);
        //叉号
        callbackTestObject.x.click();
        //设置时间等待
        Sleep.sleep(4000);
        //回调配置
        callbackTestObject.callback.click();
        //设置时间等待
        Sleep.sleep(4000);
        //取消
        callbackTestObject.cancel.click();
        //设置时间等待
        Sleep.sleep(4000);
        //回调配置
        callbackTestObject.callback.click();
        //设置时间等待
        Sleep.sleep(4000);
        //回调配置
        callbackTestObject.test.sendKeys(test);
        //设置时间等待
        Sleep.sleep(4000);
        //回调配置
        callbackTestObject.sure.click();



    }
}
