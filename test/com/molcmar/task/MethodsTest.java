package com.molcmar.task;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by dsk14 on 8/21/2018.
 */
public class MethodsTest {
    private Methods methods = new Methods();
    List<String> list;

    @Before
    public void initializeList() {
        list = Arrays.asList("a1","a2","a3", "a1");

    }


    @Test
    public void testCountA1(){
//        List<String> list = new ArrayList<>();
//        list.add("a1");
//        list.add("a2");
//        list.add("a3");
//        list.add("a1");

        int expectedCount = 2;
        int actualCount = methods.countA1(list);

        assertEquals(expectedCount, actualCount);;
    }

    @Test
    public void testGetFirstElement() {

        List<String> list1 = new ArrayList<>();

        Object expectedValue = 0;
        Object actualValue = methods.getFirstElement(list1);
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void testGetLastElement() {

//        List<String> list1 = new ArrayList<>();

        Object expectedValue = "a1";
        Object actualValue = methods.getLastElement(list);
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void testGetEqualElement() {

//        List<String> list1 = new ArrayList<>();

        Object expectedValue = "a3";
        Object actualValue = methods.getEqualElement(list, "a3");
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void testGetValueOf() {

//        List<String> list1 = new ArrayList<>();

        Object expectedValue = "a3";
        Object actualValue = methods.getValueOf(list, 2);
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void testGetSubList() {

      List<String> list1 = new ArrayList<>();



    }






}