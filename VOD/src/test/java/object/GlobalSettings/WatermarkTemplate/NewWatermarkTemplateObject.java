package object.GlobalSettings.WatermarkTemplate;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewWatermarkTemplateObject extends CommonObject {

    public NewWatermarkTemplateObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(NewWatermarkTemplateObject.class);

    //定位元素
    @FindBy(xpath = "//button")
    public WebElement creat;//创建水印模板

    @FindBy(xpath = "//newwatermark//nz-breadcrumb//i")
    public WebElement back1;//返回箭头

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-default']")
    public WebElement back2;//返回

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
    public WebElement submit;//提交

    @FindBy(xpath = "//input[@placeholder='请输入模板名称']")
    public WebElement name;//模板名称

    @FindBy(xpath = "//label[@class='img_upload']")
    public WebElement img;//上传图片

    @FindBy(xpath = "//nz-form-item[3]//input")
    public WebElement left;//左边距

    @FindBy(xpath = "//nz-form-item[4]//input")
    public WebElement up;//上边距

    @FindBy(xpath = "//nz-form-item[5]//input")
    public WebElement width;//水印宽度

    @FindBy(xpath = "//nz-form-item[6]//input")
    public WebElement height;//水印高度

    @FindBy(xpath = "//div[@class='ant-select-selection__rendered']")
    public WebElement rate;//水印高度

    @FindBy(xpath = "//li[contains(text(),' 标清：640*480')]")
    public WebElement normal;//标清：640*480

}