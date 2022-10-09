package action.GlobalSettings.TranscodingTemplate;

import common.CommonObject;
import common.Sleep;
import object.GlobalSettings.TranscodingTemplate.EnterTranscodingTemplateObject;
import object.ResourceConsumption.EnterResourceConsumptionObject;
import org.openqa.selenium.WebDriver;

public class EnterTranscodingTemplateAction extends CommonObject {
    public EnterTranscodingTemplateAction(WebDriver driver) {
        super(driver);
    }

    public void enter() {
        EnterTranscodingTemplateObject enterTranscodingTemplateObject = new EnterTranscodingTemplateObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        //driver.navigate().refresh();

        logger.info("进入转码模板");

        //概览界面
        enterTranscodingTemplateObject.overview.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择角色
        enterTranscodingTemplateObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //管理员
        enterTranscodingTemplateObject.mainapplication.click();
        //设置时间等待
        Sleep.sleep(2000);
        //转码模板
        enterTranscodingTemplateObject.globalsettings.click();
        //设置时间等待
        Sleep.sleep(2000);
        //转码模板
        enterTranscodingTemplateObject.transcodingtemplate.click();


    }
}
