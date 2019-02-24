import java.util.Arrays;
import java.util.Random;

public class Sort {

    static int[] arr = new int[1_000_000];

    public static void createArray(int[] arr, int num){

        for (int i = 0;i<num; i++){
            arr[i] = (int)(Math.random()*50+1);
        }

    }

    public static void insertSort(){
        int tmp, key, j;

        for (int i = 1; i < arr.length; i++) {

            key = arr[i];
                j = i-1;
                while (j>=0 &&  arr[j]>key){
                    arr[j+1] = arr[j];
                    j = j-1;
            }
                arr[j+1] = key;
        }
    }

    public static void bubbleSort(){
        int tmp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }


    public static void selectionSort(){
        int min;
        int index;
        int tmp;
        for (int i = 0; i < arr.length -1; i++){
            min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<= arr[min]){
                    min = j;
                }
            }
            tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;

        }
    }



   public static void quickSort(int[] arr, int left, int right){
        if (arr.length == 0)
            return;

       if (left>=right)
           return;

       int m = left + (right-left)/2;

       int p = arr[m];

       int i = left;
       int j = right;

       while (i <= j){
           while (arr[i] < p) {
               i++;
           }
           while (arr[j] > p){
               j--;
           }
           if (i <= j){
               int tmp = arr[i];
               arr[i] = arr[j];
               arr[j] = tmp;
               i++;
               j--;
           }
       }

       if (left < j){
           quickSort(arr,left,j);
       }
       if (right > i){
           quickSort(arr, i, right);
       }
   }

   public static void cocktailSort(){

        int left = 0;
        int right = arr.length-1;
        boolean flag;

        while (left < right) {
            flag = false;

            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = (arr[i]);
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    flag = true;
                }
            }

            if (!flag){
                break;
            }

            flag = false;

            for (int j = right; j > left; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                    flag = true;
                }
            }
        }
    }


    public static void main(String[] args){
        createArray(arr, 1_000_000);
        System.out.println("Insertion Sort");

        long start = System.currentTimeMillis();
        insertSort();
        long finish = System.currentTimeMillis();
        long time = finish - start;
        System.out.println("Time Insertion Sort - " + time);
        System.out.println();

        createArray(arr, 1_000_000);
        System.out.println("Bubble Sort");
        start = System.currentTimeMillis();
        bubbleSort();
         finish = System.currentTimeMillis();
         time = finish - start;
        System.out.println("Time Bubble Sort - " + time);

        createArray(arr, 1_000_000);
        System.out.println();
        System.out.println("Quick Sort");
         start = System.currentTimeMillis();
        quickSort(arr, 0, arr.length-1);
        finish = System.currentTimeMillis();
        time = finish - start;
        System.out.println("Time Quick Sort - " + time);

        createArray(arr, 1_000_000);
        System.out.println();
        System.out.println("Selection Sort");
        start = System.currentTimeMillis();
        selectionSort();
        finish = System.currentTimeMillis();
        time = finish - start;
        System.out.println("Time Selection Sort - " + time);

        System.out.println();

        createArray(arr, 1_000_000);
        System.out.println("Cocktail Sort");
        start = System.currentTimeMillis();
        cocktailSort();
        finish = System.currentTimeMillis();
        time = finish - start;
        System.out.println("Time Cocktail Sort - " + time);

    }
}
