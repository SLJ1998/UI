package object.MediaResourceLibrary.ClassificationManagement;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterClassificationManagementObject extends CommonObject {

    public EnterClassificationManagementObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(EnterClassificationManagementObject.class);

    //定位元素
    @FindBy(xpath = "//aside//a[contains(text(),'概览')]")
    public WebElement overview;//概览界面

    @FindBy(xpath = "//nz-select[@nzplaceholder=\"选择角色\"]")
    public WebElement select;//选择角色

    @FindBy(xpath = "//li[contains(text(),'主应用')]")
    public WebElement main;//选择主应用

    @FindBy(xpath = "//aside//a[contains(text(),'媒体资源库')]")
    public WebElement media;//媒体资源库

    @FindBy(xpath = "//aside//a[contains(text(),'分类管理')]")
    public WebElement classification;//分类管理界面

}