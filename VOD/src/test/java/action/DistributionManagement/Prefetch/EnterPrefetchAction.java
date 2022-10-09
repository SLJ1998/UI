package action.DistributionManagement.Prefetch;

import common.CommonObject;
import common.Sleep;
import object.DistributionManagement.Prefetch.EnterPrefetchObject;
import org.openqa.selenium.WebDriver;

public class EnterPrefetchAction extends CommonObject {
    public EnterPrefetchAction(WebDriver driver) {
        super(driver);
    }

    public void enter() {
        EnterPrefetchObject enterPrefetchObject = new EnterPrefetchObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        //driver.navigate().refresh();

        logger.info("进入预取");

        //概览界面
        enterPrefetchObject.overview.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择角色
        enterPrefetchObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //管理员
        enterPrefetchObject.mainapplication.click();
        //设置时间等待
        Sleep.sleep(2000);
        //全局设置
        enterPrefetchObject.globalsettings.click();
        //设置时间等待
        Sleep.sleep(2000);
        //默认分发配置
        enterPrefetchObject.prefetch.click();


    }
}
