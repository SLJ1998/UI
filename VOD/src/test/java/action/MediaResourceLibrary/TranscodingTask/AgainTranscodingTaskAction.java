package action.MediaResourceLibrary.TranscodingTask;

import common.CommonObject;
import common.Sleep;
import object.MediaResourceLibrary.TranscodingTask.AgainTranscodingTaskObject;
import org.openqa.selenium.WebDriver;

public class AgainTranscodingTaskAction extends CommonObject {
    public AgainTranscodingTaskAction(WebDriver driver) {
        super(driver);
    }

    public void again() {
        AgainTranscodingTaskObject againTranscodingTaskObject = new AgainTranscodingTaskObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);
        logger.info("重新转码");

        //重新转码
        againTranscodingTaskObject.again.click();
        //设置时间等待
        Sleep.sleep(2000);
        //叉号
        againTranscodingTaskObject.x.click();
        //设置时间等待
        Sleep.sleep(2000);
        //重新转码
        againTranscodingTaskObject.again.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        againTranscodingTaskObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //重新转码
        againTranscodingTaskObject.again.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        againTranscodingTaskObject.sure.click();
        //设置时间等待
        Sleep.sleep(2000);


    }
}
