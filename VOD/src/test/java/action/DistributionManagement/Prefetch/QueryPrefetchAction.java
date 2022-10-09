package action.DistributionManagement.Prefetch;

import common.CommonObject;
import common.Sleep;
import object.DistributionManagement.Prefetch.QueryPrefetchObject;
import org.openqa.selenium.WebDriver;

public class QueryPrefetchAction extends CommonObject {
    public QueryPrefetchAction(WebDriver driver) {
        super(driver);
    }

    public void query(String name) {
        QueryPrefetchObject queryPrefetchObject = new QueryPrefetchObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);

        logger.info("刷新");

        //操作
        queryPrefetchObject.operation.click();
        //设置时间等待
        Sleep.sleep(2000);
        //文件
        queryPrefetchObject.name.sendKeys(name);
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        queryPrefetchObject.sure.click();
        //设置时间等待
        Sleep.sleep(2000);
        //重置
        queryPrefetchObject.reset.click();
        //设置时间等待
        Sleep.sleep(2000);
        //昨天
        queryPrefetchObject.yesterday.click();
        //设置时间等待
        Sleep.sleep(2000);
        //7天
        queryPrefetchObject.week.click();
        //设置时间等待
        Sleep.sleep(2000);
        //30天
        queryPrefetchObject.month.click();
        //设置时间等待
        Sleep.sleep(2000);
        //刷新
        queryPrefetchObject.refresh.click();
        //设置时间等待
        Sleep.sleep(2000);


    }
}
