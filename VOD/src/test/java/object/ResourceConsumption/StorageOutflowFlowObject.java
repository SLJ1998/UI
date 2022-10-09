package object.ResourceConsumption;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StorageOutflowFlowObject extends CommonObject {

    public StorageOutflowFlowObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(StorageOutflowFlowObject.class);

    //定位元素
    @FindBy(xpath = "//div[contains(text(),'存储流出流量')]")
    public WebElement storageoutflowflow;//存储流出流量

    @FindBy(xpath = "//label[@class='ant-radio-button-wrapper']")
    public WebElement month;//30天

    @FindBy(xpath = "//button[@class='mr8 ml20 ant-btn ant-btn-primary']")
    public WebElement querybutton;//查询

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-default']")
    public WebElement resetbutton;//重置按钮

    
}