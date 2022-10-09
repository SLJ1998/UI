package object.DistributionManagement.DomainManagement;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditDomainManagementObject extends CommonObject {

    public EditDomainManagementObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(EditDomainManagementObject.class);

    //定位元素
    @FindBy(xpath = "//tr[1]/td[7]/a[1]")
    public WebElement edit;//配置

    @FindBy(xpath = "//i[@class='anticon breadcrumb_i anticon-arrow-left']")
    public WebElement back;//返回

    @FindBy(xpath = "//div[contains(text(),'回源配置')]")
    public WebElement callback;//回源配置

    @FindBy(xpath = "//div[contains(text(),'缓存配置')]")
    public WebElement cache;//缓存配置

    @FindBy(xpath = "//i[@class='anticon anticon-edit ml16']")
    public WebElement modfiy1;//修改

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-default']")
    public WebElement cancel1;//取消

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement sure1;//确定

    @FindBy(xpath = "//button[@class='btn-add ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement creat1;//创建配置

    @FindBy(xpath = "//label[@class='ant-radio-button-wrapper ant-radio-button-wrapper-checked']")
    public WebElement file;//file

    @FindBy(xpath = "//input[@placeholder='请输入内容，例：mp4,flv,ts']")
    public WebElement content;//内容

    @FindBy(xpath = "//span[@class='ant-input-number-handler ant-input-number-handler-up']")
    public WebElement time;//缓存时长

    @FindBy(xpath = "//div[3]/button[@class='ant-btn ng-star-inserted ant-btn-default']")
    public WebElement cancel2;//取消

    @FindBy(xpath = "//div[3]/button[@class='ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement sure2;//确定

    @FindBy(xpath = "//tr[1]/td[5]/a[1]")
    public WebElement modify2;//修改

    @FindBy(xpath = "//tr[1]/td[5]/a[2]")
    public WebElement del;//删除

    @FindBy(xpath = "//div[contains(text(),'HTTPS')]")
    public WebElement https;//https


}