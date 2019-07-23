package com.hyt.testng;

import org.testng.annotations.*;
public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }
    //在方法运行之前运行
    @BeforeMethod
    public void testCase2(){
        System.out.println("在测试方法之前运行");
    }
    //在方法的运行之后运行
    @AfterMethod
    public void testCase3(){
        System.out.println("在测试方法之后运行");
    }
    @BeforeClass
    public void beforeclass(){
        System.out.println("在类运行之前的方法");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("在类之后的运行的方法");
    }
    //suite套件可以在包含多个类，在类执行之前执行
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforesuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("Aftersuit测试套件");
    }
}
