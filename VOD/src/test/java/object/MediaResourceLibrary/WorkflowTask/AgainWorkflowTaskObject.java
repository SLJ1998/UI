package object.MediaResourceLibrary.WorkflowTask;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AgainWorkflowTaskObject extends CommonObject {

    public AgainWorkflowTaskObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(AgainWorkflowTaskObject.class);

    //定位元素
    @FindBy(xpath = "//tr[1]/td[9]/button[2]/a")
    public WebElement again;//重新转码

    @FindBy(xpath = "//button[@class='ant-modal-close ng-star-inserted']")
    public WebElement x;//叉号

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-default']")
    public WebElement cancel;//取消

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement sure;//确定

}