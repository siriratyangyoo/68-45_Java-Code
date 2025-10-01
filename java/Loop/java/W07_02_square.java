import java.util.Scanner;
public class W07_02_square {
    public static void main(String[] args) {
        System.out.print("Ener number");
        Scanner kb = new Scanner(System.in);
        // Input: prompt the user for a number
        System.out.println(" ");
        double x = kb.nextDouble();
        // Proocess: calculate the square root of the number
        double squareRoot = Math.sqrt(x);
        // Output the square root of the number
        if(x > 0) {
            System.out.println("Square of "+x+" is "+squareRoot);
        }else {
            System.out.println("กรุณากรอกตัวเลขที่มากกว่า 0");
        }
    }
}
