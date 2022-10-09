package action.MediaResourceLibrary.MediaUpload;

import common.CommonObject;
import common.Sleep;
import object.MediaResourceLibrary.MediaUpload.DelMediaUploadObject;
import org.openqa.selenium.WebDriver;

public class DelMediaUploadAction extends CommonObject {
    public DelMediaUploadAction(WebDriver driver) {
        super(driver);
    }

    public void del() {
        DelMediaUploadObject delMediaUploadObject = new DelMediaUploadObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);
        logger.info("删除");

        //删除
        delMediaUploadObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //叉号
        delMediaUploadObject.x.click();
        //设置时间等待
        Sleep.sleep(2000);
        //删除
        delMediaUploadObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        delMediaUploadObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //删除
        delMediaUploadObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        delMediaUploadObject.sure.click();

    }
}
