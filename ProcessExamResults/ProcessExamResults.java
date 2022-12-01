import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class ProcessExamResults
{
    public static String getName() {
      // Prompts user and reads the student name from the keyboard 
      String name ="";
      return name;
    }
    
      public static int getMark() {
      // Prompts user and reads the student mark from the keyboard
      // Marks should be read as a string, but returned as a integer after validation
      // The mark is validated and the user prompted to re-enter
      // if the mark is not valid
      String strMark="";
      int mark = Integer.parseInt(strMark);
      return mark; 
    }
    
    public boolean ValidateMark(String strMark, int n) {
        // Takes the mark as a string
        // Checks that this string only contains digits and has a value between 0 and 100
        // Returns true if the string contains only digits and has a value between 0 and 100
        // Returns false otherwise
        boolean validMark=true;
        for (int i=0;i<n;i++){
                if (strMark.charAt(i)>=0 && strMark.charAt(i)<=100){
                    validMark = true;
                }
                else{
                    validMark = false;
                }
        }
         return validMark;
    }
    
    public static String findGrade(int mark) {
        String grade="";
        if (mark > 80)
            grade = "Distinction";
        else if (mark > 60)
            grade = "Merit";
        else if (mark > 40)
            grade = "Pass";   
        else
            grade = "Fail";
        return grade;
    }
    
    public static void saveNameAndGrade(String name, String grade) {
        // Write name and grade one line per student in the form
        // <name>,<grade>
        // e.g. Jo King,Pass
        // To keep the loose coupling open the file and save the single record (append)
        // and then close the file
        Scanner input = new Scanner(System.in);
        String name = input.nextString();
        String grade = input.nextString();
        String both = name+grade;
        return both;
    }
    
    public static void printCertificate (String name, String grade) {
        // Rather than being printed to the console the certificate should be written to a file
        // The file should have the same name as the student
        // Format for certificate should be as below
        //
        // *****************************************************
        // ** IT Competence Certicate                         **
        // **                                                 **
        // ** Awarded to <name>                               **
        // **                                                 **
        // ** Grade <grade>                                   **
        // **                                                 **
        // ** This is a temporary certificate                 **
        // ** Formal version will be posted in November       **
        // *****************************************************
        FileWriter myWriter = new FileWriter(name+".txt");
        myWriter.write("IT Competence Certificate");
        myWriter.close();
        System.out.println("Awarded to " + name);
        System.out.println("Grade " + grade);
        System.out.println("This is a temporary certificate");
        System.out.println("Format version will be posted in November");
        
    }
    
    public static void main (){
            }
}
