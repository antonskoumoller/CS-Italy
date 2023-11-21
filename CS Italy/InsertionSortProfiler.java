import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class InsertionSortProfiler {

     // The tester
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        sc.close();

        // Save accesses per run
        int access1 = 0;
        int access2 = 0;
        int access3 = 0;


        // Run n searches on n random arrays with n elements
        for (int i = 0; i < n; i++) {
            int[] arr1 = ascendingIntegerArray(n);
            int[] arr2 = randomIntegerArray(n);
            int[] arr3 = descendingIntegerArray(n);

            access1 = insertionSortProfiler(arr1);
            access2 = insertionSortProfiler(arr2);
            access3 = insertionSortProfiler(arr3);

            // access[i] = binarySearch(arr, n-1) + 1;
        }
        

        // Sort access list and get min and max
        // mergeSort(access1);
        // mergeSort(access2);
        // mergeSort(access3);
        // int min1 = access1[0];
        // int max1 = access1[access.length-1];
        // int min2 = access2[0];
        // int max2 = access2[access.length-1];
        // int min3 = access3[0];
        // int max3 = access3[access.length-1];
        

        System.out.println("Min: " + access1);
        System.out.println("Mean: " + access2);
        System.out.println("Max: " + access3);

    }

    // private static int insertionSortProfiler (int[] a) {
    //     int access = 0; 
    //     for (int i = 1; i < a.length; i++) {
    //         int current = a[i];
    //         int j = i - 1;

    //     }
    // }
    

    private static int[] ascendingIntegerArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;        
    }

    private static int[] descendingIntegerArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[arr.length-1-i] = i;
        }
        return arr;        
    }

    private static int[] randomIntegerArray(int n) {
        Random rand = new Random();
        int[] arr = ascendingIntegerArray(n);
        for (int i = 0; i < arr.length; i++) {
            int j = rand.nextInt(n);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    private static void mergeSort(int[] a) {
        if (a.length < 2) return;

        int mid = a.length / 2; 
        int[] left = new int[mid];
        int[] right = new int[a.length - mid];
        System.arraycopy(a, 0, left, 0, left.length);
        System.arraycopy(a, mid, right, 0, right.length);
        mergeSort(left);
        mergeSort(right);

        merge(a,left,right);

    }

    private static void merge(int[] a, int[] left, int[] right) {
        int ia = 0; int iLeft = 0; int iRight = 0;

        while (iLeft < left.length && iRight < right.length) {
            if (left[iLeft] < right[iRight]) {
                a[ia] = left[iLeft];
                ia++; iLeft++;
            } else {
                a[ia] = right[iRight];
                ia++; iRight++;
            }
        }

        while (iLeft < left.length) {
            a[ia] = left[iLeft];
            ia++; iLeft++;

        }
        while (iRight < right.length) {
            a[ia] = right[iRight];
            ia++; iRight++;

        }
    }

    private static double computeMean(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        double mean = sum / a.length;
        return mean;

    }

    private static int sum(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        
        return sum;

    }

}
