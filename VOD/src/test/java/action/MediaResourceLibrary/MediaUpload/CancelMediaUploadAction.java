package action.MediaResourceLibrary.MediaUpload;

import common.CommonObject;
import common.Sleep;
import object.MediaResourceLibrary.MediaUpload.CancelMediaUploadObject;
import org.openqa.selenium.WebDriver;

public class CancelMediaUploadAction extends CommonObject {
    public CancelMediaUploadAction(WebDriver driver) {
        super(driver);
    }

    public void cancel() {
        CancelMediaUploadObject cancelMediaUploadObject = new CancelMediaUploadObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);
        logger.info("取消上传");

        //取消上传
        cancelMediaUploadObject.cancel1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //叉号
        cancelMediaUploadObject.x.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消上传
        cancelMediaUploadObject.cancel1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        cancelMediaUploadObject.cancel2.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消上传
        cancelMediaUploadObject.cancel1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        cancelMediaUploadObject.sure.click();

    }
}
