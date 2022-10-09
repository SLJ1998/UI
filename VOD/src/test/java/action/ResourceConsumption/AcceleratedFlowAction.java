package action.ResourceConsumption;

import common.CommonObject;
import common.Sleep;
import object.ResourceConsumption.AcceleratedFlowObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AcceleratedFlowAction extends CommonObject {
    public AcceleratedFlowAction(WebDriver driver) {
        super(driver);
    }

    public void acceleratedFlow(String start,String end) {
        AcceleratedFlowObject acceleratedFlowObject = new AcceleratedFlowObject(driver);
        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        logger.info("资源用量-加速流量");

        //选择30天
        acceleratedFlowObject.month.click();
        //设置时间等待
        Sleep.sleep(2000);
        //查询按钮
        acceleratedFlowObject.querybutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //重置按钮
        acceleratedFlowObject.resetbutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //开始时间
        acceleratedFlowObject.start.sendKeys(start);
        //设置时间等待
        Sleep.sleep(2000);
        //结束时间
        acceleratedFlowObject.end.sendKeys(end);
        //设置时间等待
        Sleep.sleep(2000);
        //enter
        acceleratedFlowObject.end.sendKeys(Keys.ENTER);
        //设置时间等待
        Sleep.sleep(2000);
        //查询按钮
        acceleratedFlowObject.querybutton.click();

    }
}
