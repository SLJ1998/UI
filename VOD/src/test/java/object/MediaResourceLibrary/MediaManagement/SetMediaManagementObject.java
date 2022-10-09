package object.MediaResourceLibrary.MediaManagement;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SetMediaManagementObject extends CommonObject {

    public SetMediaManagementObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(SetMediaManagementObject.class);

    //定位元素
    @FindBy(xpath = "//tr/th[1]/span/div/span/label/span[1]")
    public WebElement select1;//选择

    @FindBy(xpath = "//div[2]/div/div/div[1]/div[2]/button")
    public WebElement set;//设置分类

    @FindBy(xpath = "//button[@class='ant-modal-close ng-star-inserted']")
    public WebElement x;//叉号

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
    public WebElement sure;//确定

    @FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-default']")
    public WebElement cancel;//取消

    @FindBy(xpath = "//div[@class='ant-select-selection__rendered ng-tns-c28-400 ng-star-inserted']")
    public WebElement select2;//选择分类

    @FindBy(xpath = "//*[@id=\"cdk-overlay-36\"]/div/nz-tree/ul/nz-tree-node[1]/li/span[2]")
    public WebElement other;//其他


}