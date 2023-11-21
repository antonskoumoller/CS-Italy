import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class BinarySearchProfiler {

     // The tester
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        sc.close();

        // Save accesses per run
        int[] access = new int[n];

        // Run n searches on n sorted ascending arrays with n elements
        for (int i = 0; i < n; i++) {
            int[] arr = sortedIntegerArray(n);
            System.out.println(Arrays.toString(arr));
            access[i] = binarySearch(arr, i) + 1;
        }
        
        // Sort access list and get min and max
        mergeSort(access);
        int min = access[0];
        int max = access[access.length-1];
        
        // Cumpute mean accesses and total accesses
        double mean = computeMean(access);
        int total = sum(access);

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Mean: " + mean);
        System.out.println("Total: " + total);
        

    }

    private static int binarySearch(int[] a, int t) {
        return binSearch(a,0,a.length-1,t);
    }

    private static int binSearch(int[] a, int from, int to, int t) {
        if (from > to) {
            return -1;
        }

        int mid = (from + to) / 2;
        int middle = a[mid];

        if (middle == t) {
            return mid;
        }
        else if (middle < t) {
            return binSearch(a, mid+1, to, t);
        }
        else {
            return binSearch(a, from, mid-1, t);
        }
    }

    private static int[] sortedIntegerArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;        
    }

    private static int[] randomIntegerArray(int n) {
        Random rand = new Random();
        int[] arr = sortedIntegerArray(n);
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
