package com.hyt.testng;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("ignore1  Test被执行 ");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2  Test被忽略 ");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3  Test被执行 ");
    }

}
