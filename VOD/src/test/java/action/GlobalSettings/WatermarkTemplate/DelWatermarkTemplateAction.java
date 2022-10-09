package action.GlobalSettings.WatermarkTemplate;

import common.CommonObject;
import common.Sleep;
import object.GlobalSettings.WatermarkTemplate.DelWatermarkTemplateObject;
import org.openqa.selenium.WebDriver;

public class DelWatermarkTemplateAction extends CommonObject {
    public DelWatermarkTemplateAction(WebDriver driver) {
        super(driver);
    }

    public void del() {
        DelWatermarkTemplateObject delWatermarkTemplateObject = new DelWatermarkTemplateObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);

        logger.info("删除水印模板");

        //删除水印模板
        delWatermarkTemplateObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择叉号
        delWatermarkTemplateObject.x.click();
        //设置时间等待
        Sleep.sleep(2000);
        //删除水印模板
        delWatermarkTemplateObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        delWatermarkTemplateObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //删除水印模板
        delWatermarkTemplateObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        delWatermarkTemplateObject.sure.click();


    }
}
