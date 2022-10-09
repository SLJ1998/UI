package action.DistributionManagement.Refresh;

import common.CommonObject;
import common.Sleep;
import object.DistributionManagement.Refresh.EditRefreshObject;
import object.DistributionManagement.Refresh.EnterRefreshObject;
import org.openqa.selenium.WebDriver;

public class EditRefreshAction extends CommonObject {
    public EditRefreshAction(WebDriver driver) {
        super(driver);
    }

    public void edit(String file,String menu) {
        EditRefreshObject editRefreshObject = new EditRefreshObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);

        logger.info("刷新");

        //文件
        editRefreshObject.file.sendKeys(file);
        //设置时间等待
        Sleep.sleep(2000);
        //选择角色
        editRefreshObject.submit.click();
        //设置时间等待
        Sleep.sleep(2000);
        driver.navigate().refresh();
        //选择目录
        editRefreshObject.catalogue.click();
        //设置时间等待
        Sleep.sleep(2000);
        //填写
        editRefreshObject.menu.sendKeys(menu);
        //设置时间等待
        Sleep.sleep(2000);
        //提交
        editRefreshObject.submit.click();


    }
}
