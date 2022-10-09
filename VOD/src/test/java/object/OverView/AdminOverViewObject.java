package object.OverView;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminOverViewObject extends CommonObject {

    public AdminOverViewObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(AdminOverViewObject.class);

    //定位元素
    @FindBy(xpath = "//aside//a[contains(text(),'概览')]")
    public WebElement overview;//选择概览

    @FindBy(xpath = "//nz-select[@nzplaceholder=\"选择角色\"]")
    public WebElement selectapp;//选择角色

    @FindBy(xpath = "//li[contains(text(),'管理员')]")
    public WebElement admin;//选择管理员

    @FindBy(xpath = "//label[@nzvalue='Today']")
    public WebElement today;//今天

    @FindBy(xpath = "//label[@nzvalue='yesterday']")
    public WebElement yesterday;//昨天

    @FindBy(xpath = "//label[@nzvalue='week']")
    public WebElement week;//近7天

    @FindBy(xpath = "//label[@nzvalue='Month']")
    public WebElement month;//30天数据

    @FindBy(xpath = "//span[@class='ant-calendar-picker-input ant-input ng-star-inserted']")
    public WebElement selecttime;//选择时间

    @FindBy(xpath = "//input[@placeholder='开始时间']")
    public WebElement start;//开始时间

    @FindBy(xpath = "//input[@placeholder='结束时间']")
    public WebElement end;//结束时间

    @FindBy(xpath = "/html/body/app-root/app-default/div/div/div/div[2]/app-home/app-overview/div[4]/div[2]/nz-card/div[2]/div/nz-table/nz-spin/div/div/div/div/table/thead/tr/th[3]/span/div/div/div/i[2]/svg/path")
    public WebElement transcodingduration;//转码时长排序

    @FindBy(xpath = "/html/body/app-root/app-default/div/div/div/div[2]/app-home/app-overview/div[4]/div[2]/nz-card/div[2]/div/nz-table/nz-spin/div/div/div/div/table/thead/tr/th[4]/span/div/div/div/i[1]/svg/path")
    public WebElement acceleratedflow;//加速流量排序

}