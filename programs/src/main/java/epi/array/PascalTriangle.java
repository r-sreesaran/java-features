package epi.array;

//https://en.wikipedia.org/wiki/Pascal%27s_triangle

public class PascalTriangle {

    //using two dimensional array with
    public void generatePacscalTriangle(int n) {

        int values[][] = new int [n][n];
        for(int line=0;line<n;line++) {
            for(int j=0;j<=line;j++) {
                values[line][j]=(j==0||j==line)?1:values[line-1][j]+ values[line-1][j-1];
            }
        }
        printPascalTriangle(values);
    }


        public void printPascalTriangle(int values[][]) {
        for(int i=0;i<values.length;i++) {
            for(int j=0;j<values.length;j++) {
                System.out.println(values[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        PascalTriangle generateTriangle = new PascalTriangle();
        generateTriangle.generatePacscalTriangle(5);
    }

}
