package geeksforgeeks;

import epi.DutchNationalFlagProblem;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DutchNationalFlagProblemTest {

    long stopTime;
    long startTime;


    @BeforeMethod
    public void StartTim() {
startTime = System.currentTimeMillis();
    }

    @Test
    public void testInput1() {
    startTime  = System.currentTimeMillis();
        DutchNationalFlagProblem case1 = new DutchNationalFlagProblem();
        case1.arrangeInpts(new int []{0,1,0,1,2,0,1,2,1,1});

    }

    @AfterMethod
    public void calculateTotalTime() {
stopTime = System.currentTimeMillis();
        System.out.println("Duration:" + (stopTime-startTime)+" nano seconds");
        System.out.println("Duration :"+ TimeUnit.NANOSECONDS.toSeconds( stopTime - startTime)+" seconds");

    }

    /*
    Write test for colour arangement using Enum
    * */
}
