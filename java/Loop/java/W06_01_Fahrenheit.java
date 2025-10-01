import java.util.Scanner;
public class W06_01_Fahrenheit {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("(F°): ");
        double fahrenheit = kb.nextDouble();
        double Celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("แปลงเป็นCelsius =" +Celsius);
        kb.close();
    }
}