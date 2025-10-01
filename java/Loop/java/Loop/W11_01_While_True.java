package Loop;
import java.util.Scanner;
public class W11_01_While_True {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        while(true){
        // NO.1 เขียนโปรแกรมรับตัวเลขจากคีย์บอร์ดไปเรื่อยๆ จนกระทั่งกดเบอร์ 9 จึงจะหยุด
            // System.out.print("Enter Number: ");  //รับค่า
            // int num = kb.nextInt();
            // if (num == 9) { // คำสั่งที่ใช้ตรวจสอบการออกจากลูป
            //     break; // คำสั่งให้ออกจากลูป
            // }
        // NO.2 เขียนโปรแกรมรับตัวเลขจากคีย์บอร์ดไปเรื่อยๆ จนกระทั่งกดอักษร "e" จึงจะหยุด
            System.out.print("Enter alphabet: ");  //รับค่า
            String alphabet = kb.nextLine();
            if (alphabet.equals("e")) { // คำสั่งที่ใช้ตรวจสอบการออกจากลูป
            break;
            }
        }
    }
}
