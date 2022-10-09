package action.MediaResourceLibrary.MediaManagement;

import common.CommonObject;
import common.Sleep;
import object.MediaResourceLibrary.ClassificationManagement.EnterClassificationManagementObject;
import object.MediaResourceLibrary.MediaManagement.EnterMediaManagementObject;
import org.openqa.selenium.WebDriver;

public class EnterMediaManagementAction extends CommonObject {
    public EnterMediaManagementAction(WebDriver driver) {
        super(driver);
    }

    public void enter() {
        EnterMediaManagementObject enterMediaManagementObject = new EnterMediaManagementObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        //driver.navigate().refresh();

        logger.info("进入媒资管理");

        //概览界面
        enterMediaManagementObject.overview.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择角色
        enterMediaManagementObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //主应用
        enterMediaManagementObject.main.click();
        //设置时间等待
        Sleep.sleep(2000);
        //媒体资源库
        enterMediaManagementObject.media.click();
        //设置时间等待
        Sleep.sleep(2000);
        //媒资管理
        enterMediaManagementObject.mediamanager.click();
        //设置时间等待
        Sleep.sleep(2000);

    }
}
