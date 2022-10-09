package object.GlobalSettings.CallbackConfiguration;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CallbackModeObject extends CommonObject {

    public CallbackModeObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(CallbackModeObject.class);

    //定位元素
    @FindBy(xpath = "//div[3]/fieldset//i")
    public WebElement mode;//回调模式

    @FindBy(xpath = "//span[@class='ant-modal-close-x']")
    public WebElement x;//点击叉号

    @FindBy(xpath = "//button[@nztype='default']")
    public WebElement cancel;//取消按钮

    @FindBy(xpath = "//button[@nztype='primary']")
    public WebElement sure;//确定按钮

    @FindBy(xpath = "//label[@class='ant-radio-button-wrapper ant-radio-button-wrapper-checked']")
    public WebElement normal;//普通回调


}