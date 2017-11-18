package geekforgeeks;

import java.lang.reflect.Array;

//http://practice.geeksforgeeks.org/problems/yeh-karo-toh-maane/0
public class Fibonacci {
    int[] values;
    public void printFibbonacci() {
        int no =1;
        int start=0;
        int temp=0;
        values = new int[300];

        for(int i=0;i<300;i++) {

            values[i] = no;
            temp = no;
            no = (start+no)%100;
            start = temp;
        }
    }

    public void returnNo(int limit) {
        System.out.println(values[limit%300-1]);
    }

}
