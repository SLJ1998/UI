package object.MediaResourceLibrary.ClassificationManagement;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditClassificationManagementObject extends CommonObject {

    public EditClassificationManagementObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(EditClassificationManagementObject.class);

    //定位元素
    @FindBy(xpath = "//*[@id=\"page-main\"]//tr[2]/td[1]/i")
    public WebElement edit;//编辑按钮

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-default ant-btn-icon-only']")
    public WebElement cancel;//取消

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-icon-only']")
    public WebElement sure;//确定

}