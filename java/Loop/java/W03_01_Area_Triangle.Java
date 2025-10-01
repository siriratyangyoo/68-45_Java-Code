import java.util.Scanner;
public class W03_01_Area_Triangle {
    public static void main(String[] args){
        Scanner Kb = new Scanner(System.in); // สร้างอ็อบเจกต์ Sacnner เพื่อรับข้อมูลจากผู้ใช้
        
        // Input base and height of triangle
        System.out.println("Enter base = "); // แสดงข้อความให้ผู็ใช้ป้อนฐานของรูปสามเหลี่ยม
        int base = Kb.nextInt(); // รับค่าฐานจากผู้ใช้ที่กรอกผ่านคีบอร์ดเป็นจำนวนเต็ม
        System.out.println("Enter height = "); 
        int height = Kb.nextInt(); 
        
        // Calculate area of triangle
        double area = 0.5* base* height;  //  หรือใส่ชนิดข้อมูลเป็น Float ก็ได้
        // output area of triangle
        System.out.println("Area Of Triangle =" + area);
        Kb.close(); // ปิดอ็อบเจกต์ Scannner เพื่อป้องกันการรั่วไหลของทรัพยากร
    }
}