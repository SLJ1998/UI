package action.DistributionManagement.Refresh;

import common.CommonObject;
import common.Sleep;
import object.DistributionManagement.Refresh.EditRefreshObject;
import object.DistributionManagement.Refresh.QueryRefreshObject;
import org.openqa.selenium.WebDriver;

public class QueryRefreshAction extends CommonObject {
    public QueryRefreshAction(WebDriver driver) {
        super(driver);
    }

    public void query(String name) {
        QueryRefreshObject queryRefreshObject = new QueryRefreshObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);

        logger.info("刷新");

        //操作
        queryRefreshObject.operation.click();
        //设置时间等待
        Sleep.sleep(2000);
        //文件
        queryRefreshObject.name.sendKeys(name);
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        queryRefreshObject.sure.click();
        //设置时间等待
        Sleep.sleep(2000);
        //重置
        queryRefreshObject.reset.click();
        //设置时间等待
        Sleep.sleep(2000);
        //昨天
        queryRefreshObject.yesterday.click();
        //设置时间等待
        Sleep.sleep(2000);
        //7天
        queryRefreshObject.week.click();
        //设置时间等待
        Sleep.sleep(2000);
        //30天
        queryRefreshObject.month.click();
        //设置时间等待
        Sleep.sleep(2000);
        //刷新
        queryRefreshObject.refresh.click();
        //设置时间等待
        Sleep.sleep(2000);


    }
}
