package action.MediaResourceLibrary.ClassificationManagement;

import common.CommonObject;
import common.Sleep;
import object.MediaResourceLibrary.ClassificationManagement.EditClassificationManagementObject;
import org.openqa.selenium.WebDriver;

public class EditClassificationManagementAction extends CommonObject {
    public EditClassificationManagementAction(WebDriver driver) {
        super(driver);
    }

    public void edit() {
        EditClassificationManagementObject editClassificationManagementObject = new EditClassificationManagementObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);
        logger.info("修改分类名称");

        //修改分类名称
        editClassificationManagementObject.edit.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        editClassificationManagementObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //修改分类名称
        editClassificationManagementObject.edit.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        editClassificationManagementObject.sure.click();
        //设置时间等待
        Sleep.sleep(2000);


    }
}
