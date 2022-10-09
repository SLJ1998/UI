package action.ResourceConsumption;

import common.CommonObject;
import common.Sleep;
import object.ResourceConsumption.TranscodingDurationObject;
import org.openqa.selenium.WebDriver;

public class TranscodingDurationAction extends CommonObject {
    public TranscodingDurationAction(WebDriver driver) {
        super(driver);
    }

    public void transcodingDuration() {
        TranscodingDurationObject transcodingDurationObject = new TranscodingDurationObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        logger.info("资源用量-转码时长");

        //转码时长界面
        transcodingDurationObject.transcodingduration.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择30天
        transcodingDurationObject.month.click();
        //设置时间等待
        Sleep.sleep(2000);
        //查询按钮
        transcodingDurationObject.querybutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //重置按钮
        transcodingDurationObject.resetbutton.click();

    }
}
