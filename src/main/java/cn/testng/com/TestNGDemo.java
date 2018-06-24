package cn.testng.com;

import org.testng.annotations.*;

public class TestNGDemo {

    @BeforeClass
    public void beforetest(){
        System.out.println("beforeclass执行");
    }

    @BeforeSuite
    public void beforeSuitetest(){
        System.out.println("BeforeSuite执行");
    }

    @BeforeMethod
    public void beforeMethodtest(){
        System.out.println("beforeMethod执行");
    }

    @Test
    public void test(){
        System.out.println("测试第一个testng测试用例");
    }

    @AfterClass
    public void aftertest(){
        System.out.println("afterclass执行");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("afterMethod执行");
    }

    @AfterSuite
    public void afterSuitetest(){
        System.out.println("afterSuitetest执行");
    }
}
