package action.ResourceConsumption;

import common.CommonObject;
import common.Sleep;
import object.ResourceConsumption.StorageSpaceObject;
import org.openqa.selenium.WebDriver;

public class StorageSpaceAction extends CommonObject {
    public StorageSpaceAction(WebDriver driver) {
        super(driver);
    }

    public void storageSpace() {
        StorageSpaceObject storageSpaceObject = new StorageSpaceObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        logger.info("资源用量-存储空间");

        //存储空间界面
        storageSpaceObject.storagespace.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择30天
        storageSpaceObject.month.click();
        //设置时间等待
        Sleep.sleep(2000);
        //查询按钮
        storageSpaceObject.querybutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //重置按钮
        storageSpaceObject.resetbutton.click();

    }
}
