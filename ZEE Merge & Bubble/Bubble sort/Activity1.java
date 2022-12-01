import java.util.Random;
 class Activity1 {  
    public static void bubbleSort(int list[])
    {
        for (int i = 0; i < list.length-1; i++)
            for (int j = 0; j < list.length-i-1; j++)
                if (list[j] > list[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
    }
    public static void main()
    {
        System.out.print("\u000c");
        boolean swaps = true;
        Random rd = new Random();
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
         list[i] = rd.nextInt(); 
         System.out.println(list[i]); 
        }
        int temp = 0;
        System.out.println("Before Bubble Sort");
        for (int i=0; i<list.length;i++){
            System.out.print(list[i]+" ");
        }  
        bubbleSort(list);
        System.out.println("After Bubble Sort");
        for (int i=0;i<list.length;i++){
            System.out.println(list[i]+" ");
        }
    }
}