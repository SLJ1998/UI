package action.DistributionManagement.Refresh;

import common.CommonObject;
import common.Sleep;
import object.DistributionManagement.Refresh.EnterRefreshObject;
import org.openqa.selenium.WebDriver;

public class EnterRefreshAction extends CommonObject {
    public EnterRefreshAction(WebDriver driver) {
        super(driver);
    }

    public void enter() {
        EnterRefreshObject enterRefreshObject = new EnterRefreshObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        //driver.navigate().refresh();

        logger.info("进入刷新");

        //概览界面
        enterRefreshObject.overview.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择角色
        enterRefreshObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //管理员
        enterRefreshObject.mainapplication.click();
        //设置时间等待
        Sleep.sleep(2000);
        //全局设置
        enterRefreshObject.globalsettings.click();
        //设置时间等待
        Sleep.sleep(2000);
        //刷新
        enterRefreshObject.refresh.click();


    }
}
