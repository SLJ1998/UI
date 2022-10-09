package object.GlobalSettings.TranscodingTemplate;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewTranscodingTemplateObject extends CommonObject {

    public NewTranscodingTemplateObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(NewTranscodingTemplateObject.class);

    //定位元素
    @FindBy(xpath = "//button[@class='btn-add ant-btn ant-btn-primary']")
    public WebElement creat;//创建转码模板

    @FindBy(xpath = "//*[@id=\"page-main\"]//nz-breadcrumb-item//i")
    public WebElement back1;//返回箭头

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-default']")
    public WebElement back2;//返回按钮

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
    public WebElement submit;//提交按钮

    @FindBy(xpath = "//input[@placeholder='请输入模板名称']")
    public WebElement name;//模板名称

    @FindBy(xpath = "//*[@id=\"page-main\"]//nz-form-item[2]//nz-select")
    public WebElement encapsulationformat;//选择封装格式

    @FindBy(xpath = "//li[contains(text(),'MP4')]")
    public WebElement MP4;//选择MP4

    @FindBy(xpath = "//fieldset[1]/nz-form-item[3]//nz-select")
    public WebElement videocoding;//返回视频编码

    @FindBy(xpath = "//li[contains(text(),'H.264')]")
    public WebElement H264;//选择H.264

    @FindBy(xpath = "//label[@nzvalue='Baseline']")
    public WebElement baseline;//选择Baseline

    @FindBy(xpath = "//fieldset[1]/nz-form-item[4]//nz-select")
    public WebElement resolvingpower;//选择分辨率

    @FindBy(xpath = "//li[contains(text(),' 标清：640*480')]")
    public WebElement standarddefinition;//选择

    @FindBy(xpath = "//label[@nzvalue='ABR']")
    public WebElement ABR;//选择视频码率

    @FindBy(xpath = "//input[@placeholder='请输入视频码率']")
    public WebElement abrnumber;//请输入视频码率

    @FindBy(xpath = "//input[@placeholder='请输入视频帧率']")
    public WebElement videoframerate;//请输入视频码率

    @FindBy(xpath = "//nz-form-item[1]//nz-select")
    public WebElement audiocoding;//选择音频编码

    @FindBy(xpath = "//li[contains(text(),'AAC')]")
    public WebElement AAC;//选择AAC

    @FindBy(xpath = "//input[@placeholder='请输入音频码率']")
    public WebElement audiobitrate;//输入音频码率

    @FindBy(xpath = "//fieldset[2]/nz-form-item[3]//nz-select")
    public WebElement audiosamplingrate;//选择音频采样率

    @FindBy(xpath = "//li[contains(text(),'44100')]")
    public WebElement s44100;//选择44100

    @FindBy(xpath = "//fieldset[2]/nz-form-item[4]//nz-select")
    public WebElement vocaltract;//选择声道

    @FindBy(xpath = "//li[contains(text(),'2')]")
    public WebElement s2;//选择2



}