package action.DistributionManagement.CertificateManagement;

import common.CommonObject;
import common.Sleep;
import object.DistributionManagement.CertificateManagement.NewCertificateManagementObject;
import org.openqa.selenium.WebDriver;

public class NewCertificateManagementAction extends CommonObject {
    public NewCertificateManagementAction(WebDriver driver) {
        super(driver);
    }

    public void creat(String name,String remarks,String certificate,String miyue) {
        NewCertificateManagementObject newCertificateManagementObject = new NewCertificateManagementObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);

        logger.info("创建证书");

//        //创建证书
//        newCertificateManagementObject.creat.click();
//        //设置时间等待
//        Sleep.sleep(2000);
//        //叉号
//        newCertificateManagementObject.x.click();
//        //设置时间等待
//        Sleep.sleep(2000);
        //创建证书
        newCertificateManagementObject.creat.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        newCertificateManagementObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //创建证书
        newCertificateManagementObject.creat.click();
        //设置时间等待
        Sleep.sleep(2000);
        //名称
        newCertificateManagementObject.name.sendKeys(name);
        //设置时间等待
        Sleep.sleep(2000);
        //备注
        newCertificateManagementObject.remarks.sendKeys(remarks);
        //设置时间等待
        Sleep.sleep(2000);
        //证书
        newCertificateManagementObject.certificate.sendKeys(certificate);
        //设置时间等待
        Sleep.sleep(2000);
        //秘玥
        newCertificateManagementObject.miyue.sendKeys(miyue);
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        newCertificateManagementObject.sure.click();


    }
}
