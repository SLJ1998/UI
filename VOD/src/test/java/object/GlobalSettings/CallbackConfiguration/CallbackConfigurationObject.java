package object.GlobalSettings.CallbackConfiguration;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CallbackConfigurationObject extends CommonObject {

    public CallbackConfigurationObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(CallbackConfigurationObject.class);

    //定位元素
    @FindBy(xpath = "//div[2]/fieldset//i")
    public WebElement callback;//回调配置

    @FindBy(xpath = "//span[@class='ant-modal-close-x']")
    public WebElement x;//点击叉号

    @FindBy(xpath = "//button[@nztype='default']")
    public WebElement cancel;//取消按钮

    @FindBy(xpath = "//button[@nztype='primary']")
    public WebElement sure;//确定按钮

    @FindBy(xpath = "////textarea[@placeholder='请输入回调url']")
    public WebElement url;//输入回调url


}