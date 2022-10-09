package object.MediaResourceLibrary.WorkflowTask;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QueryWorkflowTaskObject extends CommonObject {

    public QueryWorkflowTaskObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(QueryWorkflowTaskObject.class);

    //定位元素
    @FindBy(xpath = "//*[@id=\"page-main\"]//workflow-task/div[2]//div[2]/nz-select/div/div")
    public WebElement select;//选择

    @FindBy(xpath = "//*[@id=\"cdk-overlay-47\"]//li[1]")
    public WebElement id1;//工作流任务ID

    @FindBy(xpath = "//input[@placeholder='请输入工作流任务ID查询']")
    public WebElement id;//输入转码任务ID

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-default ant-input-search-button']")
    public WebElement query;//搜索按钮

}