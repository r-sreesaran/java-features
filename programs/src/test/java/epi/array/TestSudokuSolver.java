package epi.array;


import epi.array.SudokuChecker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSudokuSolver {

    int values[][] = new int[][]{
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9}};

    int values1[][] = new int[][]{
            {5, 3, 4, 6, 7, 8, 9,1,2},
            { 6, 7,2,1,9,5,3,4,8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}};


    @Test
    public void test () {
        SudokuChecker solver = new SudokuChecker();
        solver.setInputs(values);
        Assert.assertEquals(false,solver.checker());
    }

    @Test
    public void test1() {
        long stopTime;
        long startTime;
        startTime = System.currentTimeMillis();

        SudokuChecker solver = new SudokuChecker();
        solver.setInputs(values1);
        stopTime = System.currentTimeMillis();
        System.out.println("Duration:" + (stopTime-startTime)+" nano seconds");

        Assert.assertEquals(true,solver.checker());

    }
}
