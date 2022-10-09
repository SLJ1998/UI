package action.MediaResourceLibrary.MediaManagement;

import common.CommonObject;
import common.Sleep;
import object.MediaResourceLibrary.MediaManagement.DelMediaManagementObject;
import org.openqa.selenium.WebDriver;

public class DelMediaManagementAction extends CommonObject {
    public DelMediaManagementAction(WebDriver driver) {
        super(driver);
    }

    public void del() {
        DelMediaManagementObject delMediaManagementObject = new DelMediaManagementObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);
        logger.info("删除媒资");

        //删除媒资
        delMediaManagementObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //叉号
        delMediaManagementObject.x.click();
        //设置时间等待
        Sleep.sleep(2000);
        //删除媒资
        delMediaManagementObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        delMediaManagementObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //删除媒资
        delMediaManagementObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        delMediaManagementObject.sure.click();
        //设置时间等待
        Sleep.sleep(2000);

    }
}
