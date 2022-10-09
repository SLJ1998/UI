package object.DistributionManagement.DefaultDistributionConfiguration;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditDefaultDistributionConfigurationObject extends CommonObject {

    public EditDefaultDistributionConfigurationObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(EditDefaultDistributionConfigurationObject.class);

    //定位元素
    @FindBy(xpath = "//i[@class='anticon anticon-edit ml16']")
    public WebElement modify;//修改

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-default']")
    public WebElement cancel;//取消

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement sure;//确定


}