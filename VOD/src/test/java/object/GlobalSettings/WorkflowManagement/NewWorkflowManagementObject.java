package object.GlobalSettings.WorkflowManagement;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewWorkflowManagementObject extends CommonObject {

    public NewWorkflowManagementObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(NewWorkflowManagementObject.class);

    //定位元素
    @FindBy(xpath = "//button[@class='btn-add ant-btn ant-btn-primary']")
    public WebElement creat;//添加工作流

    @FindBy(xpath = "//*[@id=\"page-main\"]//nz-breadcrumb-item//i")
    public WebElement back1;//返回箭头

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-default']")
    public WebElement back2;//返回按钮

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
    public WebElement save;//保存按钮

    @FindBy(xpath = "//input[@placeholder='请输入工作流名称']")
    public WebElement name;//工作流名称

    @FindBy(xpath = "//i[@class='iconfont framename pull-right iconhover ant-dropdown-trigger']")
    public WebElement add1;//输入“+”

    @FindBy(xpath = "//*[@id=\"cdk-overlay-2\"]//li[1]")
    public WebElement selecttranscoding;//选择转码处理

    @FindBy(xpath = "//i[@class='iconfont framename pull-right iconhover ng-star-inserted']")
    public WebElement edit1;//编辑

    @FindBy(xpath = "//*[@id=\"cdk-overlay-3\"]//tr[1]/td[1]/div")
    public WebElement select1;//选择转码模板

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement sure1;//确定

}