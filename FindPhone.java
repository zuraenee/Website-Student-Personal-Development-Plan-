
/**
 * Practise at using search algorithms
 *
 * Complete the code
 *
 * @author Mr Sutton & (your name)
 * @version 0.1 30/1/2020
 */
import java.util.Scanner;
public class FindPhone
{
   // 2D array
   // First column is name - sorted by name ascending
   // Second column is extension phone number
   // e.g. namesAndNumbers[2][0] = "Davis" namesAndNumbers[2][0] = "21119"
   private String[][] namesAndNumbers = {
                                           {"Adams", "0111"}, {"Bryant", "2009"}, {"Davis", "2119"}, {"Edwards", "6757"},
                                           {"Franks", "4829"}, {"Harris", "5267"}, {"Jones", "4532"}, {"Kline", "4219"},
                                           {"Lucas", "4672"}, {"Morgan", "4916"}, {"Norris", "4512"}, {"Orwell", "0101"},
                                           {"Patel", "4312"}, {"Peters", "8765"}, {"Quinne", "9839"}, {"Rogers", "0121"},
                                           {"Sanders", "7829"}, {"Smith", "7281"}, {"Thomas", "9799"}, {"Todd", "0129"},
                                           {"Williamson", "7829"}
                                        };
  static int binarySearch(String[][] namesAndNumbers, String x)
    {
        int l = 0, r = namesAndNumbers.length - 1;
        while (l <= r) {
            int m = l + (r-1)/2;
            int n = 1 + (r-1)/2;
            int ANSWER = x.compareTo(namesAndNumbers[m][n]);
 
            if (ANSWER == 0)
                return m;
            if (ANSWER > 0)
                l = m + 1;

            else
                r = m - 1;
        }
 
        return -1;
    }   
  public static void main(String []args) {
       Scanner keyboardReader = new Scanner(System.in);
       
       System.out.println("Extension number finder");
       System.out.println("-----------------------");
       System.out.print("Enter the surname of the person to find their telpehone extension number: ");
       String nameWanted = keyboardReader.nextLine();
       
       String[][] namesAndNumbers = {
                                           {"Adams", "0111"}, {"Bryant", "2009"}, {"Davis", "2119"}, {"Edwards", "6757"},
                                           {"Franks", "4829"}, {"Harris", "5267"}, {"Jones", "4532"}, {"Kline", "4219"},
                                           {"Lucas", "4672"}, {"Morgan", "4916"}, {"Norris", "4512"}, {"Orwell", "0101"},
                                           {"Patel", "4312"}, {"Peters", "8765"}, {"Quinne", "9839"}, {"Rogers", "0121"},
                                           {"Sanders", "7829"}, {"Smith", "7281"}, {"Thomas", "9799"}, {"Todd", "0129"},
                                           {"Williamson", "7829"}
                                        };

       int result = binarySearch(namesAndNumbers);
       if (result == -1){
           System.out.println("Phone number not found");
       }
       else{
           System.out.println("Phone number found at " + "index" + result);
       }
       
       // Add code to find the phone number corresponding to the name entered
       
       // Code will also have to deal with the case when the name is not found
       System.out.println("Telephone number of " + nameWanted + " is ");
       
   }
}
