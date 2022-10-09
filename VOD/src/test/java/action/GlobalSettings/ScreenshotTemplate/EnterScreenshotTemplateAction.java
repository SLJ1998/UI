package action.GlobalSettings.ScreenshotTemplate;

import common.CommonObject;
import common.Sleep;
import object.GlobalSettings.ScreenshotTemplate.EnterScreenshotTemplateObject;
import org.openqa.selenium.WebDriver;

public class EnterScreenshotTemplateAction extends CommonObject {
    public EnterScreenshotTemplateAction(WebDriver driver) {
        super(driver);
    }

    public void enter() {
        EnterScreenshotTemplateObject enterScreenshotTemplateObject = new EnterScreenshotTemplateObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        //driver.navigate().refresh();

        logger.info("进入截图模板");

        //概览界面
        enterScreenshotTemplateObject.overview.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择角色
        enterScreenshotTemplateObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //管理员
        enterScreenshotTemplateObject.mainapplication.click();
        //设置时间等待
        Sleep.sleep(2000);
        //全局设置
        enterScreenshotTemplateObject.globalsettings.click();
        //设置时间等待
        Sleep.sleep(2000);
        //水印模板
        enterScreenshotTemplateObject.screenshottemplate.click();


    }
}
