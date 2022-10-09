package action.MediaResourceLibrary.WorkflowTask;

import common.CommonObject;
import common.Sleep;
import object.MediaResourceLibrary.WorkflowTask.QueryWorkflowTaskObject;
import org.openqa.selenium.WebDriver;

public class QueryWorkflowTaskAction extends CommonObject {
    public QueryWorkflowTaskAction(WebDriver driver) {
        super(driver);
    }

    public void query(String id) {
        QueryWorkflowTaskObject queryWorkflowTaskObject = new QueryWorkflowTaskObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);
        logger.info("搜索工作流任务");

        //选择
        queryWorkflowTaskObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //工作流任务ID
        queryWorkflowTaskObject.id1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //输入工作流任务ID
        queryWorkflowTaskObject.id.sendKeys(id);
        //设置时间等待
        Sleep.sleep(2000);
        //搜索按钮
        queryWorkflowTaskObject.query.click();
        //设置时间等待
        Sleep.sleep(2000);


    }
}
