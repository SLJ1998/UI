package object.GlobalSettings.CallbackConfiguration;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CallbackTestObject extends CommonObject {

    public CallbackTestObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(CallbackTestObject.class);

    //定位元素
    @FindBy(xpath = "//div[5]/fieldset//i")
    public WebElement callback;//回调测试

    @FindBy(xpath = "//span[@class='ant-modal-close-x']")
    public WebElement x;//点击叉号

    @FindBy(xpath = "//button[@nztype='default']")
    public WebElement cancel;//取消按钮

    @FindBy(xpath = "//button[@nztype='primary']")
    public WebElement sure;//确定按钮

    @FindBy(xpath = "//textarea[@placeholder='请输入回调测试文本']")
    public WebElement test;//截图任务完成回调

}