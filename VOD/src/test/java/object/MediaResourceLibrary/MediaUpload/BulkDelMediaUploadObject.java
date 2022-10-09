package object.MediaResourceLibrary.MediaUpload;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BulkDelMediaUploadObject extends CommonObject {

    public BulkDelMediaUploadObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(BulkDelMediaUploadObject.class);

    //定位元素
    @FindBy(xpath = "//*[@id=\"page-main\"]//tr[1]/td[11]/a[2]")
    public WebElement del;//删除

    @FindBy(xpath = "//button[@class='ant-modal-close ng-star-inserted']")
    public WebElement x;//叉号

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-default']")
    public WebElement cancel;//取消

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement sure;//确定

}