package test.GlobalSettings.WatermarkTemplate;

import action.GlobalSettings.WatermarkTemplate.DelWatermarkTemplateAction;
import common.CommonDriver;
import common.CommonTest;
import common.ExcelData;
import common.IntelligentWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;

public class DelWatermarkTemplateTest extends CommonTest {
    public DelWatermarkTemplateAction delWatermarkTemplateAction;
    public IntelligentWait intelligentWait;
    public ExcelData excelData;


    @DataProvider(name = "del")//给dataprovider获取到的数组取一个变量名
    public Object[][] words() throws IOException {
        return excelData.getExcelData("src\\test\\java\\data\\GlobalSettings\\WatermarkTemplate", "del.xlsx", "sheet1");
        //封装ExcelData公用方法获取表格里的数据存到二维数组里作为返回值
    }

    @BeforeClass
    public void before() {
        excelData = new ExcelData();
        intelligentWait = new IntelligentWait();
    }

    @Test(dataProvider = "del")//名称为@DataProvider注解中获取到的二维数组的名称
    public void loginTest(HashMap<String, String> data) throws IOException {
        delWatermarkTemplateAction = new DelWatermarkTemplateAction(CommonDriver.getDriver());//初始化Action对象
        delWatermarkTemplateAction.del();//调用Action里的方法对获取到的元素进行操作
//        loginAction.login("admin", "123456a?admin","0");//调用Action里的方法对获取到的元素进行操作
        CommonTest.setDriver(delWatermarkTemplateAction.getDriver());//加载驱动
        intelligentWait.intelligentWait(delWatermarkTemplateAction.driver, 20, data.get("toassert"));//封装的智能等待
        Assert.assertTrue(delWatermarkTemplateAction.getDriver().getPageSource().contains(data.get("toassert")));//断言，实际结果与预期结果进行对比
    }


    @AfterClass
    public void after() {
//       loginobject.getDriver().quit();
//        System.out.println(resultList);
//        setResultData=new SetResultData();
//        try {
//            setResultData.SetResult("src\\test\\java\\data","login.xlsx","sheet1",resultList,"reslut");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

}
