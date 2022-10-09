package object.AuditManagement.AuditSettings;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAuditSettingsObject extends CommonObject {

    public EditAuditSettingsObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(EditAuditSettingsObject.class);

    //定位元素
    @FindBy(xpath = "//i[@class='anticon anticon-edit ml16']")
    public WebElement audit;//审核流程

    @FindBy(xpath = "//button[@class='ant-modal-close ng-star-inserted']")
    public WebElement x;//叉号

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement sure;//确定

    @FindBy(xpath = "//button[@class='biankaungyanse ant-btn ng-star-inserted ant-btn-default']")
    public WebElement cancel;//取消

    @FindBy(xpath = "//label[@nzvalue='afterReview']")
    public WebElement afterReview;//先发后审

}