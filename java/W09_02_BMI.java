import java.util.Scanner;
public class W09_02_BMI{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter weight(kg): ");
        double weight = kb.nextDouble();
        System.out.print("Enter height(cm): ");
        double height = kb.nextDouble();
        double bmi = weight / ((height/100)*(height/100));
        System.out.println("Your BMI is: "+ String.format("%.2f", bmi));
        if(bmi > 40) {
            System.out.println("โรคอ้วนระดับ3");
        }else if(bmi >= 35) {
            System.out.println("โรคอ้วนระดับ2");
        }else if(bmi >= 30) {
            System.out.println("โรคอ้วนระดับ1");
        }else if(bmi >= 25) {
            System.out.println("น้ำหนักเกิน");
        }else if(bmi >= 18.5) {
            System.out.println("น้ำหนักปกติ");
        }else {
            System.out.println("น้ำหนักต่ำกว่าเกณฑ์(ผอม)");
        }
        kb.close();
    }
}
