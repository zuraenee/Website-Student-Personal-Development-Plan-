public class Activity3{  
    public static void insertionSort(int list[]) {    
        for (int i = 1; i < list.length; i++) {  
            int key = list[i];  
            int x = i-1;  
            while ( (x > -1) && ( list [x] > key ) ) {  
                list [x+1] = list[x];  
                x--;  
            }  
            list[x+1] = key;  
        }  
    }  
    public static void main(String a[]){    
        System.out.print("\u000c");
        int[] list2 = {40000,20000,160000,320000,80000};    
        System.out.println("Before Insertion Sort");    
        for(int i:list2){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
        insertionSort(list2);  
        System.out.println("After Insertion Sort");    
        for(int i:list2){    
            System.out.print(i+" ");    
        }    
    }    
}   