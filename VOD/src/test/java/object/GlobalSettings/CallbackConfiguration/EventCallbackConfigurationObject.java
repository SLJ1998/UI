package object.GlobalSettings.CallbackConfiguration;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventCallbackConfigurationObject extends CommonObject {

    public EventCallbackConfigurationObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(EventCallbackConfigurationObject.class);

    //定位元素
    @FindBy(xpath = "//div[4]/fieldset//i")
    public WebElement callback;//回调模式

    @FindBy(xpath = "//span[@class='ant-modal-close-x']")
    public WebElement x;//点击叉号

    @FindBy(xpath = "//button[@nztype='default']")
    public WebElement cancel;//取消按钮

    @FindBy(xpath = "//button[@nztype='primary']")
    public WebElement sure;//确定按钮

    @FindBy(xpath = "//label[@nzvalue='B']//button[@class='check-button ant-btn ant-btn-default']")
    public WebElement event;//截图任务完成回调


}