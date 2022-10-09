package action.AuditManagement.AuditList;

import common.CommonObject;
import common.Sleep;
import object.AuditManagement.AuditList.AuditRefuseObject;
import org.openqa.selenium.WebDriver;

public class AuditRefuseAction extends CommonObject {
    public AuditRefuseAction(WebDriver driver) {
        super(driver);
    }

    public void refuse() {
        AuditRefuseObject auditRefuseObject = new AuditRefuseObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);
        logger.info("审核屏蔽");

        //屏蔽
        auditRefuseObject.refuse.click();
        //设置时间等待
        Sleep.sleep(2000);
        //叉号
        auditRefuseObject.x.click();
        //设置时间等待
        Sleep.sleep(2000);
        //屏蔽
        auditRefuseObject.refuse.click();
        //设置时间等待
        Sleep.sleep(2000);
        //取消
        auditRefuseObject.cancel.click();
        //设置时间等待
        Sleep.sleep(2000);
        //屏蔽
        auditRefuseObject.refuse.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择屏蔽原因
        auditRefuseObject.select.click();
        //设置时间等待
        Sleep.sleep(2000);
        //原因
        auditRefuseObject.reason.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        auditRefuseObject.sure.click();

    }
}
