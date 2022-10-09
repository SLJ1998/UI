package action.ResourceConsumption;

import common.CommonObject;
import common.Sleep;
import object.ResourceConsumption.EnterResourceConsumptionObject;
import org.openqa.selenium.WebDriver;

public class EnterResourceConsumptionAction extends CommonObject {
    public EnterResourceConsumptionAction(WebDriver driver) {
        super(driver);
    }

    public void enter() {
        EnterResourceConsumptionObject enterResourceConsumptionObject = new EnterResourceConsumptionObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        //driver.navigate().refresh();

        logger.info("进入资源用量");

        //概览界面
        enterResourceConsumptionObject.overview.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择角色
        enterResourceConsumptionObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //管理员
        enterResourceConsumptionObject.mainapplication.click();
        //设置时间等待
        Sleep.sleep(2000);
        //应用管理
        enterResourceConsumptionObject.resourceconsumption.click();

    }
}
