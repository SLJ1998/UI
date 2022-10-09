package action.GlobalSettings.TranscodingTemplate;

import common.CommonObject;
import common.Sleep;
import object.GlobalSettings.TranscodingTemplate.NewTranscodingTemplateObject;
import org.openqa.selenium.WebDriver;

public class NewTranscodingTemplateAction extends CommonObject {
    public NewTranscodingTemplateAction(WebDriver driver) {
        super(driver);
    }

    public void creat(String name,String abrnumber,String videoframerate,String audiobitrate) {
        NewTranscodingTemplateObject newTranscodingTemplateObject = new NewTranscodingTemplateObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        logger.info("创建转码模板");

        Sleep.sleep(4000);
        //创建转码模板按钮
        newTranscodingTemplateObject.creat.click();
        //设置时间等待
        Sleep.sleep(2000);
        //返回箭头
        newTranscodingTemplateObject.back1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //创建转码模板按钮
        newTranscodingTemplateObject.creat.click();
        //设置时间等待
        Sleep.sleep(2000);
        //返回按钮
        newTranscodingTemplateObject.back2.click();
        //设置时间等待
        Sleep.sleep(2000);
        //创建转码模板按钮
        newTranscodingTemplateObject.creat.click();
        //设置时间等待
        Sleep.sleep(2000);
        //输入模板名称
        newTranscodingTemplateObject.name.sendKeys(name);
        //设置时间等待
        Sleep.sleep(2000);
        //输入视频码率
        newTranscodingTemplateObject.abrnumber.sendKeys(abrnumber);
        //设置时间等待
        Sleep.sleep(2000);
        //输入视频帧率
        newTranscodingTemplateObject.videoframerate.sendKeys(videoframerate);
        //设置时间等待
        Sleep.sleep(2000);
        //输入音频码率
        newTranscodingTemplateObject.audiobitrate.sendKeys(audiobitrate);
        //设置时间等待
        Sleep.sleep(2000);
        //提交按钮
        newTranscodingTemplateObject.submit.click();


    }
}
