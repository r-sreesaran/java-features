package geeksforgeeks;

import geekforgeeks.CountSubStrings;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CountSubStringTest {

    @Test
    public void test() {
        CountSubStrings count = new CountSubStrings();

        Assert.assertEquals(count.count("10101"),3);

    }
}
