package object.GlobalSettings.ScreenshotTemplate;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QueryScreenshotTemplateObject extends CommonObject {

    public QueryScreenshotTemplateObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(QueryScreenshotTemplateObject.class);

    //定位元素
    @FindBy(xpath = "//*[@id=\"page-main\"]/div/div/div[2]/app-home/screenshot-template/div[2]/nz-table/nz-spin/div/div/div/div/table/tbody/tr[1]/td[1]/p[1]/a")
    public WebElement detail;//详情

    @FindBy(xpath = "//i[@class='anticon breadcrumb_i anticon-arrow-left']")
    public WebElement back;//返回


}