package Loop;

public class W11_06_For_Even10 {
    public static void main(String[] args) {
        for(int i = 2,sum = 0 ; i<=20 ; i+=2) {
            sum = sum + i;
            if(i < 20){
                System.out.print(i+" + ");
            }else{
                System.out.print(i+" = "+sum);
            }
        }
    }
}
