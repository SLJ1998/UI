package action.DistributionManagement.DefaultDistributionConfiguration;

import common.CommonObject;
import common.Sleep;
import object.DistributionManagement.DefaultDistributionConfiguration.EditDefaultDistributionConfigurationObject;
import org.openqa.selenium.WebDriver;

public class EditDefaultDistributionConfigurationAction extends CommonObject {
    public EditDefaultDistributionConfigurationAction(WebDriver driver) {
        super(driver);
    }

    public void edit() {
        EditDefaultDistributionConfigurationObject editDefaultDistributionConfigurationObject = new EditDefaultDistributionConfigurationObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);

        logger.info("配置默认分发配置");

        //修改
        editDefaultDistributionConfigurationObject.modify.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        editDefaultDistributionConfigurationObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //修改
        editDefaultDistributionConfigurationObject.modify.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        editDefaultDistributionConfigurationObject.sure.click();
        //设置时间等待


    }
}
