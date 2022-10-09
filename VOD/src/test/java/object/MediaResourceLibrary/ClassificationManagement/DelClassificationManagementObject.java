package object.MediaResourceLibrary.ClassificationManagement;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DelClassificationManagementObject extends CommonObject {

    public DelClassificationManagementObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(DelClassificationManagementObject.class);

    //定位元素
    @FindBy(xpath = "//tr[2]/td[4]/a[1]")
    public WebElement del;//删除按钮

    @FindBy(xpath = "//*[@id=\"cdk-overlay-37\"]//button[@class='ant-modal-close ng-star-inserted']")
    public WebElement x;//叉号

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-default']")
    public WebElement cancel;//取消

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement sure;//确定

}