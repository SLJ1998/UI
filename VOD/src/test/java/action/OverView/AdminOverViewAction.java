package action.OverView;

import object.OverView.AdminOverViewObject;
import common.CommonObject;
import common.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminOverViewAction extends CommonObject {
    public AdminOverViewAction(WebDriver driver) {
        super(driver);
    }

    public void adminOverView() {
        AdminOverViewObject adminOverViewObject = new AdminOverViewObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();

        logger.info("管理员概览界面");

        ////选择概览
        adminOverViewObject.overview.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择应用
        adminOverViewObject.selectapp.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择管理员
        adminOverViewObject.admin.click();
        //设置时间等待
        Sleep.sleep(2000);

        //今天
        adminOverViewObject.today.click();
        //设置时间等待
        Sleep.sleep(2000);
        //昨天
        adminOverViewObject.yesterday.click();
        //设置时间等待
        Sleep.sleep(2000);
        //7天数据
        adminOverViewObject.week.click();
        //设置时间等待
        Sleep.sleep(2000);
        //30天数据
        adminOverViewObject.month.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择时间
//        adminOverViewObject.selecttime.click();
//        //设置时间等待
//        Sleep.sleep(2000);
//        //开始时间
//        adminOverViewObject.start.sendKeys(start);
//        //设置时间等待
//        Sleep.sleep(2000);
//        //结束时间
//        adminOverViewObject.end.sendKeys(end);
//        Sleep.sleep(2000);
//        //转码时长排序
//        adminOverViewObject.transcodingduration.click();
//        //设置时间等待
//        Sleep.sleep(2000);
//        //加速流量排序
//        adminOverViewObject.acceleratedflow.click();

    }
}
