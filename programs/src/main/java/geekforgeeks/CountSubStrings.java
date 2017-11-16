package geekforgeeks;

import java.util.Scanner;

public class CountSubStrings {

    public int count(String input) {
        char[] values = input.toCharArray();
        int counter=0;
        for(int i=0;i<values.length;i++) {
            if(values[i]=='1') {
                for(int j=i+1;j<values.length;j++) {
                    if(values[j]=='1') {
                        counter++;
                    }
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        return counter;

    }
}
