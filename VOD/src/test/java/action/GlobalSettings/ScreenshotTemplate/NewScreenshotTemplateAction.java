package action.GlobalSettings.ScreenshotTemplate;

import common.CommonObject;
import common.Sleep;
import object.GlobalSettings.ScreenshotTemplate.NewScreenshotTemplateObject;
import org.openqa.selenium.WebDriver;

public class NewScreenshotTemplateAction extends CommonObject {
    public NewScreenshotTemplateAction(WebDriver driver) {
        super(driver);
    }

    public void creat(String name){
        NewScreenshotTemplateObject newScreenshotTemplateObject = new NewScreenshotTemplateObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);

        logger.info("新建截图模板");

        //新建截图模板
        newScreenshotTemplateObject.creat.click();
        //设置时间等待
        Sleep.sleep(2000);
        //返回
        newScreenshotTemplateObject.back1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //新建截图模板
        newScreenshotTemplateObject.creat.click();
        //设置时间等待
        Sleep.sleep(2000);
        //返回
        newScreenshotTemplateObject.back2.click();
        //设置时间等待
        Sleep.sleep(2000);
        //新建截图模板
        newScreenshotTemplateObject.creat.click();
        //设置时间等待
        Sleep.sleep(2000);
        //截图模板名称
        newScreenshotTemplateObject.name.sendKeys(name);
        //设置时间等待
        Sleep.sleep(2000);
        //提交
        newScreenshotTemplateObject.submit.click();


    }
}
