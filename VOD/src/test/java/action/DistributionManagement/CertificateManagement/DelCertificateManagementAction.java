package action.DistributionManagement.CertificateManagement;

import common.CommonObject;
import common.Sleep;
import object.DistributionManagement.CertificateManagement.DelCertificateManagementObject;
import org.openqa.selenium.WebDriver;

public class DelCertificateManagementAction extends CommonObject {
    public DelCertificateManagementAction(WebDriver driver) {
        super(driver);
    }

    public void del() {
        DelCertificateManagementObject delCertificateManagementObject = new DelCertificateManagementObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);

        logger.info("删除证书");

//        //创建证书
//        delCertificateManagementObject.del.click();
//        //设置时间等待
//        Sleep.sleep(2000);
//        //叉号
//        delCertificateManagementObject.x.click();
//        //设置时间等待
//        Sleep.sleep(2000);
        //创建证书
        delCertificateManagementObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        delCertificateManagementObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //创建证书
        delCertificateManagementObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        delCertificateManagementObject.sure.click();


    }
}
