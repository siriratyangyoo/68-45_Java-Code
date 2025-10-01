import java.util.Scanner;
public class W07_04_aboutCircle {
    public static void main(String[] args) {
        // ต้องการให้ผู้ใช้เลือกว่าจะคำนวณอะไรเกี่ยวกับวงกลม : คำนวณพื้นที่ หรือ เส้นรอบวง
        // สิ่งที่จะต้องรับเข้ามาเกี่ยวกับวงกลมคือ รัศมี (radiaus)
        // เส้นรอบวง = 2 * pi * r
        // พื้นที่ = pi * r^2
        final double PI = 3.14; // ค่าคงที่ ของ PI
        Scanner scanner = new Scanner(System.in);
        System.out.println("กรุณาใส่ตัวเลขรัศมี");
        double radius = scanner.nextDouble();
        System.out.println("ต้องการคำนวณหาอะไร [1]พื่นที่(Area) [2]เส้นรอบวง(Circum) :");
        System.out.println("กรุณาเลือก(1 หรือ 2):");
        int choice = scanner.nextInt();
        if(choice ==1) {
            double Circum = 2*PI*radius;
                System.out.println("พื้นที่"+Circum);
        }else if(choice ==2) {
            double Area = PI*radius*radius;
                System.out.println("เส้นรอบวง"+Area);
        }else{
            System.out.println("กรุณาใส่เลือกแค่ 1หรือ 2");    
        }
    }
}