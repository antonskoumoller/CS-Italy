import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class MontyHall {
    public static Random rand = new Random();
    public static String[] doors = new String[3];
    public static int firstChoice;
    public static int change;
    public static int reveal;

    public static void main(String[] args) {
        double keepWin = 0;
        double changeWin = 0;

        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        sc.close();

        for (int i = 0; i < n; i++) {
            int keep = keepMonty();
            keepWin = keepWin + keep;
            int change = changeMonty();
            changeWin = changeWin + change;
        }

        double winFreqKeep = keepWin / n;
        double winFreqChange = changeWin / n;
        double winFreq = (keepWin + changeWin)/(n*2);

        System.out.println("Victory rate: " + winFreq);
        System.out.println("Victory rate in keep case: " + winFreqKeep);
        System.out.println("Victory rate in change case: " + winFreqChange);
    }

    public static int keepMonty(){
        doors[0] = "goat"; doors[1] = "goat"; doors[2] = "goat";
        int i = rand.nextInt(3);
        doors[i] = "car";
        firstChoice = pickGate();
        
        if (doors[firstChoice].equals("goat")) {
            return 0;
        }       
        return 1;
    }

    public static int changeMonty(){
        System.out.println("\nChange game");

        doors[0] = "goat"; doors[1] = "goat"; doors[2] = "goat";
        int i = rand.nextInt(3);
        doors[i] = "car";

        System.out.println(Arrays.toString(doors));

        firstChoice = pickGate();
        System.out.println("First choice: " + firstChoice);

        revealGoat();
        System.out.println("Reveal choice: " + reveal);

        for (int j = 0; j < 3; j++) {
            if ( j != reveal && j != firstChoice) {
                change = j;
            }
        }
        System.out.println("Change choice: " + change);

        if (doors[change].equals("goat")) {
            return 0;
        }       
        return 1;
    }
    
    public static int pickGate(){
        return rand.nextInt(3);
    }

    public static void revealGoat() {
        while (true) {
            int i = rand.nextInt(3);
            if (!doors[i].equals("car") && i != firstChoice) { 
                reveal = i;
                break;
            }
        }
    }

}