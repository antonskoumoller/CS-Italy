import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class RecursivelyFindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimension of array: ");
        int dim = sc.nextInt();
        System.out.println("Enter n of array: ");
        int n = sc.nextInt();
        sc.close();
        Random rd = new Random();
        int[] arr = new int[dim];
        for (int i = 0; i < dim; i++) {
            arr[i] = rd.nextInt(n);

        }
        int min = recursivelyFindMin(arr, dim);
        JOptionPane.showMessageDialog(null, "Dim = " + dim + "\nn = " + n + "\na = " + Arrays.toString(arr) + "\nmin = " + min);
    }
    
    private static int recursivelyFindMin(int a[], int aSize) {
        
        if (aSize == 1){
            return a[0];
        }
        return Math.min(a[aSize-1], recursivelyFindMin(a, aSize-1));
    } 
}