package common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * 用于计数页面应用数量的方法，当结果多于一页的时候，翻页计数总个数
 *  item   :页码框的xpath
 *  obtain :用于数量统计标记的xpath
 *  return :获取的总数量
 * */
public class SearchCount extends CommonObject {
    public SearchCount(WebDriver driver) {
        super(driver);
    }

    public int amount(String item,String obtain){
        int count=0;
        List<WebElement> page=driver.findElements(By.xpath(item));
        System.out.println(page.size());
        for (int i = 0; i <page.size(); i++) {
            Sleep.sleep(2000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElements(By.xpath(item)).get(i));
            //System.out.println(i);
            Sleep.sleep(2000);
            List<WebElement> list = driver.findElements(By.xpath(obtain));
            count += list.size();

        }

        return count;
    }

}
