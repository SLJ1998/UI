package action.MediaResourceLibrary.WorkflowTask;

import common.CommonObject;
import common.Sleep;
import object.MediaResourceLibrary.WorkflowTask.EnterWorkflowTaskObject;
import org.openqa.selenium.WebDriver;

public class EnterWorkflowTaskAction extends CommonObject {
    public EnterWorkflowTaskAction(WebDriver driver) {
        super(driver);
    }

    public void enter() {
        EnterWorkflowTaskObject enterWorkflowTaskObject = new EnterWorkflowTaskObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        //driver.navigate().refresh();

        logger.info("进入工作流任务");

        //概览界面
        enterWorkflowTaskObject.overview.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择角色
        enterWorkflowTaskObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //主应用
        enterWorkflowTaskObject.main.click();
        //设置时间等待
        Sleep.sleep(2000);
        //媒体资源库
        enterWorkflowTaskObject.media.click();
        //设置时间等待
        Sleep.sleep(2000);
        //转码任务
        enterWorkflowTaskObject.workflow.click();

    }
}
