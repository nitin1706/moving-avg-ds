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
    public void getAvgFirstN() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertEquals(new Double(2.0), new Double(list.getAvgFirstN(3)));
        assertEquals(new Double(1.0), new Double(list.getAvgFirstN(1)));
        assertEquals(new Double(0.0), new Double(list.getAvgFirstN(0)));
    }

    @Test
    public void getAvgLastN() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertEquals(new Double(4.0), new Double(list.getAvgLastN(3)));
        assertEquals(new Double(5.0), new Double(list.getAvgLastN(1)));
        assertEquals(new Double(0.0), new Double(list.getAvgLastN(0)));
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

    @Test
    public void getAvg() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertEquals(new Double(list.getAvg()), new Double(3.0));
    }
}