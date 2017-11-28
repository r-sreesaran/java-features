package epi;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class DutchNationalFlagProblem {

    int [] inputs = {0,1,0,1,2,0,1,2,1,1};
   // Enum

    public void arrangeInpts() {
long stopTime;
long startTime= System.currentTimeMillis();
        int hi=inputs.length-1;
        int mid=0,low =0;
        int temp;

        while(mid<hi) {
            switch (inputs[mid]) {
                case 0:
                    temp = inputs[low];
                    inputs[low] = inputs[mid];
                    inputs[mid] = temp;
                    mid++;
                    low++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    temp = inputs[mid];
                    inputs[mid] = inputs[hi];
                    inputs[hi] = temp;
                    hi--;
                    break;
            }
        }
        stopTime = System.currentTimeMillis();
        Arrays.stream(inputs).forEach(System.out::print);
        System.out.println();
        System.out.println("Duration:" + (stopTime-startTime)+" nano seconds");
        System.out.println("Duration :"+ TimeUnit.NANOSECONDS.toSeconds( stopTime - startTime)+" seconds");
    }


}
