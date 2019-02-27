public class SortUtils {

    int[] arr = new int[1];
    static int tmp;

    public static void swap(int arr[], int i, int j){
        tmp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = tmp;
    }

    public static int[] insertSort(int [] arr){
        int tmp;
        int key;
        int j;

        for (int i = 1; i < arr.length; i++) {

            key = arr[i];
            j = i-1;
            while (j>=0 &&  arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        return arr;
    }

    public static int[] bubbleSort(int [] arr){
        int tmp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    swap(arr, i, j);
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int [] arr){
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
            swap(arr, i, min);
        }

        return arr;
    }

    public static int[] quickSort(int[] arr, int left, int right){
        if (arr.length == 0)
            return null;

        if (left>=right)
            return null;

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
                swap(arr, i, j);
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

        return arr;
    }

    public static int[] cocktailSort(int[] arr){

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
                    swap(arr, j, j-1);

                    flag = true;
                }
            }
        }
        return arr;
    }




}


