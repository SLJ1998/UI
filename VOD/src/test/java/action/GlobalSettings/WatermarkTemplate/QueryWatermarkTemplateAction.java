package action.GlobalSettings.WatermarkTemplate;

import common.CommonObject;
import common.Sleep;
import object.GlobalSettings.WatermarkTemplate.QueryWatermarkTemplateObject;
import org.openqa.selenium.WebDriver;

public class QueryWatermarkTemplateAction extends CommonObject {
    public QueryWatermarkTemplateAction(WebDriver driver) {
        super(driver);
    }

    public void detail() {
        QueryWatermarkTemplateObject queryWatermarkTemplateObject = new QueryWatermarkTemplateObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        Sleep.sleep(4000);

        logger.info("查看水印详情");

        //概览界面
        queryWatermarkTemplateObject.detail.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择角色
        queryWatermarkTemplateObject.back.click();
        //设置时间等待


    }
}
