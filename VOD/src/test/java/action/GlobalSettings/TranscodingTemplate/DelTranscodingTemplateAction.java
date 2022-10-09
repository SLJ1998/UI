package action.GlobalSettings.TranscodingTemplate;

import common.CommonObject;
import common.Sleep;
import object.GlobalSettings.TranscodingTemplate.DelTranscodingTemplateObject;
import object.GlobalSettings.TranscodingTemplate.QueryTranscodingTemplateObject;
import org.openqa.selenium.WebDriver;

public class DelTranscodingTemplateAction extends CommonObject {
    public DelTranscodingTemplateAction(WebDriver driver) {
        super(driver);
    }

    public void del() {
        DelTranscodingTemplateObject delTranscodingTemplateObject = new DelTranscodingTemplateObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        logger.info("删除转码模板");

        Sleep.sleep(4000);

        //删除转码模板
        delTranscodingTemplateObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //叉号
        delTranscodingTemplateObject.x.click();
        //设置时间等待
        Sleep.sleep(2000);
        //删除转码模板
        delTranscodingTemplateObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        delTranscodingTemplateObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //删除转码模板
        delTranscodingTemplateObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        delTranscodingTemplateObject.sure.click();


    }
}
