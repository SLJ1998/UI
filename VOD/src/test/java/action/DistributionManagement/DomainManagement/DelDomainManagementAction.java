package action.DistributionManagement.DomainManagement;

import common.CommonObject;
import common.Sleep;
import object.DistributionManagement.DomainManagement.DelDomainManagementObject;
import org.openqa.selenium.WebDriver;

public class DelDomainManagementAction extends CommonObject {
    public DelDomainManagementAction(WebDriver driver) {
        super(driver);
    }

    public void del() {
        DelDomainManagementObject delDomainManagementObject = new DelDomainManagementObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);

        logger.info("删除域名");

        //停用
        delDomainManagementObject.stop.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        delDomainManagementObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //停用
        delDomainManagementObject.stop.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        delDomainManagementObject.sure.click();
        //设置时间等待
        Sleep.sleep(2000);
        //启用
        delDomainManagementObject.start.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        delDomainManagementObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //启用
        delDomainManagementObject.start.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        delDomainManagementObject.sure.click();
        //设置时间等待
        Sleep.sleep(2000);
        //停用
        delDomainManagementObject.stop.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        delDomainManagementObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //停用
        delDomainManagementObject.stop.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        delDomainManagementObject.sure.click();
        //设置时间等待
        Sleep.sleep(2000);
        //删除
        delDomainManagementObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        delDomainManagementObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //删除
        delDomainManagementObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        delDomainManagementObject.sure.click();




    }
}
