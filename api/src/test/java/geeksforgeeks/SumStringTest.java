package geeksforgeeks;

import geekforgeeks.SumOfString;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.junit.ArrayAsserts;

public class SumStringTest {

    @Test
    public void sumStringTestCase1() {

        String[] testCase1 =  {"1","123456"};
        boolean[] expectedResults = {false};

        SumOfString test = new SumOfString();
        boolean[] ActualResults = test.operation(testCase1);


        ArrayAsserts.assertArrayEquals(expectedResults,ActualResults);

    }


    @Test
    public void sumStringTestCase2() {

        String[] testCase1 =  {"1","122436"};
        boolean[] expectedResults = {true};

        SumOfString test = new SumOfString();
        boolean[] ActualResults = test.operation(testCase1);


        ArrayAsserts.assertArrayEquals(expectedResults,ActualResults);

    }



    @Test
    public void sumStringTestCase3() {

        String[] testCase = {"3","12243660","1111112223","2368"};
        boolean[] expectedResults = {false,false,false};

        SumOfString test = new SumOfString();
        boolean[] ActualResults = test.operation(testCase);

        ArrayAsserts.assertArrayEquals(expectedResults,ActualResults);

    }
}
