package object.DistributionManagement.Prefetch;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditPrefetchObject extends CommonObject {

    public EditPrefetchObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(EditPrefetchObject.class);

    //定位元素
    @FindBy(xpath = "//textarea[@placeholder='请输入刷新内容']")
    public WebElement file;//刷新内容

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
    public WebElement submit;//提交


}