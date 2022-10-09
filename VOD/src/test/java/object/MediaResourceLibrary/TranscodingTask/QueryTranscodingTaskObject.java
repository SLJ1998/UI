package object.MediaResourceLibrary.TranscodingTask;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QueryTranscodingTaskObject extends CommonObject {

    public QueryTranscodingTaskObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(QueryTranscodingTaskObject.class);

    //定位元素
    @FindBy(xpath = "//*[@id=\"transcodeTaskSearch\"]//div[@class='ant-select-selection__rendered']")
    public WebElement select;//选择

    @FindBy(xpath = "//*[@id=\"cdk-overlay-29\"]//li[1]")
    public WebElement id1;//转码任务ID

    @FindBy(xpath = "//input[@placeholder='请输入转码任务ID']")
    public WebElement id;//输入转码任务ID

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-default ant-input-search-button']")
    public WebElement query;//搜索按钮

}