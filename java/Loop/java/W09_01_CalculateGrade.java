import java.util.Scanner;
public class W09_01_CalculateGrade {
    public static void main(String[] args) {
        // รับค่าคะแนน
        // เปรียบเทียบคะแนนว่าได้เกรดอะไร
        // เกณฑ์คะแนนและเกรด
            // A = 80;
            // B = 70;
            // C = 60;
            // D = 50;
            // F = 0-49;
            // ตรวจสอบคะแนนไว่าอยู่ในช่วง 0-100
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Score: ");
        byte Score =scanner.nextByte();
        if (Score >=0 && Score <= 100) {
            if(Score >=80) {
                System.out.println("Grade A");
            }else if(Score >=70) {
                System.out.println("Grade B");
            }else if(Score >=60) {
                System.out.println("Grade C");
            }else if(Score >=50) {
                System.out.println("Grade D");
            }else{
                System.out.println("Grade F");
            }
        }else {
            System.out.println("คะแนนไม่อยู่ในช่วง 0-100");
        }
        scanner.close();
    }
}
