package object.GlobalSettings.ScreenshotTemplate;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DelScreenshotTemplateObject extends CommonObject {

    public DelScreenshotTemplateObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(DelScreenshotTemplateObject.class);

    //定位元素
    @FindBy(xpath = "//*[@id=\"page-main\"]/div/div/div[2]/app-home/screenshot-template/div[2]/nz-table/nz-spin/div/div/div/div/table/tbody/tr[1]/td[4]/a")
    public WebElement del;//删除

    @FindBy(xpath = "//button[@class='ant-modal-close ng-star-inserted']")
    public WebElement x;//叉号

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-default']")
    public WebElement cancel;//取消

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement sure;//确定

}