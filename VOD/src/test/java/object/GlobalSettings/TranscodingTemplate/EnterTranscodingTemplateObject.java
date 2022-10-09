package object.GlobalSettings.TranscodingTemplate;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterTranscodingTemplateObject extends CommonObject {

    public EnterTranscodingTemplateObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(EnterTranscodingTemplateObject.class);

    //定位元素
    @FindBy(xpath = "//aside//a[contains(text(),'概览')]")
    public WebElement overview;//概览界面

    @FindBy(xpath = "//nz-select[@nzplaceholder=\"选择角色\"]")
    public WebElement select;//选择角色

    @FindBy(xpath = "//li[contains(text(),'主应用')]")
    public WebElement mainapplication;//选择管理员

    @FindBy(xpath = "//aside//a[contains(text(),'全局设置')]")
    public WebElement globalsettings;//转码模板界面

    @FindBy(xpath = "//aside//a[contains(text(),'转码模板')]")
    public WebElement transcodingtemplate;//转码模板界面

}