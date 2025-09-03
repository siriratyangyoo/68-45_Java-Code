package Loop;
import java.util.Scanner;
public class W11_04_doWhile_True_ChooseMenu_SwitchCase {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        // โจทย์: เขียนโปรแกรมให้ผู้ใช้เลือกเมนู
        // ถ้าเลือก 1 ให้บวกเลข 2 จำนวน
        // ถ้าเลือก 2 ให้ลบเลข 2 จำนวน
        // ถ้าเลือก 3 ให้ออกจากโปรแกรม
        // แสดงตัวเลข 2 จำนวน
        // แสดงเมนูเพื่อรับ choice
        System.out.println("=======================");
        System.out.println("Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Exit");
        System.out.println("=======================");
        int choice;

        do { 
            System.out.println("---------------------");
            System.out.print("Enter your choice: ");
            choice = kb.nextInt();

            switch(choice){
                case 1:
                System.out.print("Enter number1:  ");
                int num1  = kb.nextInt();
                System.out.print("Enter number2:  ");
                int num2  = kb.nextInt();
                int Result = num1 + num2;
                System.out.println("Addition Result: " + Result);
                break; //ออกจาก switch case

                case 2:
                System.out.print("Enter number1:  ");
                num1  = kb.nextInt();
                System.out.print("Enter number2:  ");
                num2  = kb.nextInt();
                System.out.println("Subtraction Result: " + (num1 - num2));
                break; //ออกจาก switch case

                case 3:
                System.out.println("Exiting the program. Goodbye!");
                break;
                default:
                System.out.println("Not on the menu");
            }
        }while(choice != 3); //ถ้า choice ไม่เท่ากับ 3 
        kb.close();
    }
}
