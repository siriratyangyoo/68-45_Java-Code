package Loop;
import java.util.Scanner;

public class W12_01_For_SumNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Start Number: ");
        int start = kb.nextInt();
        System.out.print("Enter Stop Number: ");
        int stop = kb.nextInt();

        while(start >= stop) {
        System.out.println("Start number must be less than Stop number");
        System.out.print("Enter Start Number: ");
        start = kb.nextInt();
        System.out.print("Enter Stop Number: ");
        stop = kb.nextInt();
        }

        int sum = 0;
        int A = 1;
            // if (start < stop) {
                for(int i = start; i<=stop ;sum+=i,i+=1,A+=1) {
                    System.out.println("รอบที่ " + A + " :" +sum+ "+" + i + "=" + (sum+i));
                // }
            // }else{
            //     System.out.print("Error,Enter new number");
        }
    }
}