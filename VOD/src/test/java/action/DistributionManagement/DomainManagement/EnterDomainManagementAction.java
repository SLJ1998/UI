package action.DistributionManagement.DomainManagement;

import common.CommonObject;
import common.Sleep;
import object.DistributionManagement.DomainManagement.EnterDomainManagementObject;
import org.openqa.selenium.WebDriver;

public class EnterDomainManagementAction extends CommonObject {
    public EnterDomainManagementAction(WebDriver driver) {
        super(driver);
    }

    public void enter() {
        EnterDomainManagementObject enterDomainManagementObject = new EnterDomainManagementObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        //driver.navigate().refresh();

        logger.info("进入域名管理");

        //概览界面
        enterDomainManagementObject.overview.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择角色
        enterDomainManagementObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //管理员
        enterDomainManagementObject.mainapplication.click();
        //设置时间等待
        Sleep.sleep(2000);
        //全局设置
        enterDomainManagementObject.globalsettings.click();
        //设置时间等待
        Sleep.sleep(2000);
        //默认分发配置
        enterDomainManagementObject.domin.click();


    }
}
