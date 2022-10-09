package action.MediaResourceLibrary.TranscodingTask;

import common.CommonObject;
import common.Sleep;
import object.MediaResourceLibrary.MediaUpload.EnterMediaUploadObject;
import object.MediaResourceLibrary.TranscodingTask.EnterTranscodingTaskObject;
import org.openqa.selenium.WebDriver;

public class EnterTranscodingTaskAction extends CommonObject {
    public EnterTranscodingTaskAction(WebDriver driver) {
        super(driver);
    }

    public void enter() {
        EnterTranscodingTaskObject enterTranscodingTaskObject = new EnterTranscodingTaskObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        //driver.navigate().refresh();

        logger.info("进入转码任务");

        //概览界面
        enterTranscodingTaskObject.overview.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择角色
        enterTranscodingTaskObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //主应用
        enterTranscodingTaskObject.main.click();
        //设置时间等待
        Sleep.sleep(2000);
        //媒体资源库
        enterTranscodingTaskObject.media.click();
        //设置时间等待
        Sleep.sleep(2000);
        //转码任务
        enterTranscodingTaskObject.transcoding.click();

    }
}
