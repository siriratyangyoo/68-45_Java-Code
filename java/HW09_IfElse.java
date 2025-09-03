import java.time.Year;
import java.util.Scanner;
public class HW09_IfElse {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Student ID (9 Digit): ");
        int ID = kb.nextInt();
        int CurrentYear = Year.now().getValue() + 543 ;
        int Student = (ID / 10000000)+2500;
        int Year = CurrentYear-Student+1;
            if(Year ==1) {
                System.out.println(Year +" Freshmen");
            }else if(Year ==2) {
                System.out.println(Year +" Sophomore");
            }else if(Year ==3) {
                System.out.println(Year +" Junior");
            }else if(Year ==4) {
                System.out.println(Year +" Senior");
            }else if(Year >=5) {
                System.out.println(Year +"( Beyond 4 years)");
            }else{
                System.out.println("Not have data");
            }
        kb.close();
    }
}
