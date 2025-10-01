import java.util.Scanner;
public class Ex_product {
    public static void main(String[] args) {
        System.out.println("===========INPUT=============");
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Product Name: ");
        String ProductName = kb.nextLine();
        System.out.print("Enter Unit Price (Baht): ");
        double Baht = kb.nextInt();
        System.out.print("Enter Quantity: ");
        int Quantity = kb.nextInt();
        System.out.println("===========OUTPUT=============");
        System.out.println("PRODUCT : "+ProductName);
        double PriceProduct = Baht*Quantity;
        System.out.println("UNIT x QTY : "+ Baht +" x " + Quantity);
        double DISCOUNT = (PriceProduct*7)/100;
        System.out.println("SUBTOTAL : "+PriceProduct+ " Baht");
        System.out.println("DISCOUNT 7.0% : "+DISCOUNT);
        System.out.println("===========INPUT=============");
        double NetTotal = PriceProduct-DISCOUNT;
        System.out.println("-----------------------------");
        System.out.println("NET TOTAL : " + NetTotal + " Bath");
        System.out.println("=============================");
    }
}
