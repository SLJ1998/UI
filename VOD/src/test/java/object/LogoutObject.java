package object;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutObject extends CommonObject {

    public LogoutObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(LogoutObject.class);

    //定位元素
    @FindBy(xpath = "/html/body/app-root/app-default/app-nav-header/header/div/div/nav/div[4]/nz-dropdown[1]/a/img")
    public WebElement name;//登录者名称

    @FindBy(xpath = "/html/body/div/div[3]/div/div/div/ul/li[6]")
    public WebElement logout;//退出登录

}