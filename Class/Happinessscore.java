package myproject;
import java.util.*;
public class Happinessscore {

	static long ASCIIWordSum(String str, long sumArr[])
    {
        int l = str.length();
        int pos = 0;
        long sum = 0;
        long bigSum = 0;
        for (int i = 0; i < l; i++) {
 
            // Separate each word by
            // a space and store values
            // corresponding to each word
            if (str.charAt(i) == ' ') {
 
                bigSum += sum;
                sumArr[pos++] = sum;
                sum = 0;
            }
            else
 
                // Implicit type casting
                sum += str.charAt(i);           
        }
 
        // Storing the sum of last word
        sumArr[pos] = sum;
        bigSum += sum;
        return bigSum;
    }
 
    // Driver function
    public static void main(String args[])
    {
 
        String str = "Mrityunjay";
 
        // Counting the number of words in the input sentence
        int ctr = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == ' ')
                ctr++;
         
        long sumArr[] = new long[ctr + 1];
 
        // Calling function
        long sum = ASCIIWordSum(str, sumArr);
 
        // Printing equivalent sum of the words in the
        // sentence
        System.out.println("Sum of ASCII values:");
        for (int i = 0; i <= ctr; i++)
            System.out.print(sumArr[i] + " ");
        System.out.println();
        System.out.print("Total sum -> " + sum);

}
}
