import java.util.Random;
import java.util.Arrays;
public class Activity12combined
//copy pasted activity1 bubble sort into here, because question said "in the same class"
{
    public static void array1()
    {
        System.out.print("Array1 1:");
        Random rd = new Random(); //creates random generator
        int[] array1 = new int[7]; //creates an empty list of size 7
        for (int i = 0; i < array1.length; i++) { //iterates through a list
         array1[i] = rd.nextInt(); //inserts a random into the position
         System.out.println(array1[i]); //prints each value of random that is now inserted into the list in new line
        }
        System.out.println("Before Bubble Sort");
        for (int i=0; i<array1.length;i++){ 
            System.out.print(array1[i]+" "); //print value of list in same line
        }  
        
        //bubble sort
        for (int i = 0; i < array1.length-1; i++) //iterate through list of size 6 - loop1
            for (int j = 0; j < array1.length-i-1; j++) //iterate through list of size 6-loop1 - loop2
                if (array1[j] > array1[j+1])
                {
                    int temp = array1[j];
                    array1[j] = array1[j+1];
                    array1[j+1] = temp;
                }
        System.out.println("After Bubble Sort");
        for (int i=0;i<array1.length;i++){
            System.out.println(array1[i]+" ");
        }
    }
    public static void array2()
    {
        System.out.println("Array 2:");
        Random rd = new Random();
        int[] array2 = new int[7];
        for (int i = 0; i < array2.length; i++) {
         array2[i] = rd.nextInt(); 
         System.out.println(array2[i]); 
        }
        System.out.println("Before Bubble Sort");
        for (int i=0; i<array2.length;i++){
            System.out.print(array2[i]+" ");
        }  
        
        for (int i = 0; i < array2.length-1; i++)
            for (int j = 0; j < array2.length-i-1; j++)
                if (array2[j] > array2[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = array2[j];
                    array2[j] = array2[j+1];
                    array2[j+1] = temp;
                }
        System.out.println("After Bubble Sort");
        for (int i=0;i<array2.length;i++){
            System.out.println(array2[i]+" ");
        }
    }
    public static int[] mergedArray(int[] array1, int[] array2){
        int[] mergedArray = new int[array1.length + array2.length];
        int i=0, j=0, k=0;
        while (i < array1.length && j < array2.length)
        {
            if (array1[i] < array2[j]){
                mergedArray[k] = array1[i];
                i++;
                k++;
            } 
            else{
                mergedArray[k] = array2[j];
                j++;
                k++;
            }
        }       
        while (i < array1.length){
            mergedArray[k] = array1[i];
            i++;
            k++;
        }          
        while (j < array2.length){
            mergedArray[k] = array2[j];
            j++;
            k++;
        }   
        return mergedArray;
    }
    public static void main(){
        array1();
        array2();
        int[] mergedArray = mergeArray(array1, array2);
    }
    }
