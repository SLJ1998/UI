package object.GlobalSettings.WatermarkTemplate;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QueryWatermarkTemplateObject extends CommonObject {

    public QueryWatermarkTemplateObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(QueryWatermarkTemplateObject.class);

    //定位元素
    @FindBy(xpath = "//*[@id=\"page-main\"]/div/div/div[2]/app-home/watermark-template/div[2]/div[2]/div[1]/nz-card/div[2]/nz-card-meta/div/div/div/div/div[1]/div/p")
    public WebElement detail;//详情

    @FindBy(xpath = "//*[@id=\"page-main\"]/div/div/div[2]/app-home/watermarkdetails/div/nz-breadcrumb/nz-breadcrumb-item[1]/span[1]/a/i")
    public WebElement back;//返回


}