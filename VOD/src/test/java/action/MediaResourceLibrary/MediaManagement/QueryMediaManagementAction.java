package action.MediaResourceLibrary.MediaManagement;

import common.CommonObject;
import common.Sleep;
import object.MediaResourceLibrary.MediaManagement.QueryMediaManagementObject;
import org.openqa.selenium.WebDriver;

public class QueryMediaManagementAction extends CommonObject {
    public QueryMediaManagementAction(WebDriver driver) {
        super(driver);
    }

    public void query(String id) {
        QueryMediaManagementObject queryMediaManagementObject = new QueryMediaManagementObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);
        logger.info("搜索媒资");

        //选择分类
        queryMediaManagementObject.select1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //其他
        queryMediaManagementObject.other.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择ID/名称
        queryMediaManagementObject.select2.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择ID
        queryMediaManagementObject.select3.click();
        //设置时间等待
        Sleep.sleep(2000);
        //输入ID
        queryMediaManagementObject.id.sendKeys(id);
        //设置时间等待
        Sleep.sleep(2000);
        //搜索
        queryMediaManagementObject.query.click();
        //设置时间等待
        Sleep.sleep(2000);

    }
}
