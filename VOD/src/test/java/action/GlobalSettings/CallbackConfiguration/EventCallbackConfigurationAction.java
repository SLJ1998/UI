package action.GlobalSettings.CallbackConfiguration;

import common.CommonObject;
import common.Sleep;
import object.GlobalSettings.CallbackConfiguration.EventCallbackConfigurationObject;
import org.openqa.selenium.WebDriver;

public class EventCallbackConfigurationAction extends CommonObject {
    public EventCallbackConfigurationAction(WebDriver driver) {
        super(driver);
    }

    public void event() {
        EventCallbackConfigurationObject eventCallbackConfigurationObject = new EventCallbackConfigurationObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        Sleep.sleep(4000);

        logger.info("事件回调配置");

        //回调配置
        eventCallbackConfigurationObject.callback.click();
        //设置时间等待
        Sleep.sleep(4000);
        //叉号
        eventCallbackConfigurationObject.x.click();
        //设置时间等待
        Sleep.sleep(4000);
        //回调配置
        eventCallbackConfigurationObject.callback.click();
        //设置时间等待
        Sleep.sleep(4000);
        //取消
        eventCallbackConfigurationObject.cancel.click();
        //设置时间等待
        Sleep.sleep(4000);
        //回调配置
        eventCallbackConfigurationObject.callback.click();
        //设置时间等待
        Sleep.sleep(4000);
        //回调配置
        eventCallbackConfigurationObject.event.click();
        //设置时间等待
        Sleep.sleep(4000);
        //回调配置
        eventCallbackConfigurationObject.sure.click();



    }
}
