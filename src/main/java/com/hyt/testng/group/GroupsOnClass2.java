package com.hyt.testng.group;

import org.testng.annotations.Test;

@Test(groups = "class2")
public class GroupsOnClass2 {
    public void class1(){
        System.out.println("class2运行");
    }
    public void class2(){
        System.out.println("class2第二个运行");
    }
}
