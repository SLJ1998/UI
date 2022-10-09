package action.DistributionManagement.Prefetch;

import common.CommonObject;
import common.Sleep;
import object.DistributionManagement.Prefetch.EditPrefetchObject;
import org.openqa.selenium.WebDriver;

public class EditPrefetchAction extends CommonObject {
    public EditPrefetchAction(WebDriver driver) {
        super(driver);
    }

    public void edit(String file) {
        EditPrefetchObject editPrefetchObject = new EditPrefetchObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);

        logger.info("预取");

        //文件
        editPrefetchObject.file.sendKeys(file);
        //设置时间等待
        Sleep.sleep(2000);
        //选择角色
        editPrefetchObject.submit.click();



    }
}
