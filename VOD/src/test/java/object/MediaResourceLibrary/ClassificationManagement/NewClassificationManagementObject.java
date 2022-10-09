package object.MediaResourceLibrary.ClassificationManagement;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewClassificationManagementObject extends CommonObject {

    public NewClassificationManagementObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(NewClassificationManagementObject.class);

    //定位元素
    @FindBy(xpath = "//tr[@class='ant-table-row ng-star-inserted']/td/a")
    public WebElement add;//添加一级分类

}