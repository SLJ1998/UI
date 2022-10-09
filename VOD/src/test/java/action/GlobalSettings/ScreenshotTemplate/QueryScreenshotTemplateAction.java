package action.GlobalSettings.ScreenshotTemplate;

import common.CommonObject;
import common.Sleep;
import object.GlobalSettings.ScreenshotTemplate.QueryScreenshotTemplateObject;
import org.openqa.selenium.WebDriver;

public class QueryScreenshotTemplateAction extends CommonObject {
    public QueryScreenshotTemplateAction(WebDriver driver) {
        super(driver);
    }

    public void query() {
        QueryScreenshotTemplateObject queryScreenshotTemplateObject = new QueryScreenshotTemplateObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);

        logger.info("截图模板详情");

        //概览界面
        queryScreenshotTemplateObject.detail.click();
        //设置时间等待
        Sleep.sleep(4000);
        //选择角色
        queryScreenshotTemplateObject.back.click();
        //设置时间等待


    }
}
