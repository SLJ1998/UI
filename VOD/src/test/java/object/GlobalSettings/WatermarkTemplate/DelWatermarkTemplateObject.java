package object.GlobalSettings.WatermarkTemplate;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DelWatermarkTemplateObject extends CommonObject {

    public DelWatermarkTemplateObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(DelWatermarkTemplateObject.class);

    //定位元素
    @FindBy(xpath = "//div[1]/nz-card//a[@class='pull-right']")
    public WebElement del;//删除

    @FindBy(xpath = "//span[@class='ant-modal-close-x']")
    public WebElement x;//叉号

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-default']")
    public WebElement cancel;//取消

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement sure;//确定


}