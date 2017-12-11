package epi.array;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class DutchNationalFlagProblem {


    public void arrangeInpts(int[] inputs) {
        int hi = inputs.length - 1;
        int mid = 0, low = 0;
        int temp;

        while (mid < hi) {
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
        Arrays.stream(inputs).forEach(System.out::print);
        System.out.println();
    }


}
