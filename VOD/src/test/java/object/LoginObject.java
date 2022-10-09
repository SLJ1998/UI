package object;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginObject extends CommonObject {

    public LoginObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(LoginObject.class);

    //定位元素
    @FindBy(xpath = "/html/body/div/div[3]/div[1]/div[2]/div/div/div[1]/div/div[2]/ul/li[1]")
    public WebElement masteraccount;//主账号登录

    @FindBy(xpath = "//*[@id=\"username1\"]")
    public WebElement username;//用户名

    @FindBy(xpath = "//*[@id=\"password1\"]")
    public WebElement password;//密码


    @FindBy(xpath = "//*[@id=\"kc-login1\"]")
    public WebElement loginButton;//登录


}