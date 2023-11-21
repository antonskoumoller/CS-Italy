public class RecursiveNumberLister {
    public static void main(String[] args) {
        System.out.println(recNumList(5));
    }
    
    public static String recNumList(int n) {
        if (n > 0) {
            int n1 = n - 1;
            return recNumList(n1) + " " + n;
        }
        
        return "";
        
        
        
        

        
    }


}