package object.GlobalSettings.WorkflowManagement;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditWorkflowManagementObject extends CommonObject {

    public EditWorkflowManagementObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(EditWorkflowManagementObject.class);

    //定位元素
    @FindBy(xpath = "//*[@id=\"page-main\"]//workflow-template//tr[1]/td[3]/a[1]")
    public WebElement stop;//停用工作流

    @FindBy(xpath = "//*[@id=\"page-main\"]//workflow-template//tr[1]/td[3]/a[1]")
    public WebElement start;//启用工作流

    @FindBy(xpath = "//*[@id=\"page-main\"]//workflow-template//tr[1]/td[3]/a[2]")
    public WebElement del;//删除

    @FindBy(xpath = "//button[@class='ant-modal-close ng-star-inserted']")
    public WebElement x;//叉号

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-default']")
    public WebElement cancel;//取消

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement sure;//确定



}