package object.GlobalSettings.TranscodingTemplate;

import common.CommonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QueryTranscodingTemplateObject extends CommonObject {

    public QueryTranscodingTemplateObject(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(QueryTranscodingTemplateObject.class);

    //定位元素
    @FindBy(xpath = "//*[@id=\"page-main\"]//transcoding-template//tr[1]//p[1]")
    public WebElement customtemplate;//自定义模板详情

    @FindBy(xpath = "//*[@id=\"page-main\"]//nz-breadcrumb-item//i")
    public WebElement back;//返回

    @FindBy(xpath = "//button[@class='table-top-opt ant-btn ant-btn-default']")
    public WebElement systemtemplate;//查看内置模板

    @FindBy(xpath = "//transcodingbuiltin//tr[1]//a")
    public WebElement detail;//内置模板详情



}