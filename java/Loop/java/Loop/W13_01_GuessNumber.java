package Loop;
import java.util.Random;
import java.util.Scanner;
public class W13_01_GuessNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random rand = new Random();
        
        int ans = rand.nextInt(10) + 1;
        //System.out.println("Random number is genarated : " + ans);
        int countGuess = 0;
        boolean win = false;

        while (countGuess < 3){
            System.out.print("Pls Enter GuessNumber : ");
            int Num = kb.nextInt();
            if(Num == ans){
                System.out.println("Conrect! You're guessed the number.");
                System.out.println("=============win=============");
                win = true;
                break;
            }else{
                System.out.println("Incorrect guess. Try again.");
                System.out.println("=============LOSE=============");
            }
            countGuess++;
        }
        if (win == false) 
            System.out.print("Game Over. The correct Number was " + ans);
        kb.close();
    }
}
