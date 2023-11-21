import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        Object[] arr = {"Hej","lucas","Lucas","Hvem","Kommer","3"};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(Object[] arr) {
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;
        Object[] left = new Object[mid]; 
        Object[] right = new Object[arr.length-mid]; 
        System.arraycopy(arr, 0, left, 0, left.length); 
        System.arraycopy(arr, mid, right, 0, right.length);

        mergeSort(left);
        mergeSort(right);
        
        merge(arr,left,right);
    }

    public static void merge(Object[] a,Object[] b, Object[] c) {
        int ia = 0; int ib = 0; int ic = 0; 
        while ( ib < b.length && ic < c.length) {
            if (((Comparable)b[ib]).compareTo(c[ic]) < 0) {
                a[ia++] = b[ib++]; 
            } else {
                a[ia++] = c[ic++];
            }
        }
        while (ib < b.length) {
            a[ia++] = b[ib++];  
        }
        while (ic < c.length){
            a[ia++] = c[ic++];
        }
    }

}