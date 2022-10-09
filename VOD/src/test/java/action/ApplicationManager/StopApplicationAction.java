package action.ApplicationManager;

import common.CommonObject;
import common.Sleep;
import object.ApplicationManager.NewApplicationObject;
import object.ApplicationManager.StopApplicationObject;
import org.openqa.selenium.WebDriver;

public class StopApplicationAction extends CommonObject {
    public StopApplicationAction(WebDriver driver) {
        super(driver);
    }

    public void stop() {
        StopApplicationObject stopApplicationObject = new StopApplicationObject(driver);
        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        logger.info("停用应用");
        //点击创建应用
        stopApplicationObject.stopbutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //点击取消
        stopApplicationObject.cancelbutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //点击创建应用
        stopApplicationObject.stopbutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //点击叉号
        stopApplicationObject.xbutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //点击创建应用
        stopApplicationObject.stopbutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //点击确定
        stopApplicationObject.surebutton.click();

    }
}
