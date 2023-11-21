public class LinearSearch {

    public static void main(String[] args) {
        Object[] arr = {"Hej","lucas","Lucas","Hvem","Kommer","3"};
        int pos = linearSearch(arr, "Lucas") ;
        System.out.println(pos);
    }
    


    public static int linearSearch(Object[] arr, Object target) {
        for (int i = 0; i < arr.length; i++) {
            if (((Comparable)target).compareTo(arr[i]) == 0) {
                return i;
            } 
        }
        return -1;

    }

    public static int linSearch(Object[] arr, Object target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

}

