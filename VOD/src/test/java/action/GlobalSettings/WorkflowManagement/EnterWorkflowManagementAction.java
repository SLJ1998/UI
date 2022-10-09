package action.GlobalSettings.WorkflowManagement;

import common.CommonObject;
import common.Sleep;
import object.GlobalSettings.WorkflowManagement.EnterWorkflowManagementObject;
import org.openqa.selenium.WebDriver;

public class EnterWorkflowManagementAction extends CommonObject {
    public EnterWorkflowManagementAction(WebDriver driver) {
        super(driver);
    }

    public void enter() {
        EnterWorkflowManagementObject enterWorkflowManagementObject = new EnterWorkflowManagementObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        logger.info("进入工作流管理");

        //概览界面
        enterWorkflowManagementObject.overview.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择角色
        enterWorkflowManagementObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //管理员
        enterWorkflowManagementObject.mainapplication.click();
        //设置时间等待
        Sleep.sleep(2000);
        //全局设置
        enterWorkflowManagementObject.globalsettings.click();
        //设置时间等待
        Sleep.sleep(2000);
        //工作流管理
        enterWorkflowManagementObject.workflowmanagement.click();


    }
}
