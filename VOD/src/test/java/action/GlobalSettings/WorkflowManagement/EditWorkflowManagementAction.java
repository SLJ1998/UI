package action.GlobalSettings.WorkflowManagement;

import common.CommonObject;
import common.Sleep;
import object.GlobalSettings.WorkflowManagement.EditWorkflowManagementObject;
import org.openqa.selenium.WebDriver;

public class EditWorkflowManagementAction extends CommonObject {
    public EditWorkflowManagementAction(WebDriver driver) {
        super(driver);
    }

    public void edit() {
        EditWorkflowManagementObject editWorkflowManagementObject = new EditWorkflowManagementObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        logger.info("操作工作流");

        //停用工作流
        editWorkflowManagementObject.stop.click();
        //设置时间等待
        Sleep.sleep(2000);
        //启用工作流
        editWorkflowManagementObject.start.click();
        //设置时间等待
        Sleep.sleep(2000);
        //停用工作流
        editWorkflowManagementObject.stop.click();
        //设置时间等待
        Sleep.sleep(2000);
        //删除工作流
        editWorkflowManagementObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //叉号
        editWorkflowManagementObject.x.click();
        //设置时间等待
        Sleep.sleep(2000);
        //删除工作流
        editWorkflowManagementObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        editWorkflowManagementObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        editWorkflowManagementObject.sure.click();



    }
}
