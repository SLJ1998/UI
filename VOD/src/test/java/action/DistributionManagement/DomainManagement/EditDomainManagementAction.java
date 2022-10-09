package action.DistributionManagement.DomainManagement;

import common.CommonObject;
import common.Sleep;
import object.DistributionManagement.DomainManagement.EditDomainManagementObject;
import org.openqa.selenium.WebDriver;

public class EditDomainManagementAction extends CommonObject {
    public EditDomainManagementAction(WebDriver driver) {
        super(driver);
    }

    public void edit(String content) {
        EditDomainManagementObject editDomainManagementObject = new EditDomainManagementObject(driver);

        Sleep.sleep(4000);
        //刷新页面
        driver.navigate().refresh();
        Sleep.sleep(4000);

        logger.info("域名配置");

        //创建
        editDomainManagementObject.edit.click();
        //设置时间等待
        Sleep.sleep(2000);
        //回源配置
        editDomainManagementObject.callback.click();
        //设置时间等待
        Sleep.sleep(2000);
        //缓存配置
        editDomainManagementObject.cache.click();
        //设置时间等待
        Sleep.sleep(2000);
        //修改
        editDomainManagementObject.modfiy1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //返回
        editDomainManagementObject.cancel1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //缓存配置
        editDomainManagementObject.cache.click();
        //设置时间等待
        Sleep.sleep(2000);
        //修改
        editDomainManagementObject.modfiy1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //修改
        editDomainManagementObject.creat1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //返回
        editDomainManagementObject.cancel2.click();
        //设置时间等待
        Sleep.sleep(2000);
        //修改
        editDomainManagementObject.creat1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //选择文件
        editDomainManagementObject.file.click();
        //设置时间等待
        Sleep.sleep(2000);
        //输入内容
        editDomainManagementObject.content.sendKeys(content);
        //设置时间等待
        Sleep.sleep(2000);
        //时长
        editDomainManagementObject.time.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        editDomainManagementObject.sure2.click();
        //设置时间等待
        Sleep.sleep(2000);
        //修改
        editDomainManagementObject.modify2.click();
        //设置时间等待
        Sleep.sleep(2000);
        //返回
        editDomainManagementObject.cancel2.click();
        //设置时间等待
        Sleep.sleep(2000);
        //修改
        editDomainManagementObject.modify2.click();
        //设置时间等待
        Sleep.sleep(2000);
        //返回
        editDomainManagementObject.sure2.click();
        //设置时间等待
        Sleep.sleep(2000);
        //删除
        editDomainManagementObject.del.click();
        //设置时间等待
        Sleep.sleep(2000);
        //确定
        editDomainManagementObject.sure1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //https
        editDomainManagementObject.https.click();
        //设置时间等待
        Sleep.sleep(2000);
        //修改
        editDomainManagementObject.modfiy1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //返回
        editDomainManagementObject.cancel2.click();
        //设置时间等待
        Sleep.sleep(2000);
        //https
        editDomainManagementObject.https.click();
        //设置时间等待
        Sleep.sleep(2000);
        //修改
        editDomainManagementObject.modfiy1.click();
        //设置时间等待
        Sleep.sleep(2000);
        //返回
        editDomainManagementObject.sure2.click();
        //设置时间等待
        Sleep.sleep(2000);
        //返回
        editDomainManagementObject.back.click();

    }
}
