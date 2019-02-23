import java.util.Arrays;
import java.util.Random;

public class Sort {

    static int[] arr = new int[10];

    public static void createArray(int[] arr, int num){

        for (int i = 0;i<num; i++){
            arr[i] = (int)(Math.random()*50+1);
        }

        for (int i= 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
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

        for (int i= 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
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
        for (int i= 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void qSort( int[] arr, int l, int r){
       // int l = 0;
        //int r = arr.length-1;

        if (l < r){
            int p = quickSort(arr, l, r);

            quickSort(Sort.arr, l , p-1);
            quickSort(Sort.arr, p+1, r);
        }

        for (int i= 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static int quickSort(int arr[], int l, int r){
        int p = arr[r];
        int i = (l-1);

        for (int j=l; j < r-1; j++){
            if (arr[j] <= p){
                i++;

                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }

        int tmp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = tmp;

        return i+1;
      /*  int tmp;
        int p = arr[(int)(arr.length/2)];
        System.out.println(p);
        int l = 0;
        int r = arr.length-1;

        for (int i = l; i < arr.length; i++) {
            if (arr[i]>p){
                for (int j = r; j>=0;j--){
                    if (arr[j]<=p){
                        tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        }


        for (int i= 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        */
    }



    public static void main(String[] args){
        createArray(arr, 10);
        System.out.println();
        System.out.println("Sorted Array:");
        insertSort();
        System.out.println();
        System.out.println("Bubble Sort");
        bubbleSort();
        System.out.println();
        System.out.println("Quick Sort");
        qSort(arr,0,arr.length-1);
    }
}
