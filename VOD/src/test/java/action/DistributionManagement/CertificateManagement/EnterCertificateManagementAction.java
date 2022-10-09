package action.DistributionManagement.CertificateManagement;

import common.CommonObject;
import common.Sleep;
import object.DistributionManagement.CertificateManagement.EnterCertificateManagementObject;
import org.openqa.selenium.WebDriver;

public class EnterCertificateManagementAction extends CommonObject {
    public EnterCertificateManagementAction(WebDriver driver) {
        super(driver);
    }

    public void enter() {
        EnterCertificateManagementObject enterCertificateManagementObject = new EnterCertificateManagementObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        //driver.navigate().refresh();

        logger.info("进入证书管理");

        //概览界面
        enterCertificateManagementObject.overview.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择角色
        enterCertificateManagementObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //管理员
        enterCertificateManagementObject.mainapplication.click();
        //设置时间等待
        Sleep.sleep(2000);
        //全局设置
        enterCertificateManagementObject.globalsettings.click();
        //设置时间等待
        Sleep.sleep(2000);
        //证书管理
        enterCertificateManagementObject.certificate.click();


    }
}
