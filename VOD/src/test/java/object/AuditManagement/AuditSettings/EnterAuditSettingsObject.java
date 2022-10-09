package object.AuditManagement.AuditSettings;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterAuditSettingsObject extends CommonObject {

    public EnterAuditSettingsObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(EnterAuditSettingsObject.class);

    //定位元素
    @FindBy(xpath = "//aside//a[contains(text(),'概览')]")
    public WebElement overview;//概览界面

    @FindBy(xpath = "//nz-select[@nzplaceholder=\"选择角色\"]")
    public WebElement select;//选择角色

    @FindBy(xpath = "//li[contains(text(),'主应用')]")
    public WebElement main;//选择主应用

    @FindBy(xpath = "//aside//a[contains(text(),'审核管理')]")
    public WebElement auditmanager;//审核管理界面

    @FindBy(xpath = "//aside//a[contains(text(),'审核设置')]")
    public WebElement auditsettings;//审核设置界面

}