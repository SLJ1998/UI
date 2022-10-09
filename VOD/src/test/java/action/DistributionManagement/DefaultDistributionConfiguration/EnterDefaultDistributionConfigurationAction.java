package action.DistributionManagement.DefaultDistributionConfiguration;

import common.CommonObject;
import common.Sleep;
import object.DistributionManagement.DefaultDistributionConfiguration.EnterDefaultDistributionConfigurationObject;
import org.openqa.selenium.WebDriver;

public class EnterDefaultDistributionConfigurationAction extends CommonObject {
    public EnterDefaultDistributionConfigurationAction(WebDriver driver) {
        super(driver);
    }

    public void enter() {
        EnterDefaultDistributionConfigurationObject enterDefaultDistributionConfigurationObject = new EnterDefaultDistributionConfigurationObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        //driver.navigate().refresh();

        logger.info("进入默认分发配置");

        //概览界面
        enterDefaultDistributionConfigurationObject.overview.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择角色
        enterDefaultDistributionConfigurationObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //管理员
        enterDefaultDistributionConfigurationObject.mainapplication.click();
        //设置时间等待
        Sleep.sleep(2000);
        //全局设置
        enterDefaultDistributionConfigurationObject.globalsettings.click();
        //设置时间等待
        Sleep.sleep(2000);
        //默认分发配置
        enterDefaultDistributionConfigurationObject.distribution.click();


    }
}
