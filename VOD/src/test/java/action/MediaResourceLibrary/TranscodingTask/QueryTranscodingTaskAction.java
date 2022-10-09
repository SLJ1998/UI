package action.MediaResourceLibrary.TranscodingTask;

import common.CommonObject;
import common.Sleep;
import object.MediaResourceLibrary.TranscodingTask.QueryTranscodingTaskObject;
import org.openqa.selenium.WebDriver;

public class QueryTranscodingTaskAction extends CommonObject {
    public QueryTranscodingTaskAction(WebDriver driver) {
        super(driver);
    }

    public void query(String id) {
        QueryTranscodingTaskObject queryTranscodingTaskObject = new QueryTranscodingTaskObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);
        logger.info("搜索转码任务");

        //选择
        queryTranscodingTaskObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //转码任务ID
        queryTranscodingTaskObject.id1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //输入转码任务ID
        queryTranscodingTaskObject.id.sendKeys(id);
        //设置时间等待
        Sleep.sleep(2000);
        //搜索按钮
        queryTranscodingTaskObject.query.click();
        //设置时间等待
        Sleep.sleep(2000);


    }
}
