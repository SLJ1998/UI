package object.MediaResourceLibrary.MediaManagement;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TranscodingMediaManagementObject extends CommonObject {

    public TranscodingMediaManagementObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(TranscodingMediaManagementObject.class);

    //定位元素
    @FindBy(xpath = "//tr/th[1]/span/div/span/label/span[1]")
    public WebElement select;//选择

    @FindBy(xpath = "//div[2]/div/div/div[1]/div[1]/button")
    public WebElement transcoding;//转码

    @FindBy(xpath = "//button[@class='ant-modal-close ng-star-inserted']")
    public WebElement x;//叉号

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement sure;//确定

    @FindBy(xpath = "//button[@class='biankaungyanse ant-btn ng-star-inserted ant-btn-default']")
    public WebElement cancel;//取消

    @FindBy(xpath = "//tr[1]/td[1]/div/div")
    public WebElement mp4;//选择封装格式


}