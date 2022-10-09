package object.DistributionManagement.CertificateManagement;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditCertificateManagementObject extends CommonObject {

    public EditCertificateManagementObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(EditCertificateManagementObject.class);

    //定位元素
    @FindBy(xpath = "//tr[1]//a[1]")
    public WebElement edit;//编辑

    @FindBy(xpath = "//*[@id=\"cdk-overlay-4\"]/nzi-modal/div/div[2]/div/div/button")
    public WebElement x;//叉号

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-default']")
    public WebElement cancel;//取消

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement sure;//确定

    @FindBy(xpath = "//input[@placeholder='请输入证书名称']")
    public WebElement name;//证书名称

    @FindBy(xpath = "//input[@placeholder='请输入备注']")
    public WebElement remarks;//备注

    @FindBy(xpath = "//textarea[@placeholder='请输入证书内容']")
    public WebElement certificate;//证书内容

    @FindBy(xpath = "//textarea[@placeholder='请输入秘钥内容']")
    public WebElement miyue;//秘玥内容

}