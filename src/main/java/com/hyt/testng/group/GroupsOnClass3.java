package com.hyt.testng.group;

import org.testng.annotations.Test;

@Test(groups = "class3")
public class GroupsOnClass3 {
    public void class1(){
        System.out.println("class3运行");
    }
    public void class2(){
        System.out.println("class3第二个运行");
    }
}
