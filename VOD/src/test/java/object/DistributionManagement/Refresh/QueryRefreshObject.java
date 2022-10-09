package object.DistributionManagement.Refresh;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QueryRefreshObject extends CommonObject {

    public QueryRefreshObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(QueryRefreshObject.class);

    //定位元素
    @FindBy(xpath = "//div[@class='ant-tabs-tab ng-star-inserted']")
    public WebElement operation;//操作

    @FindBy(xpath = "//input[@placeholder='请输入操作内容']")
    public WebElement name;//name

    @FindBy(xpath = "//button[@class='mr8 ml12 ant-btn ant-btn-primary']")
    public WebElement sure;//确定

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-default']")
    public WebElement reset;//重置

    @FindBy(xpath = "//label[@nzvalue='0']")
    public WebElement yesterday;//昨天

    @FindBy(xpath = "//label[@nzvalue='7']")
    public WebElement week;//7天

    @FindBy(xpath = "//label[@nzvalue='30']")
    public WebElement month;//30天

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-default ant-btn-icon-only']")
    public WebElement refresh;//重置



}