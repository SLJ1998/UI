package action.ApplicationManager;

import common.CommonObject;
import common.Sleep;
import object.ApplicationManager.EditApplicationObject;
import object.ApplicationManager.NewApplicationObject;
import org.openqa.selenium.WebDriver;

public class EditApplicationAction extends CommonObject {
    public EditApplicationAction(WebDriver driver) {
        super(driver);
    }

    public void edit(String name,String describe) {
        EditApplicationObject editApplicationObject = new EditApplicationObject(driver);
        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        logger.info("修改应用");
        //点击创建应用
        editApplicationObject.modifybutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //点击取消
        editApplicationObject.cancelbutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //点击创建应用
        editApplicationObject.modifybutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //点击叉号
        editApplicationObject.xbutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //点击创建应用
        editApplicationObject.modifybutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //输入应用名称
        editApplicationObject.name.sendKeys(name);
        //设置时间等待
        Sleep.sleep(2000);
        //输入应用描述
        editApplicationObject.describe.sendKeys(describe);
        //设置时间等待
        Sleep.sleep(2000);
        //点击搜索
        editApplicationObject.surebutton.click();

    }
}
