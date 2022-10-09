package action.MediaResourceLibrary.TranscodingTask;

import common.CommonObject;
import common.Sleep;
import object.MediaResourceLibrary.TranscodingTask.CancelTranscodingTaskObject;
import org.openqa.selenium.WebDriver;

public class CancelTranscodingTaskAction extends CommonObject {
    public CancelTranscodingTaskAction(WebDriver driver) {
        super(driver);
    }

    public void cancel() {
        CancelTranscodingTaskObject cancelTranscodingTaskObject = new CancelTranscodingTaskObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);
        logger.info("取消转码");

        //取消转码
        cancelTranscodingTaskObject.cancel1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //叉号
        cancelTranscodingTaskObject.x.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消转码
        cancelTranscodingTaskObject.cancel1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        cancelTranscodingTaskObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消转码
        cancelTranscodingTaskObject.cancel1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        cancelTranscodingTaskObject.sure.click();
        //设置时间等待
        Sleep.sleep(2000);


    }
}
