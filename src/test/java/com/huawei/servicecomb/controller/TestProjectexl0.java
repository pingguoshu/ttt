package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectexl0 {

        Projectexl0Delegate projectexl0Delegate = new Projectexl0Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectexl0Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}