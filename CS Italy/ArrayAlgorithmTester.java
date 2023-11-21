import java.util.Arrays;

public class ArrayAlgorithmTester {
   public static int repetitionFactor = 2;
   public static int n = 10;

   public static void main(String[] args) {
      
      
      int[] a = SequencesGenerator.uniqueRandomIntegerArray(n);
      int[] b = new int[n];
      int[] c = new int[n];
      
      System.arraycopy(a, 0, b, 0, n);
      System.arraycopy(a, 0, c, 0, n-1);
      
      System.out.println(Arrays.toString(a));

      // ArrayAlgorithms.mergeSort(a);
      // System.out.println(Arrays.toString(a));

      // ArrayAlgorithms.selectionSort(b);
      // System.out.println(Arrays.toString(b));

      ArrayAlgorithms.insertionSort(c);
      System.out.println(Arrays.toString(c));

      // int targetLocation1 = ArrayAlgorithms.recursiveBinarySearch(b,9);
      // System.out.println(targetLocation1);

      // int targetLocation2 = ArrayAlgorithms.iterativeBinarySearch(b,9);
      // System.out.println(targetLocation2);

      
   
   }
}
