package object.GlobalSettings.TranscodingTemplate;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DelTranscodingTemplateObject extends CommonObject {

    public DelTranscodingTemplateObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(DelTranscodingTemplateObject.class);

    //定位元素
    @FindBy(xpath = "//tr[1]/td[8]/a")
    public WebElement del;//删除

    @FindBy(xpath = "//span[@class='ant-modal-close-x']")
    public WebElement x;//叉号

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-default']")
    public WebElement cancel;//取消

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement sure;//确定


}