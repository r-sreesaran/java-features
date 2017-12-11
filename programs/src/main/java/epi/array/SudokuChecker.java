package epi.array;

import java.util.HashSet;
import java.util.Set;

//This will check if the given soduku is a valid one
public class SudokuChecker {

    int[][] values = new int[9][9];

    public void setInputs(int[][] values) {
           this.values = values;
    }


    //This will verify there are no duplicate entries in row and column
    public boolean checker() {
        Set<Integer> rowValues = new HashSet<Integer>();
        Set<Integer> columnValues = new HashSet<Integer>();

        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {

             if(!rowValues.add(values[i][j])||!columnValues.add(values[j][i]))
                 return false;
            }

            rowValues = new HashSet<Integer>();
            columnValues = new HashSet<Integer>();

        }


        return  blockChecker();
    }

    //This will verify there are no duplicate entries in the block
    public boolean  blockChecker() {
        Set<Integer> blockValues = new HashSet<Integer>();
        for(int i=0;i<9;i=i+3) {
            for(int j=0;j<9;j=j+3) {

                for(int k=i;k<i+3;k++) {
                    for(int l=j;l<j+3;l++) {
                        blockValues.add(values[k][l]);
                    }
                }
                if(blockValues.size()!=9)
                    return  false;
                blockValues = new HashSet<Integer>();
            }

        }
        return true;
    }


}
