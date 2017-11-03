package geekforgeeks;

/**
 * http://practice.geeksforgeeks.org/problems/sum-string/0
 *
 * Problem statement
 * Given a string of digits, the task is to check if it is a ‘sum-string’.
 * A string S is called a sum-string if a rightmost substring can be written as sum of two substrings before it
 * and same is recursively true for substrings before it.
 */
public class SumOfString {

   static int sum=0;
   int temp =0;

   public boolean[] operation(String args[]) {

       boolean[] results=new boolean[args.length-1];
       int input = Integer.valueOf(args[0]);

       for (int i = 1, j=0; i < args.length; j++,i++) {
           sum = 0;
           if(args[i].length()<4&&args[i].length()%2!=0) results[j] = false;
           else
           results[j] = isSumStringRecursion(Integer.valueOf( args[i]),args[i].length()-2);
       }
       return results;
   }

       public Boolean isSumStringRecursion(int no,int length) {

           if(length==0) {
               return sum==no;
           }

       temp = (int) Math.pow(10,length);
       sum = sum + (int)no/temp;

       return isSumStringRecursion(no - (int)no/temp * temp,length-2);


   }

    /**
     * This method will perform operation based on the string iterator
     * @return
     */
   public boolean isSumStringMethod(String no) {




       return false;
   }


}
