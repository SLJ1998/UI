package object.DistributionManagement.DomainManagement;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DelDomainManagementObject extends CommonObject {

    public DelDomainManagementObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(DelDomainManagementObject.class);

    //定位元素
    @FindBy(xpath = "//tr[1]/td[7]/a[2]")
    public WebElement stop;//停用

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-default']")
    public WebElement cancel;//取消

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement sure;//确定

    @FindBy(xpath = "//tr[1]/td[7]/a[1]")
    public WebElement start;//启用

    @FindBy(xpath = "//tr[1]/td[7]/a[2]")
    public WebElement del;//删除

}