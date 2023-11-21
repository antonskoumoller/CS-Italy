public class RecursiveFactorsComputer{
    public static void main(String[] args) {


    }

    public String recursivelyMakeFactors(int n) {
        if (n == 1)
            return "";
        return recursivelyMakeFactors(n-1);

        }
    }

    public String recursivelyMakeFactors(int n, int a) {
        if (n < a) {
            return Integer.toString(n);
        }

        if (n % a != 0)
            return recursivelyMakeFactors(n,a+1);
        
        return a + "*" + recursivelyMakeFactors(n/a,a);

        

    }
}