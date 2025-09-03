package Loop;

public class W10_02_While_Even10 {
    public static void main(String[] args) {
        int count = 2;
        int sum = 0; // ตัวแปรสำหรับเก็บผลรวม
        while(count <= 20){
            sum = sum + count;  //นำค่า count มาบวกกับ sum
            if(count < 20){
                System.out.print(count+" + ");
            }else{
                System.out.print(count+" = "+sum);
            }
            count = count+2;
        }
    }
}

