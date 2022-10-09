package object.Console;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewObject extends CommonObject {

    public NewObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(NewObject.class);

    //定位元素
    @FindBy(xpath = "//span[@class='ant-modal-close-x']")
    public WebElement submit;//体验新版

    @FindBy(xpath = "//*[@id=\"header-nav\"]/nav/div[3]/div[2]/span/a")
    public WebElement sure;//体验新版

    @FindBy(xpath = "//i[@class='iconfont icon-zonglan store-pro-icon']")
    public WebElement products;//产品与服务

    @FindBy(xpath = "//a[contains(text(),'视频点播')]")
    public WebElement vods;//视频点播

}