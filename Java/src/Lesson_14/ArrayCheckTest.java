package Lesson_14;

import org.junit.Assert;
import org.junit.Test;

public class ArrayCheckTest {
    @Test
    public void TestArray1() throws Exception {
        ArrayCheck arrayCheck = new ArrayCheck();
        boolean result = arrayCheck.check(new int[]{1, 1, 1, 4, 4, 1, 4, 4});
        Assert.assertTrue(result);
    }

    @Test
    public void TestArray2() throws Exception {
        ArrayCheck arrayCheck = new ArrayCheck();
        boolean result = arrayCheck.check(new int[]{1, 1, 1, 1, 1, 1, 1, 1});
        Assert.assertFalse(result);
    }

    @Test
    public void TestArray3() throws Exception {
        ArrayCheck arrayCheck = new ArrayCheck();
        boolean result = arrayCheck.check(new int[]{4, 4, 4, 4, 4, 4, 4, 4});
        Assert.assertFalse(result);
    }

    @Test
    public void TestArray4() throws Exception {
        ArrayCheck arrayCheck = new ArrayCheck();
        boolean result = arrayCheck.check(new int[]{4, 1, 1, 4, 4, 0, 4, 4});
        Assert.assertFalse(result);
    }
}
