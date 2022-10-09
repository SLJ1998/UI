package object.MediaResourceLibrary.MediaManagement;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QueryMediaManagementObject extends CommonObject {

    public QueryMediaManagementObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(QueryMediaManagementObject.class);

    //定位元素
    @FindBy(xpath = "//div[@class='ant-select-selection__rendered ng-tns-c28-370 ng-star-inserted']")
    public WebElement select1;//选择分类

    @FindBy(xpath = "//ul/nz-tree-node[1]/li")
    public WebElement other;//其他

    @FindBy(xpath = "//*[@id=\"transcodeTaskSearch\"]//div[@class='ant-select-selection__rendered']")
    public WebElement select2;//选择ID/名称

    @FindBy(xpath = "//*[@id=\"cdk-overlay-40\"]//li[2]")
    public WebElement select3;//选择id

    @FindBy(xpath = "//input[@placeholder='请输入ID']")
    public WebElement id;//输入ID

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-default ant-input-search-button']")
    public WebElement query;//搜索


}