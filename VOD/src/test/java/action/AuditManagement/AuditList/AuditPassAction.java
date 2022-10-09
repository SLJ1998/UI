package action.AuditManagement.AuditList;

import common.CommonObject;
import common.Sleep;
import object.AuditManagement.AuditList.AuditPassObject;
import org.openqa.selenium.WebDriver;

public class AuditPassAction extends CommonObject {
    public AuditPassAction(WebDriver driver) {
        super(driver);
    }

    public void pass() {
        AuditPassObject auditPassObject = new AuditPassObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);
        logger.info("审核通过");

        //概览界面
        auditPassObject.pass.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择角色
        auditPassObject.x.click();
        //设置时间等待
        Sleep.sleep(2000);
        //主应用
        auditPassObject.pass.click();
        //设置时间等待
        Sleep.sleep(2000);
        //审核管理
        auditPassObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //审核列表
        auditPassObject.pass.click();
        //设置时间等待
        Sleep.sleep(2000);
        //审核列表
        auditPassObject.sure.click();


    }
}
