package object.DistributionManagement.DomainManagement;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QueryDomainManagementObject extends CommonObject {

    public QueryDomainManagementObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(QueryDomainManagementObject.class);

    //定位元素
    @FindBy(xpath = "//input[@placeholder='请输入域名']")
    public WebElement name;//请输入域名

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-default ant-input-search-button']")
    public WebElement search;//搜索按钮

    @FindBy(xpath = "//button[@class='table-top-opt ant-btn ant-btn-default ant-btn-icon-only']")
    public WebElement refresh;//刷新


}