package action.MediaResourceLibrary.MediaManagement;

import common.CommonObject;
import common.Sleep;
import object.MediaResourceLibrary.MediaManagement.SetMediaManagementObject;
import org.openqa.selenium.WebDriver;

public class SetMediaManagementAction extends CommonObject {
    public SetMediaManagementAction(WebDriver driver) {
        super(driver);
    }

    public void set() {
        SetMediaManagementObject setMediaManagementObject = new SetMediaManagementObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);
        logger.info("设置分类");

        //选择
        setMediaManagementObject.select1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //设置分类
        setMediaManagementObject.set.click();
        //设置时间等待
        Sleep.sleep(2000);
        //叉号
        setMediaManagementObject.x.click();
        //设置时间等待
        Sleep.sleep(2000);
        //设置分类
        setMediaManagementObject.set.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        setMediaManagementObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //设置分类
        setMediaManagementObject.set.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择分类
        setMediaManagementObject.select2.click();
        //设置时间等待
        Sleep.sleep(2000);
        //其他
        setMediaManagementObject.other.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        setMediaManagementObject.sure.click();
        //设置时间等待
        Sleep.sleep(2000);

    }
}
