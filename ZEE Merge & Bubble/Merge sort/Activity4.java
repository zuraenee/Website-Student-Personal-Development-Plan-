import java.io.*;
public class Activity4{
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("file3.txt");
        BufferedReader x1 = new BufferedReader(new FileReader("file1.txt"));
        BufferedReader x2 = new BufferedReader(new FileReader("file2.txt"));
        String text1 = x1.readLine();
        String text2 = x2.readLine();
        while (text1 != null || text2 != null){
            if (text1 != null){
                pw.println(text1);
                text1 = x1.readLine();
            }
            if (text2 != null){
                pw.println(text2);
                text2 = x2.readLine();
            }
        }
        pw.flush();
        x1.close();
        x2.close();
        pw.close();
        System.out.println("file 1 and file 2 merged into file 3");
    }
}