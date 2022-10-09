package action.ApplicationManager;

import common.CommonObject;
import common.Sleep;
import object.ApplicationManager.QueryApplicationObject;
import org.openqa.selenium.WebDriver;

public class QueryApplicationAction extends CommonObject {
    public QueryApplicationAction(WebDriver driver) {
        super(driver);
    }

    public void query(String name) {
        QueryApplicationObject queryApplicationObject = new QueryApplicationObject(driver);
        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        logger.info("查询应用");

        //输入应用名称
        queryApplicationObject.name.sendKeys(name);
        //设置时间等待
        Sleep.sleep(4000);
        //点击搜索
        queryApplicationObject.button.click();

    }
}
