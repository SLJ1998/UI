package object.ApplicationManager;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartApplicationObject extends CommonObject {

    public StartApplicationObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(StartApplicationObject.class);

    //定位元素
    @FindBy(xpath = "//nz-table//tr[1]//a[2]")
    public WebElement startbutton;//启用按钮

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-default']")
    public WebElement cancelbutton;//取消按钮

    @FindBy(xpath = "//span[@class='ant-modal-close-x']")
    public WebElement xbutton;//叉号按钮

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement surebutton;//确定按钮




}