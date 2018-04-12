package com.example.leem20.makingclasses;

import junit.framework.TestCase;

import static junit.framework.Assert.assertEquals;

/**
 * Created by leem20 on 4/10/2018.
 */

public class ArithmeticTest extends TestCase {

    Arithmetic a;

    @Override
    public void setUp()throws Exception{
        super.setUp();
        a = new Arithmetic();
    }

    public void testArithmeticAdd() {
        assertEquals(a.add(), 5);
        assertEquals(a.subtract(), -1);
        assertEquals(a.multiply(), 6);
        assertEquals(a.divide(), 2/3);
    }

    @Override
    public void tearDown() throws Exception{
        super.tearDown();
    }

}
