package object.GlobalSettings.CallbackConfiguration;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterCallbackConfigurationObject extends CommonObject {

    public EnterCallbackConfigurationObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(EnterCallbackConfigurationObject.class);

    //定位元素
    @FindBy(xpath = "//aside//a[contains(text(),'概览')]")
    public WebElement overview;//概览界面

    @FindBy(xpath = "//nz-select[@nzplaceholder=\"选择角色\"]")
    public WebElement select;//选择角色

    @FindBy(xpath = "//li[contains(text(),'主应用')]")
    public WebElement mainapplication;//选择主应用

    @FindBy(xpath = "//aside//a[contains(text(),'全局设置')]")
    public WebElement globalsettings;//全局设置

    @FindBy(xpath = "//aside//a[contains(text(),'回调配置')]")
    public WebElement callback;//回调配置

}