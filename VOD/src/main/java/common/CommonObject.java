package common;

import com.sun.istack.internal.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonObject {

    public WebDriver driver;
    public static Logger logger = Logger.getLogger(CommonObject.class);
    public CommonObject(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public WebDriver getDriver() {
        return driver;
    }
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public static String getStringDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(date);
        return dateString;
    }


    public static String subMonth(Date date) {
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dt = df.format(new Date(date.getTime() + 30 * 24 * 60 * 60 * 1000));
        return dt;
    }


}
