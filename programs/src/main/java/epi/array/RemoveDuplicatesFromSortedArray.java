package epi.array;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {

    //http://elementsofprogramminginterviews.com/solutions/java/RemoveDuplicatesFromSortedArray.java

    //Method 1 for removing duplicate entries with only list -> Run Time O(n)
    public void deleteDuplicateValues(List<Integer> list) {

        int indexOfTheValueToBeReplaced=1;

        for(int i=1;i<list.size();i++) {
            if(!list.get(i).equals(list.get(indexOfTheValueToBeReplaced-1)))
                list.set(indexOfTheValueToBeReplaced++,list.get(i));
        }
        System.out.println(list);
    }



    public static void main(String args[]) {
        RemoveDuplicatesFromSortedArray test = new RemoveDuplicatesFromSortedArray();
        test.deleteDuplicateValues(Arrays.asList(1,1,3,5,5,7,11,11,11,13));
    }

}
