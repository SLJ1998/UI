package action.MediaResourceLibrary.MediaUpload;

import common.CommonObject;
import common.Sleep;
import object.MediaResourceLibrary.MediaUpload.AgainMediaUploadObject;
import org.openqa.selenium.WebDriver;

public class AgainMediaUploadAction extends CommonObject {
    public AgainMediaUploadAction(WebDriver driver) {
        super(driver);
    }

    public void again() {
        AgainMediaUploadObject againMediaUploadObject = new AgainMediaUploadObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);
        logger.info("重新上传");

        //重新上传
        againMediaUploadObject.again.click();
        //设置时间等待
        Sleep.sleep(2000);
    }
}
