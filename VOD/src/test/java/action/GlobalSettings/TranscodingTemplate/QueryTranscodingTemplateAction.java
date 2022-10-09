package action.GlobalSettings.TranscodingTemplate;

import common.CommonObject;
import common.Sleep;
import object.GlobalSettings.TranscodingTemplate.EnterTranscodingTemplateObject;
import object.GlobalSettings.TranscodingTemplate.QueryTranscodingTemplateObject;
import org.openqa.selenium.WebDriver;

public class QueryTranscodingTemplateAction extends CommonObject {
    public QueryTranscodingTemplateAction(WebDriver driver) {
        super(driver);
    }

    public void query() {
        QueryTranscodingTemplateObject queryTranscodingTemplateObject = new QueryTranscodingTemplateObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        //driver.navigate().refresh();

        logger.info("查看转码模板详情");

        //自定义转码详情
        queryTranscodingTemplateObject.customtemplate.click();
        //设置时间等待
        Sleep.sleep(2000);
        //返回
        queryTranscodingTemplateObject.back.click();
        //设置时间等待
        Sleep.sleep(2000);
        //内置模板
        queryTranscodingTemplateObject.systemtemplate.click();
        //设置时间等待
        Sleep.sleep(2000);
        //内置模板详情
        queryTranscodingTemplateObject.detail.click();
        //返回
        queryTranscodingTemplateObject.back.click();
        //设置时间等待
        Sleep.sleep(2000);
        //返回
        queryTranscodingTemplateObject.back.click();


    }
}
