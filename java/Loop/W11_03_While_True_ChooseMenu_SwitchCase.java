package Loop;
import java.util.Scanner;
public class W11_03_While_True_ChooseMenu_SwitchCase {
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
            switch(choice){
                case 1:
                int Result = num1 + num2;
                System.out.println("Addition Result: " + Result);
                break;
                case 2:
                System.out.println("Subtraction Result: " + (num1 - num2));
                break;
                case 3:
                System.out.println("Exiting the program. Goodbye!");
                break;
                // default:
                // System.out.println("Not on the menu");
            }
            // ตรวจสอบการออกลูป while ture
            if(choice == 1){
                break; // ออกจากลูป while(ture)
            }else if(choice == 2){
                break; // ออกจากลูป while(ture)
            }else if(choice == 3){
                break; // ออกจากลูป while(ture)
            }else {
                System.out.println("Not on the menu");
            }
        }
    }
}
