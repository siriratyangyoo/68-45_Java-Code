package Loop;
import java.util.Scanner;
public class W11_02_While_True_ChooseMenu {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        // โจทย์: เขียนโปรแกรมให้ผู้ใช้เลือกเมนู
        // ถ้าเลือก 1 ให้บวกเลข 2 จำนวน
        // ถ้าเลือก 2 ให้ลบเลข 2 จำนวน
        // ถ้าเลือก 3 ให้ออกจากโปรแกรม
        // แสดงตัวเลข 2 จำนวน
System.out.print("Enter number1:  ");
int num1  = kb.nextInt();
System.out.print("Enter number2:  ");
int num2  = kb.nextInt();
        // แสดงเมนูเพื่อรับ choice
        System.out.println("=======================");
        System.out.println("Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Exit");
        System.out.println("=======================");
        while(true){
            System.out.print("Enter your choice: ");
            int choice = kb.nextInt();
            System.out.println("---------------------");
            if (choice == 1) {
                int Result = num1 + num2;
                System.out.println("Addition Result: " + Result);
                break;
            }else if (choice == 2) {
                System.out.println("Subtraction Result: " + (num1 - num2));
                break;
            }else if (choice == 3) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }else{
                System.out.println("Not on the menu");
            }
        }
    }
}
