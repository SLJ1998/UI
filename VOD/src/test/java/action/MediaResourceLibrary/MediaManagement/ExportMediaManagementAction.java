package action.MediaResourceLibrary.MediaManagement;

import common.CommonObject;
import common.Sleep;
import object.MediaResourceLibrary.MediaManagement.ExportMediaManagementObject;
import org.openqa.selenium.WebDriver;

public class ExportMediaManagementAction extends CommonObject {
    public ExportMediaManagementAction(WebDriver driver) {
        super(driver);
    }

    public void export() {
        ExportMediaManagementObject exportMediaManagementObject = new ExportMediaManagementObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);
        logger.info("导出");

        //选择
        exportMediaManagementObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //导出
        exportMediaManagementObject.export.click();
        //设置时间等待
        Sleep.sleep(2000);
        //叉号
        exportMediaManagementObject.x.click();
        //设置时间等待
        Sleep.sleep(2000);
        //导出
        exportMediaManagementObject.export.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        exportMediaManagementObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //导出
        exportMediaManagementObject.export.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        exportMediaManagementObject.sure.click();
        //设置时间等待
        Sleep.sleep(2000);

    }
}
