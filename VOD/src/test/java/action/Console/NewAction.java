package action.Console;

import common.CommonObject;
import common.Sleep;
import object.Console.NewObject;
import org.openqa.selenium.WebDriver;

public class NewAction extends CommonObject {
    public NewAction(WebDriver driver) {
        super(driver);
    }

    public void submit() {
        NewObject newObject = new NewObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        logger.info("进入视频点播");

//        //体验新版
//        newObject.submit.click();
//        //设置时间等待
//        Sleep.sleep(2000);
//        //体验新版
//        newObject.sure.click();
//        //设置时间等待
//        Sleep.sleep(4000);
        //产品与服务
        newObject.products.click();
        //设置时间等待
        Sleep.sleep(4000);
        //进入VOD
        newObject.vods.click();
        //设置时间等待
//        Sleep.sleep(2000);
//        //峰值带宽趋势
//        newObject.peakbandwidthtrend.click();
//        //设置时间等待
//        Sleep.sleep(2000);
//        //转码时长趋势
//        newObject.transcodingdurationtrend.click();
//        //设置时间等待
//        Sleep.sleep(2000);
//        //存储空间趋势
//        newObject.storagetrend.click();
//        //设置时间等待
//        Sleep.sleep(2000);
//        //查看更多数据
//        newObject.moredata.click();


    }
}
