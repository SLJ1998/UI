package common;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class IntelligentWait {

    public void intelligentWait(WebDriver driver, int timeOut, final String toassert) {
        try {
            (new WebDriverWait(driver, timeOut)).until(new ExpectedCondition<Boolean>() {

                public Boolean apply(WebDriver driver) {
                    return driver.getPageSource().contains(toassert);
                }
            });
        } catch (TimeoutException e) {
            Assert.fail("超时!! " + timeOut + " 秒之后还没找到元素:"+toassert, e);
        }
    }
    //查找
    public boolean elementWait(final WebDriver driver, int timeOut, final String toassert) {
        boolean wait = false;
        try {
            wait = new WebDriverWait(driver, timeOut).until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver d) {

                    return driver.findElement(By.xpath(toassert)).isDisplayed();
                }
            });
        } catch (Exception e) {

        }
        return wait;
    }
    public boolean waitByelement(final WebDriver driver, int timeOut, final WebElement toassert) {
        boolean wait = false;
        try {
            wait = new WebDriverWait(driver, timeOut).until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver d) {

                    return toassert.isDisplayed();
                }
            });
        } catch (Exception e) {

        }
        return wait;
    }


    /**
     * 元素智能等待，timeout单位为秒
     * @param driver
     * @param we
     * @param timeout
     * @return
     */
    public static WebElement waitElement(WebDriver driver, WebElement we, int timeout)
    {
        new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(we));
        return we;
    }




}