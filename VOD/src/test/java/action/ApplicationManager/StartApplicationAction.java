package action.ApplicationManager;

import common.CommonObject;
import common.Sleep;
import object.ApplicationManager.StartApplicationObject;
import object.ApplicationManager.StopApplicationObject;
import org.openqa.selenium.WebDriver;

public class StartApplicationAction extends CommonObject {
    public StartApplicationAction(WebDriver driver) {
        super(driver);
    }

    public void start() {
        StartApplicationObject startApplicationObject = new StartApplicationObject(driver);
        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        logger.info("启用应用");
        //点击创建应用
        startApplicationObject.startbutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //点击取消
        startApplicationObject.cancelbutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //点击创建应用
        startApplicationObject.startbutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //点击叉号
        startApplicationObject.xbutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //点击创建应用
        startApplicationObject.startbutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //点击确定
        startApplicationObject.surebutton.click();

    }
}
