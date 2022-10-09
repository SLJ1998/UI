package object.ResourceConsumption;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TranscodingDurationObject extends CommonObject {

    public TranscodingDurationObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(TranscodingDurationObject.class);

    //定位元素
    @FindBy(xpath = "//div[contains(text(),'转码时长')]")
    public WebElement transcodingduration;//转码时长

    @FindBy(xpath = "//label[@class='ant-radio-button-wrapper']")
    public WebElement month;//30天

    @FindBy(xpath = "//button[@class='mr8 ml20 ant-btn ant-btn-primary']")
    public WebElement querybutton;//查询

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-default']")
    public WebElement resetbutton;//重置按钮

    
}