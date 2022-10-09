package action.MediaResourceLibrary.ClassificationManagement;

import common.CommonObject;
import common.Sleep;
import object.MediaResourceLibrary.ClassificationManagement.DelClassificationManagementObject;
import org.openqa.selenium.WebDriver;

public class DelClassificationManagementAction extends CommonObject {
    public DelClassificationManagementAction(WebDriver driver) {
        super(driver);
    }

    public void del() {
        DelClassificationManagementObject delClassificationManagementObject = new DelClassificationManagementObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);
        logger.info("删除分类");

        //删除分类
        delClassificationManagementObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //叉号
        delClassificationManagementObject.x.click();
        //设置时间等待
        Sleep.sleep(2000);
        //删除分类
        delClassificationManagementObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        delClassificationManagementObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //删除分类
        delClassificationManagementObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        delClassificationManagementObject.sure.click();
        //设置时间等待
        Sleep.sleep(2000);


    }
}
