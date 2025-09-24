package Arrays;
import java.util.Scanner;

public class W15_02_SumNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double a[] = new double[5];
        for(int i = 0 ;i < a.length ;i++){
            System.out.print("Enter Number ["+ (i+1) +"] : ");
            a[i]= kb.nextDouble();
        }
        double sumAll = 0;
        double sumOdd = 0;
        double sumEven = 0 ;
        double average = 0;
        double max = a[0];
        double min = a[0];
        System.out.println("Show all Number : ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("index ["+ i +"] : "+a[i]);
            sumAll += a[i];
            if (a[i] % 2 != 0) {
                sumOdd += a[i];
            }else{
                sumEven += a[i];
            }
            if (a[i] > max){
                max = a[i];
            }
            if (a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Sum of all Number "+ sumAll);
        System.out.println("Sum of Odd Number "+ sumOdd);
        System.out.println("Sum of Even Number "+ sumEven);
        System.out.println("Sum of Odd+Even Number "+ (sumOdd+sumEven));
        average = sumAll / a.length;
        System.out.println("Sum of average Number "+ average);
        System.out.println("Max Number "+ max);
        System.out.println("Min Number "+ min);
        kb.close();
    }
}
