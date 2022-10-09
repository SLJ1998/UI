package action.ApplicationManager;

import common.CommonObject;
import common.Sleep;
import object.ApplicationManager.OpenMultipleApplicationsObject;
import org.openqa.selenium.WebDriver;

public class OpenMultipleApplicationsAction extends CommonObject {
    public OpenMultipleApplicationsAction(WebDriver driver) {
        super(driver);
    }

    public void open() {
        OpenMultipleApplicationsObject openMultipleApplicationsObject = new OpenMultipleApplicationsObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        logger.info("开通多应用");

        //概览界面
        openMultipleApplicationsObject.overview.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择角色
        openMultipleApplicationsObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //管理员
        openMultipleApplicationsObject.admin.click();
        //设置时间等待
        Sleep.sleep(2000);
        //开通多应用
        openMultipleApplicationsObject.open.click();
        //设置时间等待
        Sleep.sleep(2000);
        //叉号
        openMultipleApplicationsObject.x.click();
        //设置时间等待
        Sleep.sleep(2000);
        //开通多应用
        openMultipleApplicationsObject.open.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        openMultipleApplicationsObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //开通多应用
        openMultipleApplicationsObject.open.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        openMultipleApplicationsObject.sure.click();



    }
}
