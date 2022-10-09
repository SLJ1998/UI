package test.OverView;

import action.OverView.AdminOverViewAction;
import action.OverView.AppOverViewAction;
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

public class AdminOverViewTest extends CommonTest {
    public AdminOverViewAction adminOverViewAction;
    public IntelligentWait intelligentWait;
    public ExcelData excelData;


    @DataProvider(name = "appover")//给dataprovider获取到的数组取一个变量名
    public Object[][] words() throws IOException {
        return excelData.getExcelData("src\\test\\java\\data\\OverView", "admin.xlsx", "sheet1");
        //封装ExcelData公用方法获取表格里的数据存到二维数组里作为返回值
    }

    @BeforeClass
    public void before() {
        excelData = new ExcelData();
        intelligentWait = new IntelligentWait();
    }

    @Test(dataProvider = "appover")//名称为@DataProvider注解中获取到的二维数组的名称
    public void enterColumnTypeTest(HashMap<String, String> data) throws IOException {
        adminOverViewAction = new AdminOverViewAction(CommonDriver.getDriver());//初始化Action对象
        adminOverViewAction.adminOverView();//调用Action里的方法对获取到的元素进行操作
        CommonTest.setDriver(adminOverViewAction.getDriver());//加载驱动
        intelligentWait.intelligentWait(adminOverViewAction.driver, 20, data.get("toassert"));//封装的智能等待
        Assert.assertTrue(adminOverViewAction.getDriver().getPageSource().contains(data.get("toassert")));//断言，实际结果与预期结果进行对比
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
