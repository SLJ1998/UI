package action.ResourceConsumption;

import common.CommonObject;
import common.Sleep;
import object.ResourceConsumption.StorageOutflowFlowObject;
import org.openqa.selenium.WebDriver;

public class StorageOutflowFlowAction extends CommonObject {
    public StorageOutflowFlowAction(WebDriver driver) {
        super(driver);
    }

    public void storageOutflowFlow() {
        StorageOutflowFlowObject storageOutflowFlowObject = new StorageOutflowFlowObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        logger.info("资源用量-存储流出流量");

        //存储流出流量界面
        storageOutflowFlowObject.storageoutflowflow.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择30天
        storageOutflowFlowObject.month.click();
        //设置时间等待
        Sleep.sleep(2000);
        //查询按钮
        storageOutflowFlowObject.querybutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //重置按钮
        storageOutflowFlowObject.resetbutton.click();

    }
}
