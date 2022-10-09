package action.GlobalSettings.WorkflowManagement;

import common.CommonObject;
import common.Sleep;
import object.GlobalSettings.WorkflowManagement.NewWorkflowManagementObject;
import org.openqa.selenium.WebDriver;

public class NewWorkflowManagementAction extends CommonObject {
    public NewWorkflowManagementAction(WebDriver driver) {
        super(driver);
    }

    public void creat(String name) {
        NewWorkflowManagementObject newWorkflowManagementObject = new NewWorkflowManagementObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        logger.info("创建工作流");

        //创建工作流按钮
        newWorkflowManagementObject.creat.click();
        //设置时间等待
        Sleep.sleep(2000);
        //返回箭头
        newWorkflowManagementObject.back1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //返回按钮
        newWorkflowManagementObject.back2.click();
        //设置时间等待
        Sleep.sleep(2000);
        //工作流名称
        newWorkflowManagementObject.add1.sendKeys(name);
        //设置时间等待
        Sleep.sleep(2000);
        //加号
        newWorkflowManagementObject.add1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择处理
        newWorkflowManagementObject.selecttranscoding.click();
        //设置时间等待
        Sleep.sleep(2000);
        //编辑按钮
        newWorkflowManagementObject.edit1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择模板
        newWorkflowManagementObject.select1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        newWorkflowManagementObject.sure1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //保存
        newWorkflowManagementObject.save.click();



    }
}
