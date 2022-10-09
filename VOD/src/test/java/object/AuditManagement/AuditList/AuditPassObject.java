package object.AuditManagement.AuditList;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuditPassObject extends CommonObject {

    public AuditPassObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(AuditPassObject.class);

    //定位元素
    @FindBy(xpath = "//tr[1]/td[6]/a[1]")
    public WebElement pass;//通过

    @FindBy(xpath = "//*[@id=\"cdk-overlay-15\"]//button[@class='ant-modal-close ng-star-inserted']")
    public WebElement x;//叉号

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-default']")
    public WebElement cancel;//取消

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement sure;//确定

}