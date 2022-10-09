package object.DistributionManagement.Refresh;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditRefreshObject extends CommonObject {

    public EditRefreshObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(EditRefreshObject.class);

    //定位元素
    @FindBy(xpath = "//textarea[@placeholder='请输入刷新内容']")
    public WebElement file;//刷新内容

    @FindBy(xpath = "//textarea[@placeholder='请输入刷新内容']")
    public WebElement menu;//刷新内容

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
    public WebElement submit;//提交

    @FindBy(xpath = "//label[@class='ant-radio-button-wrapper ant-radio-button-wrapper-checked']")
    public WebElement catalogue;//目录

}