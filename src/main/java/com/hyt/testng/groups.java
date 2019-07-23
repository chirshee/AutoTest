package com.hyt.testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class groups {
    @Test(groups = "server")
    public void Test1(){
        System.out.println("这是服务端的组1111");
    }
    @Test(groups = "server")
    public void Test2(){
        System.out.println("这是服务端的组2222");
    }
    @Test(groups = "client")
    public void Test3(){
        System.out.println("这是客户端的组1111");
    }
    @Test(groups = "client")
    public void Test4(){
        System.out.println("这是客户端的组2222");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端运行之前的方法");
    }
    @AfterGroups("server")
    public void afterGroupsOnserver(){
        System.out.println("这是服务端运行之后的方法");
    }
}
