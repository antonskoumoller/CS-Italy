import java.util.Arrays;
// Only for sorted arrays

public class BinSearch extends SelectionSort{


    public static void main(String[] args) {
        Object[] arr = {"Hej","lucas","Lucas","Hvem","Kommer","3"};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        int pos = BinarySearch(arr, "Lucas");
        System.out.println(pos);
    }
    
    public static int binarySearch(Object[] arr, Object target) {
        return binarySearch(arr, target, 0, arr.length -1);

    }

    public static int binarySearch(Object[] arr, Object target, int from, int to) {
        if (from > to) {
            return -1;
        }
        int mid = (from + to) /2; 
        if (((Comparable)arr[mid]).compareTo(target) == 0) {
            return mid;
        } else if (((Comparable)arr[mid]).compareTo(target) < 0) {
            return binarySearch(arr, target, mid+1, to);
        } else {
            return binarySearch(arr, target, from, mid -1);
        }       
    }



    public static int BinarySearch(Object[] arr, Object target) {
        int from = 0;
        int to = arr.length-1;
        return BinarySearch(arr, target, from, to);
    }

    public static int BinarySearch(Object[] arr, Object target, int from, int to) {
        if (from > to) {
            return -1;
        }
        
        int mid = (from + to) / 2;
        if (arr[mid].equals(target)) {
            return mid;
        } 
        if (((Comparable)arr[mid]).compareTo(target) < 0) {
            return BinarySearch(arr, target, mid+1, to);
        } else {
            return BinarySearch(arr, target, from, mid-1);
        }
    }
}

