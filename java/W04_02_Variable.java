public class W04_02_Variable {
    public static void main(String[] args) {
        // ประกาศตัวแปรและชนิดข้อมูล
        byte a;
        byte b;
        // กำหนดค่าให้กับตัวแปร
        a = 10; // กำหนดค่า 10 ให้กับ ตัวแปร a
        b = 20; // กำหนดค่า 20 ให้กับ ตัวแปร b
        
        
        // เราสามารถรวมตัวแปรที่ประกาศไว้แล้วให้อยู่ในบรรเดียวกันได้
        byte aa, bb; // ประกาศตัวแปร a และ b เป็นชนิดข้อมูล byte
        byte aaa = 0, bbb = 0; // ประกาศตัวแปร a และ b เป็นชนิดข้อมูล byte
        
        
        // ประกาศตัวแปรและชนิดข้อมูล พร้อมกับการกำหนดค่า
        short c = 30; // กำหนนดค่า 30 ให้กับตัวแปร c

        int ch = '\u0044';
        System.out.println(ch);

        String ch1 = "\u0044";
        System.out.println(ch1);

        String ch2 = "\u0044";
        System.out.println(ch2);

        int var1 = 014;
        System.out.println(var1);

        float var2 = 014f;
        System.out.println(var2);

        double var4 = 0E-0;
        System.out.println(var4);
        
        String var9 = null;
        System.out.println(var9);

        boolean var10 = true;
        System.out.println(var10);

        boolean var11 = 2>3;
        System.out.println(var11);
    }
}