package action.MediaResourceLibrary.MediaManagement;

import common.CommonObject;
import common.Sleep;
import object.MediaResourceLibrary.MediaManagement.NewMediaManagementObject;
import org.openqa.selenium.WebDriver;

public class NewMediaManagementAction extends CommonObject {
    public NewMediaManagementAction(WebDriver driver) {
        super(driver);
    }

    public void upload() {
        NewMediaManagementObject newMediaManagementObject = new NewMediaManagementObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);
        logger.info("上传文件");

        //上传文件
        newMediaManagementObject.upload.click();
        //设置时间等待
        Sleep.sleep(2000);
        //返回
        newMediaManagementObject.back.click();
        //设置时间等待
        Sleep.sleep(2000);
        //上传文件
        newMediaManagementObject.upload.sendKeys();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        newMediaManagementObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);

    }
}
