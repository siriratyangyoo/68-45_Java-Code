package Loop;

import java.util.Scanner;

public class W16_ExStartEnd_021 {
    public static void main(String[] args) {
        int Start,End;
        Scanner kb = new Scanner(System.in);
        int StartCount = 0;
        int EndCount = 0;
        while (true){
            System.out.print("Enter Start Number : ");
            Start = kb.nextInt();
            System.out.print("Enter Start Number : ");
            End = kb.nextInt();

            if (Start < End){
                System.out.println("--------------------------Result-----------------------------");
                System.out.print("Show All Number : ");
                for(int x = Start;x <= End;x++){
                    if (x % 2 == 0){
                        System.out.print(x + " ");
                        EndCount++;
                    }else if(x % 2 != 0){
                        System.out.print(x + " ");
                        StartCount++;
                    }
                }break;
            }else{
                System.out.println("-----------------------warning------------------------------");
                System.out.println("Start number must be less than end number Please enter again");
                System.out.println("------------------------------------------------------------");
            }
        }
        System.out.println(" ");
        System.out.println("Amount of Even Numbers = "+EndCount);
        System.out.println("Amount of Odd Numbers = "+StartCount);
    }
}
