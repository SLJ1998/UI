package object.GlobalSettings.WorkflowManagement;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterWorkflowManagementObject extends CommonObject {

    public EnterWorkflowManagementObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(EnterWorkflowManagementObject.class);

    //定位元素
    @FindBy(xpath = "//aside//a[contains(text(),'概览')]")
    public WebElement overview;//概览界面

    @FindBy(xpath = "//nz-select[@nzplaceholder=\"选择角色\"]")
    public WebElement select;//选择角色

    @FindBy(xpath = "//li[contains(text(),'主应用')]")
    public WebElement mainapplication;//选择主应用

    @FindBy(xpath = "//aside//a[contains(text(),'全局设置')]")
    public WebElement globalsettings;//全局设置

    @FindBy(xpath = "//aside//a[contains(text(),'工作流管理')]")
    public WebElement workflowmanagement;//水印模板

}