package action.MediaResourceLibrary.ClassificationManagement;

import common.CommonObject;
import common.Sleep;
import object.MediaResourceLibrary.ClassificationManagement.EnterClassificationManagementObject;
import org.openqa.selenium.WebDriver;

public class EnterClassificationManagementAction extends CommonObject {
    public EnterClassificationManagementAction(WebDriver driver) {
        super(driver);
    }

    public void enter() {
        EnterClassificationManagementObject enterClassificationManagementObject = new EnterClassificationManagementObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        //driver.navigate().refresh();

        logger.info("进入分类管理");

        //概览界面
        enterClassificationManagementObject.overview.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择角色
        enterClassificationManagementObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //主应用
        enterClassificationManagementObject.main.click();
        //设置时间等待
        Sleep.sleep(2000);
        //媒体资源库
        enterClassificationManagementObject.media.click();
        //设置时间等待
        Sleep.sleep(2000);
        //分类管理
        enterClassificationManagementObject.classification.click();

    }
}
