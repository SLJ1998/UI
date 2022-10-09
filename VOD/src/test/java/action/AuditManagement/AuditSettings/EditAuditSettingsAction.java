package action.AuditManagement.AuditSettings;

import common.CommonObject;
import common.Sleep;
import object.AuditManagement.AuditSettings.EditAuditSettingsObject;
import object.AuditManagement.AuditSettings.EnterAuditSettingsObject;
import org.openqa.selenium.WebDriver;

public class EditAuditSettingsAction extends CommonObject {
    public EditAuditSettingsAction(WebDriver driver) {
        super(driver);
    }

    public void edit() {
        EditAuditSettingsObject editAuditSettingsObject = new EditAuditSettingsObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);
        logger.info("审核流程配置");

        //审核流程
        editAuditSettingsObject.audit.click();
        //设置时间等待
        Sleep.sleep(2000);
        //叉号
        editAuditSettingsObject.x.click();
        //设置时间等待
        Sleep.sleep(2000);
        //审核流程
        editAuditSettingsObject.audit.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        editAuditSettingsObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //审核流程
        editAuditSettingsObject.audit.click();
        //设置时间等待
        Sleep.sleep(2000);
        //先发后审
        editAuditSettingsObject.afterReview.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        editAuditSettingsObject.sure.click();

    }
}
