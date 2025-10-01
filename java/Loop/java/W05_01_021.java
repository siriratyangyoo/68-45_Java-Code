import java.util.Scanner;
public class W05_01_021 {
    public static void main(String[] var2) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Value A: ");
        int a = kb.nextInt();
        System.out.println("Enter Value b: ");
        int b = kb.nextInt();
        System.out.println("Enter Value B: ");
        System.out.println("Before Output of Value A: " + a );
        System.out.println("Before Output of Value B: " + b);
        // Swap value
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Output of Value A: " + a );
        System.out.println("After Output of Value B: " + b );
        
        
        int x = 6;
        System.out.println(x-- + ++x - --x - x-- + x++ + x);
        
        int c = 21, d = 0;
        System.out.println("a" + (c - d));
        
        double f = 1.6; f += 5.1;
        System.out.println(f % 4);
    }
}