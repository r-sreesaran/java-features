package geeksforgeeks;

import geekforgeeks.RotateAndDelete;
import org.testng.annotations.Test;

public class RotateAndDeleteTest {

    @Test
    public void tc1() {
        RotateAndDelete.m=1;
        RotateAndDelete.arr = new int[] {1,2,3,4,5,6};
        RotateAndDelete.n = RotateAndDelete.arr.length;
        RotateAndDelete tc1 = new RotateAndDelete();
        tc1.intiateRotate();

    }
}
