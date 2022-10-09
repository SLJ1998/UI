package action.DistributionManagement.DomainManagement;

import common.CommonObject;
import common.Sleep;
import object.DistributionManagement.DomainManagement.QueryDomainManagementObject;
import org.openqa.selenium.WebDriver;

public class QueryDomainManagementAction extends CommonObject {
    public QueryDomainManagementAction(WebDriver driver) {
        super(driver);
    }

    public void query(String name) {
        QueryDomainManagementObject queryDomainManagementObject = new QueryDomainManagementObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);

        logger.info("搜索域名");

        //名称
        queryDomainManagementObject.name.sendKeys(name);
        //设置时间等待
        Sleep.sleep(2000);
        //搜索按钮
        queryDomainManagementObject.search.click();
        //设置时间等待
        Sleep.sleep(2000);
        //刷新
        queryDomainManagementObject.refresh.click();
        //设置时间等待
        Sleep.sleep(2000);



    }
}
