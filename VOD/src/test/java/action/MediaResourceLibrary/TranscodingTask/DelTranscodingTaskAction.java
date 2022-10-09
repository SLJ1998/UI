package action.MediaResourceLibrary.TranscodingTask;

import common.CommonObject;
import common.Sleep;
import object.MediaResourceLibrary.TranscodingTask.DelTranscodingTaskObject;
import org.openqa.selenium.WebDriver;

public class DelTranscodingTaskAction extends CommonObject {
    public DelTranscodingTaskAction(WebDriver driver) {
        super(driver);
    }

    public void del() {
        DelTranscodingTaskObject delTranscodingTaskObject = new DelTranscodingTaskObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);
        logger.info("删除转码");

        //删除转码
        delTranscodingTaskObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //叉号
        delTranscodingTaskObject.x.click();
        //设置时间等待
        Sleep.sleep(2000);
        //删除转码
        delTranscodingTaskObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        delTranscodingTaskObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //删除转码
        delTranscodingTaskObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        delTranscodingTaskObject.sure.click();
        //设置时间等待
        Sleep.sleep(2000);


    }
}
