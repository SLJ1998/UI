package action.MediaResourceLibrary.ClassificationManagement;

import common.CommonObject;
import common.Sleep;
import object.MediaResourceLibrary.ClassificationManagement.EditClassificationManagementObject;
import object.MediaResourceLibrary.ClassificationManagement.NewClassificationManagementObject;
import org.openqa.selenium.WebDriver;

public class NewClassificationManagementAction extends CommonObject {
    public NewClassificationManagementAction(WebDriver driver) {
        super(driver);
    }

    public void add() {
        NewClassificationManagementObject newClassificationManagementObject = new NewClassificationManagementObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);
        logger.info("添加一级分类");

        //修改分类名称
        newClassificationManagementObject.add.click();
        //设置时间等待
        Sleep.sleep(2000);


    }
}
