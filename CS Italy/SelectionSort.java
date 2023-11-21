import java.util.Arrays;

public class SelectionSort {
    
    public static void main( String[] args) {
        Object[] arr = {"Hej","lucas","Lucas","Hvem","Kommer","3"};
        

        // for (int i = 0; i < arr.length;i++) {
        //     arr[i] = i; 
        // }
        System.out.println(Arrays.toString(arr));
        selSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(Object[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = findMinIndex(arr, i);
            if (minPos != i) {
                swap(arr, minPos, i);
            }
        }
    }

    private static int findMinIndex(Object[] arr, int from) {
        int pos = from;
        Object min = arr[from];

        for (int i = from + 1; i < arr.length; i++) {
            Object temp = arr[i];
            if (((Comparable)temp).compareTo(min) < 0) {
                pos = i;
                min = temp;
            }
        }
        return pos;
    }

    private static void swap(Object[] arr, int i, int j) {
        Object temp = arr[i];
        arr[i] = arr[j]; 
        arr[j] = temp;
    }

    public static void selSort(Object[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            int minPos = findMin(arr, i);
            swapp(arr, i, minPos);
        }
    }

    private static int findMin(Object[] arr, int from) {
        int minPos = from;
        for (int i = from; i < arr.length; i++) {
            if (((Comparable)arr[i]).compareTo(arr[minPos]) < 0) {
                minPos = i;
            }
        }
        return minPos;
    }

    private static void swapp(Object[] arr, int i, int j) {
        Object temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}