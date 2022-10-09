package object.ApplicationManager;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QueryApplicationObject extends CommonObject {

    public QueryApplicationObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(QueryApplicationObject.class);

    //定位元素
    @FindBy(xpath = "//input[@placeholder='请输入名称']")
    public WebElement name;//查询输入名称

    @FindBy(xpath = "//*[@id=\"page-main\"]/div/div/div[2]/app-home/app-manager/div[2]/div/div/div[2]/nz-input-group/span/span/button")
    public WebElement button;//查询按钮



}