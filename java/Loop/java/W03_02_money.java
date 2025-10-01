import java.util.Scanner;
public class W03_02_money {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
// Input base and height of Triangle

        System.out.print("Enter money = ");
        double money = kb.nextDouble();
        
        System.out.print("Enter prict = ");
        double price = kb.nextDouble();
        
        double change = money- price;
        
        System.out.println("Your change = "+change);
        
        kb.close();
    }
}