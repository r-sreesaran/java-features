package epi.array;

import java.util.Arrays;
import java.util.List;

//Find the maximum difference of the sub array
public class BuyAndSellStock {

    //imperative style programming
    public void calculateMaxSubArrayLen(List<Integer> values) {

        int minValue = values.get(0);
        int maxDifferecnce = 0;
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) < minValue)
                minValue = values.get(i);
            else if (maxDifferecnce < values.get(i) - minValue)
                maxDifferecnce = values.get(i) - minValue;
        }
        System.out.println(maxDifferecnce);

    }

    public static void main(String[] args) {
        BuyAndSellStock test = new BuyAndSellStock();
        test.calculateMaxSubArrayLen(Arrays.asList(310, 315, 275, 295, 260, 270, 290, 230, 255, 250));
    }
}
