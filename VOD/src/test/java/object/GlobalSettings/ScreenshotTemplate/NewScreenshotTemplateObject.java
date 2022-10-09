package object.GlobalSettings.ScreenshotTemplate;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewScreenshotTemplateObject extends CommonObject {

    public NewScreenshotTemplateObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(NewScreenshotTemplateObject.class);

    //定位元素
    @FindBy(xpath = "//button[@class='btn-add ant-btn ant-btn-primary']")
    public WebElement creat;//创建截图模板

    @FindBy(xpath = "//i[@class='anticon breadcrumb_i anticon-arrow-left']")
    public WebElement back1;//返回箭头

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-default']")
    public WebElement back2;//返回按钮

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
    public WebElement submit;//提交按钮

    @FindBy(xpath = "//input[@placeholder='请输入模板名称']")
    public WebElement name;//模板名称

}