package object.MediaResourceLibrary.MediaManagement;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewMediaManagementObject extends CommonObject {

    public NewMediaManagementObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(NewMediaManagementObject.class);

    //定位元素
    @FindBy(xpath = "//button[@class='btn-add ant-btn ant-btn-primary']")
    public WebElement upload;//上传文件

    @FindBy(xpath = "//button[@class='ml10 ant-btn ant-btn-default']")
    public WebElement cancel;//取消

    @FindBy(xpath = "//i[@class='anticon breadcrumb_i anticon-arrow-left']")
    public WebElement back;//返回

}