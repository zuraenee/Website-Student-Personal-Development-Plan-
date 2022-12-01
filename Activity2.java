import java.util.*;
public class Activity2
    {
    public static void bubblesort (int list[]){
        for (int i=0; i<list.length-1;i++){
            for (i=0; i<(list.length-1-i); i++){
                if (list[i] > list[i+1]){
                 int temp = list[i];
                 list[i] = list[i+1];
                 list[i+1] = temp;
                }
            }
        }  
        
    }
    public static void main(){
        System.out.print("\u000c");
        boolean swaps = true;
        int list[] = {160000,40000,80000,20000,320000};
        int temp = 0;
        System.out.println("Before Bubble Sort");
        for (int i=0; i<list.length;i++){
            System.out.print(list[i]+" ");
        }  
        long start = System.nanoTime();
        bubblesort(list);
        long finish = System.nanoTime();; System.out.println((finish - start)/1000000);
        System.out.println("After Bubble Sort");
        for (int i=0;i<list.length;i++){
            System.out.println(list[i]+" ");
        }
        }
    }



