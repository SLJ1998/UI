package object.OverView;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppOverViewObject extends CommonObject {

    public AppOverViewObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(AppOverViewObject.class);

    //定位元素
    @FindBy(xpath = "//nz-select[@nzplaceholder=\"选择角色\"]")
    public WebElement select;//选择角色

    @FindBy(xpath = "//li[contains(text(),'主应用')]")
    public WebElement mainapplication;//选择主应用

    @FindBy(xpath = "//*[contains(text(),'峰值带宽趋势')]")
    public WebElement peakbandwidthtrend;//峰值带宽趋势

    @FindBy(xpath = "//*[contains(text(),'转码时长趋势')]")
    public WebElement transcodingdurationtrend;//转码时长趋势

    @FindBy(xpath = "//*[contains(text(),'存储空间趋势')]")
    public WebElement storagetrend ;//存储空间趋势

    @FindBy(xpath = "//a[contains(text(),'查看更多数据')]")
    public WebElement moredata ;//查看更多数据

}