import java.util.Arrays;

public class ArrayAlgorithms {

   public static int guardedLinearSearch(int[] a, int size, int target) {
      
      if (a.length == size)
         throw new IllegalArgumentException("Array is full and this algorithm is retarded");
      
      a[size] = target;
      
      int i = 0;
      while (a[i] != target){
         i++;
      }
      
      if (i == size) {
         return -1;
      }  
      return i;         
   }
   
   public static void insertionSort(int[] a) {
      for (int i = 1; i < a.length-1; i++){
         int j = i;
         while ( a[j] < a[j-1]) {
            int temp = a[j-1];
            a[j-1] = a[j];
            a[j] = temp;
            j--;
            if (j == 0){
               break;
            }
         }
      }
   }

   public static int iterativeBinarySearch(int[] a, int target){
      
      int from = 0;
      int to = a.length-1;

      while(from <= to) {
         int mid = (from + to) / 2;
         if (a[mid] == target) {
            return mid;
         }

         if (target > a[mid]) {
            from = mid + 1;
         }
         else if (target < a[mid]) {
            to = mid - 1;
         }
      }
      return -1;
   }
   
   public static int linearSearch(int[] a, int target){
      for (int i = 0; i < a.length; i++){
         if (a[i] == target){
           return i;
         } 
      }        
         return -1;
   }
   
   
   public static void mergeSort(int[] a){
      if (a.length < 2) 
         return;
      
      int mid = a.length / 2;
      
      int[] left = new int[mid];
      int[] right = new int[a.length-mid];
      
      System.arraycopy(a, 0, left, 0, left.length);
      System.arraycopy(a, mid, right, 0, right.length);
      
      mergeSort(left);
      mergeSort(right);
      
      merge(a, left, right);
   }
   
   private static void merge(int[] a, int[] b, int[] c) {
      int ia = 0;
      int ib = 0;
      int ic = 0;
      
      while (ib < b.length && ic < c.length){
         if (b[ib] < c[ic]) {
            a[ia++] = b[ib++];
         } else {
            a[ia++] = c[ic++];
         } 
      }
      while (ib < b.length) {
         a[ia++] = b[ib++];
      }

      while (ic < c.length) {
         a[ia++] = c[ic++];
      }
   }
   
   public static int recursiveBinarySearch(int[] a, int target){

         return binSearch(a, target, 0, a.length-1);
      
      
}

   public static int binSearch(int[] a, int target, int from, int to) {
      if (from > to) return -1;
      
      int mid = (from + to) / 2;
      int center = a[mid];
      if ( center == target ) return center;
      
      if ( center > target) {
         to = mid-1;
      } else {
         from = mid+1;
      }
      return binSearch(a,target,from,to);
   }
   
   public static void selectionSort(int[] a){
      for (int i = 0; i < a.length; i++) {
         int minPos = findMin(a, i);
         if (minPos != i) {
            swap(a,i,minPos);
         }
      }
   }
   
   private static void swap(int[] a, int i, int j){
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }
   
   private static int findMin(int[] a, int from) {
      int pos = from;
      int min = a[from];
      for (int i = from + 1; i < a.length; i++) {
         if (a[i] < min) {
            pos = i;
            min = a[i];
         }
      }
      return pos;
   }
}
