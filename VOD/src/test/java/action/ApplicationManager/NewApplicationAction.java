package action.ApplicationManager;

import common.CommonObject;
import common.Sleep;
import object.ApplicationManager.NewApplicationObject;
import org.openqa.selenium.WebDriver;

public class NewApplicationAction extends CommonObject {
    public NewApplicationAction(WebDriver driver) {
        super(driver);
    }

    public void newapplication(String name,String describe) {
        NewApplicationObject newApplicationObject = new NewApplicationObject(driver);
        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        logger.info("创建应用");
        //点击创建应用
        newApplicationObject.creatbutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //点击取消
        newApplicationObject.cancelbutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //点击创建应用
        newApplicationObject.creatbutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //点击叉号
        newApplicationObject.xbutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //点击创建应用
        newApplicationObject.creatbutton.click();
        //设置时间等待
        Sleep.sleep(2000);
        //输入应用名称
        newApplicationObject.name.sendKeys(name);
        //设置时间等待
        Sleep.sleep(2000);
        //输入应用描述
        newApplicationObject.describe.sendKeys(describe);
        //设置时间等待
        Sleep.sleep(2000);
        //点击搜索
        newApplicationObject.surebutton.click();

    }
}
