package object.MediaResourceLibrary.MediaUpload;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CancelMediaUploadObject extends CommonObject {

    public CancelMediaUploadObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(CancelMediaUploadObject.class);

    //定位元素
    @FindBy(xpath = "//*[@id=\"page-main\"]//tr[2]/td[11]/a")
    public WebElement cancel1;//取消

    @FindBy(xpath = "//button[@class='ant-modal-close ng-star-inserted']")
    public WebElement x;//叉号

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-default']")
    public WebElement cancel2;//取消

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement sure;//确定

}