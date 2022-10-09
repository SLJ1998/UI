package action.AuditManagement.AuditList;

import common.CommonObject;
import common.Sleep;
import object.AuditManagement.AuditList.EnterAuditListObject;
import org.openqa.selenium.WebDriver;

public class EnterAuditListAction extends CommonObject {
    public EnterAuditListAction(WebDriver driver) {
        super(driver);
    }

    public void enter() {
        EnterAuditListObject enterAuditListObject = new EnterAuditListObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        //driver.navigate().refresh();

        logger.info("进入审核列表");

        //概览界面
        enterAuditListObject.overview.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择角色
        enterAuditListObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //主应用
        enterAuditListObject.main.click();
        //设置时间等待
        Sleep.sleep(2000);
        //审核管理
        enterAuditListObject.auditmanager.click();
        //设置时间等待
        Sleep.sleep(2000);
        //审核列表
        enterAuditListObject.auditlist.click();

    }
}
