package com.blundell.tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyJvmClassTest {

    @Test
    public void testHelloWorld() throws Exception {
        MyJvmClass myJvmClass = new MyJvmClass();

        String text = myJvmClass.getHelloWorld();

        assertEquals(text, "Hello World");
    }
}
