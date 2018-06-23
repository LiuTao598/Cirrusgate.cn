package cn.testng.com;

import org.testng.annotations.Test;

/**
 * 实现自定义顺序方法执行
 * testng中的priority 属性控制，数字越小越靠前
 */
public class TestNGDemo2 {

    @Test(priority = 1)
    public void bdhad(){

        System.out.println("bdhad1");

    }

    @Test(priority = 2)
    public void qq(){

        System.out.println("bdhad2");

    }

    @Test(priority = 3)
    public void ee(){

        System.out.println("bdhad3");

    }

    @Test(priority = 4)
    public void rr(){

        System.out.println("bdhad4");

    }

    @Test(priority = 5)
    public void tt(){

        System.out.println("bdhad5");

    }




}
