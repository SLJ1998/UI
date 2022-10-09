package action.GlobalSettings.ScreenshotTemplate;

import common.CommonObject;
import common.Sleep;
import object.GlobalSettings.ScreenshotTemplate.DelScreenshotTemplateObject;
import org.openqa.selenium.WebDriver;

public class DelScreenshotTemplateAction extends CommonObject {
    public DelScreenshotTemplateAction(WebDriver driver) {
        super(driver);
    }

    public void del() {
        DelScreenshotTemplateObject delScreenshotTemplateObject = new DelScreenshotTemplateObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);

        logger.info("删除截图模板");

        //删除
        delScreenshotTemplateObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //叉号
        delScreenshotTemplateObject.x.click();
        //设置时间等待
        Sleep.sleep(2000);
        //删除
        delScreenshotTemplateObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        delScreenshotTemplateObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //删除
        delScreenshotTemplateObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        delScreenshotTemplateObject.sure.click();


    }
}
