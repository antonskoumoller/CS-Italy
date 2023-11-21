import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;


public class RecursivelyComputeMean {
    
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int dim = 10;
        double mean1 = recursivelyComputeMean(arr, dim);
        double mean2 = iterativelyComputeMean(arr, dim);
        System.out.println(mean1);
        System.out.println(mean2);
    }
    
    private static double recursivelyComputeMean(int a[], int aSize) {
        
        if (aSize == 1){
            return a[0];
        }
        return (a[aSize-1] + recursivelyComputeMean(a, aSize-1))/2;
    } 

    private static double iterativelyComputeMean(int a[], int aSize){
        if (a.length < 1)
            return a[0];
        int i = 1;
        double mean = a[0];
        while (i < aSize) {
            mean = (mean + a[i]) / 2;
            i++;
        }

        return mean;
        

    }

}