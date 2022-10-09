package object.MediaResourceLibrary.TranscodingTask;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CancelTranscodingTaskObject extends CommonObject {

    public CancelTranscodingTaskObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(CancelTranscodingTaskObject.class);

    //定位元素
    @FindBy(xpath = "//tr[1]/td[9]/button[1]/a")
    public WebElement cancel1;//取消转码

    @FindBy(xpath = "//button[@class='ant-modal-close ng-star-inserted']")
    public WebElement x;//叉号

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-default']")
    public WebElement cancel;//取消

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement sure;//确定

}