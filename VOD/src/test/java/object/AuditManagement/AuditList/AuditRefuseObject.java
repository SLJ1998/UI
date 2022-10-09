package object.AuditManagement.AuditList;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuditRefuseObject extends CommonObject {

    public AuditRefuseObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(AuditRefuseObject.class);

    //定位元素
    @FindBy(xpath = "//tr[1]/td[6]/a[2]")
    public WebElement refuse;//拒绝

    @FindBy(xpath = "//*[@id=\"cdk-overlay-13\"]//button[@class='ant-modal-close ng-star-inserted']")
    public WebElement x;//叉号

    @FindBy(xpath = "//button[@class='biankaungyanse ant-btn ng-star-inserted ant-btn-default']")
    public WebElement cancel;//取消

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement sure;//确定

    @FindBy(xpath = "//*[@id=\"cdk-overlay-13\"]//div[@class='ant-select-selection__rendered']")
    public WebElement select;//屏蔽原因

    @FindBy(xpath = "//*[@id=\"cdk-overlay-16\"]//li[1]")
    public WebElement reason;// 1001：含有淫秽色情内容

}