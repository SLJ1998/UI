package action.ResourceConsumption;

import common.CommonObject;
import common.Sleep;
import object.ResourceConsumption.AcceleratedBandwidthObject;
import org.openqa.selenium.WebDriver;

public class AcceleratedBandwidthAction extends CommonObject {
    public AcceleratedBandwidthAction(WebDriver driver) {
        super(driver);
    }

    public void acceleratedBandwidth() {
        AcceleratedBandwidthObject acceleratedBandwidthObject = new AcceleratedBandwidthObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        logger.info("资源用量-加速带宽");

        //加速带宽界面
        acceleratedBandwidthObject.acceleratedbandwidth.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择昨天
        acceleratedBandwidthObject.yesterday.click();
        //设置时间等待
        Sleep.sleep(2000);
        //查询按钮
        acceleratedBandwidthObject.querybutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择7天
        acceleratedBandwidthObject.week.click();
        //设置时间等待
        Sleep.sleep(2000);
        //查询按钮
        acceleratedBandwidthObject.querybutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择30天
        acceleratedBandwidthObject.month.click();
        //设置时间等待
        Sleep.sleep(2000);
        //查询按钮
        acceleratedBandwidthObject.querybutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //重置按钮
        acceleratedBandwidthObject.resetbutton.click();

    }
}
