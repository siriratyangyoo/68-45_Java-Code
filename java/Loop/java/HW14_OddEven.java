import java.util.Scanner;
public class HW14_OddEven {
    public static void main(String[] argd) {
        int start,end;
        Scanner kb = new Scanner(System.in) ;
        while (true){
            System.out.print("Enter start value: ");
            start = kb.nextInt();
            System.out.print("Enter end value: ");
            end = kb.nextInt();
            
            if (start < end){
                for(int x = start;x <= end;x++){
                    if(x % 2 == 0){
                        System.out.println(x + " is an even number");
                    }else{
                        System.out.println(x + " is an odd number");
                    }
                }
                break;
            }else{
                System.out.println("Start value must be less than end value. Please enter again.");
                System.out.println("========================================");
            }
        }kb.close();
    }
}