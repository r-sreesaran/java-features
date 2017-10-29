package org.wildcraft.util.arrays;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * Created by NSR on 2/6/2017.
 */
@Test
public class ArraysTest {

    Logger LOG = LoggerFactory.getLogger(ArraysTest.class.getName());
    int[] actual = new int[] {5,4,3,1,2};
    int[] expected = new int[] {1,2,3,4,5};



    @Test
    public void testArraysCompare() {
        byte[] a = new byte[]{1, 2, 3, 4, 4, 4, 4, 4, 4, 4, 4}; // Size doesn't matter, only content
        byte[] b = new byte[]{1, 2, 3, 4};

        LOG.info("Difference in Length: "+Arrays.compare(a, b));
    }

    @Test
    public void testArraysCompareWithDifferentArray() {
        byte[] a = new byte[]{1, 2, 3, 4, 4, 4, 4, 4, 4, 4, 4};
        byte[] b = new byte[]{5, 6, 7, 8};
        LOG.info("Difference in Length: "+Arrays.compare(a, b));
    }

    @Test
    public void testToString() {

        int[] a = new int[] {1,2,3};
        String expected ="[1, 2, 3]";
        String actual = Arrays.toString(a);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testSortArray() {

        Arrays.sort(actual);
        Assert.assertEquals(expected,actual);

    }

    @Test (enabled = false)
    public void testToStream() {

        //Arrays.stream(expected).
    }

    @Test
    public void testSortArrayofSpecificRange() {

        Arrays.sort(actual,0,2);
        expected = new int[] {3,4,5,1,2};
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testSetall() {

       // Arrays.setAll(expected,);
    }

    @Test
    public void testFill() {

        int a [] = new int[] {1,2,3};
        Arrays.fill(a,1);
        Assert.assertEquals(a,new int[]{1,1,1});

     }

    @Test
    public void testCopyOfRange() {
        int[] copy;
        copy = Arrays.copyOfRange(actual,0,2);
        Assert.assertEquals(copy,new int[] {1,2,3});
    }


}
