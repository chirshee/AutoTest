package com.hyt.testng.group;

import org.testng.annotations.Test;

@Test(groups = "class1")
public class GroupsOnClass1 {
    public void class1(){
        System.out.println("class1运行");
    }
    public void class2(){
        System.out.println("class1第二个运行");
    }

}
