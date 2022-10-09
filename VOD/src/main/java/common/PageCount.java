package common;
/**
 * @param  item :页码框的xpath；
 * @param  obtain :用于数量统计标记的xpath；
 * @param  page :选择页面数量的选择框的xpath；
 * @param  index1：选择的是 用于页面数量选择框xpath组成的list<WebeElement> 中的第几个，若该xpath唯一，择此参数为1；
 * @param  count:数据表格中传入的参数；
 * @param  index2:选择的是 用于点击选择页数/条 xpath组成的list<WebeElement> 中的第几个，若该xpath唯一，择此参数为1；
 * @return  返回 页面数量 与 选择页数每条 的比较 && 实际页数 与 预期页数 的比较
 * */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageCount extends CommonObject {
    public PageCount(WebDriver driver) {
        super(driver);
    }
    public boolean pagecount(String itme,String obtain,String page,int index1,String count,int index2){
        //获取应用总数量
        int countall=new SearchCount(CommonDriver.getDriver()).amount(itme,obtain);
        driver.navigate().refresh();
        //选择 条/页
        Sleep.sleep(2000);
        driver.findElements(By.xpath(page)).get(index1-1).click();

        Sleep.sleep(2000);
        driver.findElements(By.xpath("//*[contains(text(), '" + count + "')]")).get(index2-1).click();
        Sleep.sleep(2000);
        //获取第一页页面应用数量
        int number = driver.findElements(By.xpath(obtain)).size();

        //获取页数
        Sleep.sleep(2000);
        int itmecount=driver.findElements(By.xpath(itme)).size();
        //count数据处理
        int expect=Integer.parseInt(count.replaceAll("[^0-9]",""));
        //应有页数
        int expectcount=countall/expect;
        if(countall%expect!=0){
            expectcount+=1;
        }
        System.out.println("共有："+countall+"条数据\n第一页共有"+number+"条数据，预期有"+expect+"条数据\n共有"+itmecount+"页，预期有"+expectcount+"页");
        //返回 页面数量 与 选择页数每条 的比较 && 实际页数 与 预期页数 的比较
        boolean flag=number==expect&&itmecount==expectcount;
        if(expect>countall){
            flag=true;
        }
        return flag;
    }
}
