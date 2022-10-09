package action.AuditManagement.AuditSettings;

import common.CommonObject;
import common.Sleep;
import object.AuditManagement.AuditSettings.EnterAuditSettingsObject;
import org.openqa.selenium.WebDriver;

public class EnterAuditSettingsAction extends CommonObject {
    public EnterAuditSettingsAction(WebDriver driver) {
        super(driver);
    }

    public void enter() {
        EnterAuditSettingsObject enterAuditSettingsObject = new EnterAuditSettingsObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        //driver.navigate().refresh();

        logger.info("进入审核配置");

        //概览界面
        enterAuditSettingsObject.overview.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择角色
        enterAuditSettingsObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //主应用
        enterAuditSettingsObject.main.click();
        //设置时间等待
        Sleep.sleep(2000);
        //审核管理
        enterAuditSettingsObject.auditmanager.click();
        //设置时间等待
        Sleep.sleep(2000);
        //审核列表
        enterAuditSettingsObject.auditsettings.click();

    }
}
