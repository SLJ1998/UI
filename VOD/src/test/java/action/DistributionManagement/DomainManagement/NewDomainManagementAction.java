package action.DistributionManagement.DomainManagement;

import common.CommonObject;
import common.Sleep;
import object.DistributionManagement.DomainManagement.NewDomainManagementObject;
import org.openqa.selenium.WebDriver;

public class NewDomainManagementAction extends CommonObject {
    public NewDomainManagementAction(WebDriver driver) {
        super(driver);
    }

    public void creat(String name) {
        NewDomainManagementObject newDomainManagementObject = new NewDomainManagementObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);

        logger.info("创建域名");

        //创建
        newDomainManagementObject.creat.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        newDomainManagementObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //创建
        newDomainManagementObject.creat.click();
        //设置时间等待
        Sleep.sleep(2000);
        //名称
        newDomainManagementObject.name.sendKeys(name);
        //设置时间等待
        Sleep.sleep(2000);
        //确定按钮
        newDomainManagementObject.sure.click();



    }
}
