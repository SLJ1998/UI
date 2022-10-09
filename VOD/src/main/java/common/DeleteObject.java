package common;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
/**
 *  删除功能
 *  deButton:删除按钮的xpath
 *  return: boolean
 * */
import java.util.List;

public class DeleteObject extends CommonObject {
    public DeleteObject(WebDriver driver) {
        super(driver);
    }


    public boolean delete(String deButton){
        boolean flag=false;
        Sleep.sleep(2000);
        List<WebElement> list=driver.findElements(By.xpath(deButton));
        if(list!=null){
            list.get(0).click();//设置删除第一个
            Actions action = new Actions(driver);
            action.sendKeys(Keys.ENTER).perform();//此处确定按钮不知如何定位，因焦点在确定按钮，设置enter键来确定
            flag=true;
        }

        return flag;
    }
    public boolean deleteChoice(int delete,String deButton){
        boolean flag=false;
        Sleep.sleep(2000);
        List<WebElement> list=driver.findElements(By.xpath(deButton));
        if(list!=null){
            list.get(delete-1).click();//设置删除第几个
            Actions action = new Actions(driver);
            action.sendKeys(Keys.ENTER).perform();//此处确定按钮不知如何定位，因焦点在确定按钮，设置enter键来确定
            flag=true;
        }

        return flag;
    }

}
