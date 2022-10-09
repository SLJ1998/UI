package object.ResourceConsumption;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AcceleratedBandwidthObject extends CommonObject {

    public AcceleratedBandwidthObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(AcceleratedBandwidthObject.class);

    //定位元素
    @FindBy(xpath = "//div[contains(text(),'加速带宽')]")
    public WebElement acceleratedbandwidth;//加速带宽

    @FindBy(xpath = "//label[@nzvalue='-1']")
    public WebElement yesterday;//昨天

    @FindBy(xpath = "//label[@nzvalue='-6']")
    public WebElement week;//近7天

    @FindBy(xpath = "//label[@nzvalue='-29']")
    public WebElement month;//近30天

    @FindBy(xpath = "//button[@class='mr8 ml20 ant-btn ant-btn-primary']")
    public WebElement querybutton;//查询

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-default']")
    public WebElement resetbutton;//重置按钮


}