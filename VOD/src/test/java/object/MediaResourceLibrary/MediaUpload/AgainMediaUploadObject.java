package object.MediaResourceLibrary.MediaUpload;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AgainMediaUploadObject extends CommonObject {

    public AgainMediaUploadObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(AgainMediaUploadObject.class);

    //定位元素
    @FindBy(xpath = "//*[@id=\"page-main\"]//tr[3]/td[11]/a[1]")
    public WebElement again;//重新上传

}