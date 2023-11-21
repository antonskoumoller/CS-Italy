import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        Object[] arr = {"Hej","lucas","Lucas","Hvem","Kommer","3"};
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i-1;
            Object cur = arr[i];
            while ( j>= 0 && ((Comparable)cur).compareTo(arr[j]) < 0) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = cur;
        }
    }

    public static void insertSort(Object[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Object cur = arr[i]; 
            int j = i-1;
            while (j >= 0 && ((Comparable)cur).compareTo(arr[j]) < 0) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = cur;
        }
    }
}  