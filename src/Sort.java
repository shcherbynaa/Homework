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

    public static void main(String[] args){
        createArray(arr, 10);
        System.out.println();
        System.out.println("Sorted Array:");
        insertSort();
    }
}
