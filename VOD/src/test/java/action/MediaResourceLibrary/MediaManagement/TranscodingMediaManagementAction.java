package action.MediaResourceLibrary.MediaManagement;

import common.CommonObject;
import common.Sleep;
import object.MediaResourceLibrary.MediaManagement.TranscodingMediaManagementObject;
import org.openqa.selenium.WebDriver;

public class TranscodingMediaManagementAction extends CommonObject {
    public TranscodingMediaManagementAction(WebDriver driver) {
        super(driver);
    }

    public void transcoding() {
        TranscodingMediaManagementObject transcodingMediaManagementObject = new TranscodingMediaManagementObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);
        logger.info("提交转码任务");

        //选择
        transcodingMediaManagementObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //转码
        transcodingMediaManagementObject.transcoding.click();
        //设置时间等待
        Sleep.sleep(2000);
        //叉号
        transcodingMediaManagementObject.x.click();
        //设置时间等待
        Sleep.sleep(2000);
        //转码
        transcodingMediaManagementObject.transcoding.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        transcodingMediaManagementObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //转码
        transcodingMediaManagementObject.transcoding.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择封装格式
        transcodingMediaManagementObject.mp4.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        transcodingMediaManagementObject.sure.click();
        //设置时间等待
        Sleep.sleep(2000);

    }
}
