package com.nitin1706.movingavgds.impl;

import com.nitin1706.movingavgds.ListWrapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicListWrapperImplTest {

    private ListWrapper<Integer> list = null;

    @Before
    public void setUp() throws Exception {
        list = new BasicListWrapperImpl();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
        list.add(1);
        list.add(3);
        assertNotNull("List is empty", list);
        assertEquals("List size not as expected", 2, list.size());
    }

    @Test
    public void exists() {
        list.add(8);
        assertTrue(list.exists(8));
        assertFalse(list.exists(3));
    }

    @Test
    public void getElementAt() {
    }

    @Test
    public void getAvgLastN() {
    }

    @Test
    public void getAvgFirstN() {
    }

    @Test
    public void deleteElementAt() {
    }

    @Test
    public void sumAll() {
    }

    @Test
    public void size() {
    }
}