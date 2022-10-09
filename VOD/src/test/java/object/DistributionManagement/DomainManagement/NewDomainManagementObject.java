package object.DistributionManagement.DomainManagement;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewDomainManagementObject extends CommonObject {

    public NewDomainManagementObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(NewDomainManagementObject.class);

    //定位元素
    @FindBy(xpath = "//button[@class='btn-add ant-btn ant-btn-primary']")
    public WebElement creat;//创建域名

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-default']")
    public WebElement cancel;//取消

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement sure;//确定

    @FindBy(xpath = "//input[@placeholder='请输入加速域名，如：www.example.com']")
    public WebElement name;//名字


}