package com.molcmar.task;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
    public void testGetFirstElementForEmptyList() {

        List<String> list1 = new ArrayList<>();

        String expectedValue = "0";
        String actualValue = methods.getFirstElement(list1);
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void testGetFirstElement() {

       // List<String> list1 = new ArrayList<>();

        String expectedValue = "a1";
        String actualValue = methods.getFirstElement(list);
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void testGetLastElement() {

//        List<String> list1 = new ArrayList<>();

        String expectedValue = "a1";
        String actualValue;

        Optional<String> o = methods.getLastElement(list);
        if (o.isPresent()) {
            actualValue = o.get();
        } else actualValue = "";

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void testGetLastElementForEmptyList() {

        List<String> list1 = new ArrayList<>();

        String expectedValue = "";
        String actualValue;
        Optional<String> o = methods.getLastElement(list1);
        if (o.isPresent()) {
            actualValue = o.get();
        } else actualValue = "";


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

        String expectedValue = "a3";
        Object actualValue = methods.getValueOf(list, 2);
        assertEquals(expectedValue, actualValue);

    }







}