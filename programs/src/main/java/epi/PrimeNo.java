package epi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//This will find all the prime numbers within the given limit
public class PrimeNo {


    public List<Boolean> findPrimeNumbers(int no) {
        List<Integer> noList = new ArrayList<Integer>();
        List<Boolean> list = new ArrayList<Boolean>();
        //IntStream.of(2,no);
        for (int i = 0; i <= no; i++) {
            noList.add(i);
            list.add(true);
        }

        list.set(0, false);
        list.set(1, false);
        for (int i = 2; i <= noList.size() && list.get(i) == true; i++) {
            for (int j = noList.get(i) + noList.get(i); j < noList.size(); j = j + noList.get(i)) {
                list.set(j, false);
            }
        }
        return list;
    }


    public static void main(String[] args) {
        PrimeNo test = new PrimeNo();
        test.findPrimeNumbers(20);
    }

}
