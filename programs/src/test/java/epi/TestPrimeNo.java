package epi;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestPrimeNo {

    @Test
    public void testPrimeNo() {
    PrimeNo test = new PrimeNo();
    List<Boolean> values = test.findPrimeNumbers(20);
    Assert.assertEquals(8,values.stream().filter(i -> i==true).count());
    }
}
