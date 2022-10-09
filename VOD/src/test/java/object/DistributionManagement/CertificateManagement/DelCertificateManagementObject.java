package object.DistributionManagement.CertificateManagement;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DelCertificateManagementObject extends CommonObject {

    public DelCertificateManagementObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(DelCertificateManagementObject.class);

    //定位元素
    @FindBy(xpath = "//tr[1]//a[2]")
    public WebElement del;//删除

    @FindBy(xpath = "//*[@id=\"cdk-overlay-6\"]/nzi-modal/div/div[2]/div/div/button")
    public WebElement x;//叉号

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-default']")
    public WebElement cancel;//取消

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement sure;//确定

}