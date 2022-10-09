package action.DistributionManagement.CertificateManagement;

import common.CommonObject;
import common.Sleep;
import object.DistributionManagement.CertificateManagement.EditCertificateManagementObject;
import org.openqa.selenium.WebDriver;

public class EditCertificateManagementAction extends CommonObject {
    public EditCertificateManagementAction(WebDriver driver) {
        super(driver);
    }

    public void creat(String remarks,String certificate,String miyue) {
        EditCertificateManagementObject editCertificateManagementObject = new EditCertificateManagementObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);

        logger.info("修改证书");

//        //创建证书
//        editCertificateManagementObject.edit.click();
//        //设置时间等待
//        Sleep.sleep(2000);
//        //叉号
//        editCertificateManagementObject.x.click();
//        //设置时间等待
//        Sleep.sleep(2000);
        //编辑证书
        editCertificateManagementObject.edit.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        editCertificateManagementObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //编辑证书
        editCertificateManagementObject.edit.click();
        //设置时间等待
        Sleep.sleep(2000);
//        //名称
//        editCertificateManagementObject.name.sendKeys(name);
//        //设置时间等待
//        Sleep.sleep(2000);
        //备注
        editCertificateManagementObject.remarks.sendKeys(remarks);
        //设置时间等待
        Sleep.sleep(2000);
        //证书内容
        editCertificateManagementObject.certificate.sendKeys(certificate);
        //设置时间等待
        Sleep.sleep(2000);
        //秘玥
        editCertificateManagementObject.miyue.sendKeys(miyue);
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        editCertificateManagementObject.sure.click();


    }
}
