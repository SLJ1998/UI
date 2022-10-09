package object.ApplicationManager;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewApplicationObject extends CommonObject {

    public NewApplicationObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(NewApplicationObject.class);

    //定位元素
    @FindBy(xpath = "//button[@class='btn-add ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement creatbutton;//创建应用按钮

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-default']")
    public WebElement cancelbutton;//取消按钮

    @FindBy(xpath = "//span[@class='ant-modal-close-x']")
    public WebElement xbutton;//叉号按钮

    @FindBy(xpath = "//nz-form-control//input[@placeholder='请输入名称']")
    public WebElement name;//输入应用名称

    @FindBy(xpath = "//textarea[@placeholder='请输入描述信息']")
    public WebElement describe;//输入应用描述信息

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement surebutton;//确定按钮




}