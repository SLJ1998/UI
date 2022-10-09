package action.MediaResourceLibrary.MediaManagement;

import common.CommonObject;
import common.Sleep;
import object.MediaResourceLibrary.MediaManagement.BatchDelMediaManagementObject;
import object.MediaResourceLibrary.MediaManagement.TranscodingMediaManagementObject;
import org.openqa.selenium.WebDriver;

public class BatchDelMediaManagementAction extends CommonObject {
    public BatchDelMediaManagementAction(WebDriver driver) {
        super(driver);
    }

    public void del() {
        BatchDelMediaManagementObject batchDelMediaManagementObject = new BatchDelMediaManagementObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);
        logger.info("批量删除");

        //选择
        batchDelMediaManagementObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //批量删除
        batchDelMediaManagementObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //叉号
        batchDelMediaManagementObject.x.click();
        //设置时间等待
        Sleep.sleep(2000);
        //批量删除
        batchDelMediaManagementObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        batchDelMediaManagementObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //批量删除
        batchDelMediaManagementObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        batchDelMediaManagementObject.sure.click();
        //设置时间等待
        Sleep.sleep(2000);

    }
}
