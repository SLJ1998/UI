package action.MediaResourceLibrary.MediaUpload;

import common.CommonObject;
import common.Sleep;
import object.MediaResourceLibrary.MediaUpload.EnterMediaUploadObject;
import org.openqa.selenium.WebDriver;

public class EnterMediaUploadAction extends CommonObject {
    public EnterMediaUploadAction(WebDriver driver) {
        super(driver);
    }

    public void enter() {
        EnterMediaUploadObject enterMediaUploadObject = new EnterMediaUploadObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        //driver.navigate().refresh();

        logger.info("进入媒体上传");

        //概览界面
        enterMediaUploadObject.overview.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择角色
        enterMediaUploadObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //主应用
        enterMediaUploadObject.main.click();
        //设置时间等待
        Sleep.sleep(2000);
        //媒体资源库
        enterMediaUploadObject.media.click();
        //设置时间等待
        Sleep.sleep(2000);
        //媒资上传
        enterMediaUploadObject.mediaupload.click();

    }
}
