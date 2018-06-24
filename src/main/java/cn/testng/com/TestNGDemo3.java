package cn.testng.com;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/**
 *  1.@Test里面的dataProvider=""里面的方法名一定要与DataProvider注解中的方法名一致
 *  2.如果测试方法不传参，会提示方法名重名提示错误
 *
 */
public class TestNGDemo3 {

    @Test(dataProvider = "testDataProvider")
   public void testDataProvider(String userName , String passWord){

        System.out.println("userName "+userName+"\t"+"passWord "+passWord);
    }

    @DataProvider
    public Object[][] testDataProvider(){

        return new Object[][]{
                {"xiaoming1","12345"},
                {"xiaoming2","12345"},
                {"xiaoming3","12345"}
        };
    }
}
