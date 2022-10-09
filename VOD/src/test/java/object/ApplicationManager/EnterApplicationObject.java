package object.ApplicationManager;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterApplicationObject extends CommonObject {

    public EnterApplicationObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(EnterApplicationObject.class);

    //定位元素
    @FindBy(xpath = "//aside//a[contains(text(),'概览')]")
    public WebElement overview;//概览界面

    @FindBy(xpath = "//nz-select[@nzplaceholder=\"选择角色\"]")
    public WebElement select;//选择角色

    @FindBy(xpath = "//li[contains(text(),'管理员')]")
    public WebElement admin;//选择管理员

    @FindBy(xpath = "//aside//a[contains(text(),'应用管理')]")
    public WebElement applicationmanager;//应用管理界面

}