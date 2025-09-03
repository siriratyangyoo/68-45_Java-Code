import java.util.Scanner;

public class W07_03_OddEven {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = kb.nextInt();
        // procress : สูตรคำนวณเลขคู่เลขคี่
        int x = n%2; // เอาตัวแปรที่รับเข้ามาไปหารด้วย2
        if(x == 0) {
            System.out.println("Even"); // คู่
        }else {
            System.out.println("Odd"); // คี่
        }
    }
}