package action.GlobalSettings.WatermarkTemplate;

import common.CommonObject;
import common.Sleep;
import object.GlobalSettings.TranscodingTemplate.EnterTranscodingTemplateObject;
import object.GlobalSettings.WatermarkTemplate.EnterWatermarkTemplateObject;
import org.openqa.selenium.WebDriver;

public class EnterWatermarkTemplateAction extends CommonObject {
    public EnterWatermarkTemplateAction(WebDriver driver) {
        super(driver);
    }

    public void enter() {
        EnterWatermarkTemplateObject enterWatermarkTemplateObject = new EnterWatermarkTemplateObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        //driver.navigate().refresh();

        logger.info("进入水印模板");

        //概览界面
        enterWatermarkTemplateObject.overview.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择角色
        enterWatermarkTemplateObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //管理员
        enterWatermarkTemplateObject.mainapplication.click();
        //设置时间等待
        Sleep.sleep(2000);
        //全局设置
        enterWatermarkTemplateObject.globalsettings.click();
        //设置时间等待
        Sleep.sleep(2000);
        //水印模板
        enterWatermarkTemplateObject.watermarktemplate.click();


    }
}
