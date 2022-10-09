package object.ResourceConsumption;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterResourceConsumptionObject extends CommonObject {

    public EnterResourceConsumptionObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(EnterResourceConsumptionObject.class);

    //定位元素
    @FindBy(xpath = "//aside//a[contains(text(),'概览')]")
    public WebElement overview;//概览界面

    @FindBy(xpath = "//nz-select[@nzplaceholder=\"选择角色\"]")
    public WebElement select;//选择角色

    @FindBy(xpath = "//li[contains(text(),'主应用')]")
    public WebElement mainapplication;//选择管理员

    @FindBy(xpath = "//aside//a[contains(text(),'资源用量')]")
    public WebElement resourceconsumption;//资源用量界面

}