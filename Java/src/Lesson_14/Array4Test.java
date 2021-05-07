package Lesson_14;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Array4Test {
    @Test
    public void TestArray1() throws Exception {
        Array4 array4 = new Array4();
        int[] newArray = array4.changeArr(new int[]{1, 1, 4, 1, 3, 5, 6, 7, 8});
        boolean result = Arrays.equals(new int[]{1, 3, 5, 6, 7, 8}, newArray);
        Assert.assertTrue(result);
    }

    @Test
    public void TestArray2() throws Exception {
        Array4 array4 = new Array4();
        int[] newArray = array4.changeArr(new int[]{2, 3, 2, 4, 3, 3, 3, 3, 3});
        boolean result = Arrays.equals(new int[]{3, 3, 3, 3, 3}, newArray);
        Assert.assertTrue(result);
    }

    @Test(expected = RuntimeException.class)
    public void TestArray3() throws Exception {
        Array4 array4 = new Array4();
        int[] newArray = array4.changeArr(new int[]{2, 3, 2, 3, 3, 3, 3, 3, 3});
    }

    @Test
    public void TestArray4() throws Exception {
        Array4 array4 = new Array4();
        int[] newArray = array4.changeArr(new int[]{2, 3, 2, 4, 13, 13, 5, 6, 7});
        boolean result = Arrays.equals(new int[]{13, 13, 5, 6, 7}, newArray);
        Assert.assertTrue(result);
    }
}