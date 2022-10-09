package action.OverView;

import object.OverView.AppOverViewObject;
import common.CommonObject;
import common.Sleep;
import org.openqa.selenium.WebDriver;

public class AppOverViewAction extends CommonObject {
    public AppOverViewAction(WebDriver driver) {
        super(driver);
    }

    public void appOverView() {
        AppOverViewObject appOverViewObject = new AppOverViewObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        logger.info("主应用概览界面");

        //选择角色
        appOverViewObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择主应用
        appOverViewObject.mainapplication.click();
        //设置时间等待
        Sleep.sleep(2000);
        //峰值带宽趋势
        appOverViewObject.peakbandwidthtrend.click();
        //设置时间等待
        Sleep.sleep(2000);
        //转码时长趋势
        appOverViewObject.transcodingdurationtrend.click();
        //设置时间等待
        Sleep.sleep(2000);
        //存储空间趋势
        appOverViewObject.storagetrend.click();
        //设置时间等待
        Sleep.sleep(2000);
        appOverViewObject.moredata.click();




    }
}
