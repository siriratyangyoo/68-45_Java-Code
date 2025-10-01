package Arrays;

public class W13_02_BasicArray {
    public static void main(String[] args) {
        // การประกาศตัวแปรแบบ Array แบบที่1 ระบุสมาชิกในวงเล็บปีกกา
        //String [] animal;
        String animals[] = {"Dog","Cat","Lion"};
        int Dice [] = {1,2,3,4,5,6};
        float avgScore [] = {3.50f,4.00f,2.75f};
        // หาขนาดของ Array
        System.out.println("Size of animals array : " + animals.length);
        System.out.println("Animals at index 0 : " + animals[0]);
        System.out.println("Animals at index 2 : " + animals[2]);

        //วนลูปแสดงสมาชิกใน Array
        System.out.println("Show all average score : ");
        for(int i = 0;i < avgScore.length ;i++){
            System.out.println(avgScore[i]);
        }

        //==================================================================
        // การประกาศตัวแปรแบบ Array แบบที่2 ระบุขนาดของ Array
        String colors[] = new String[4];
        colors[2] = "Red";
        colors[0] = "Green";
        colors[3] = "Blue";
        int y = 0;
        for(int x = 0;x < colors.length ;x++){
            System.out.println("Block " + y + " : " + colors[x]);
            y++;
        }
        System.out.println("Size of colors array : " + colors.length);
        System.out.println("Colors at index 0 : " + colors[0]);
        System.out.println("Colors at index 1 : " + colors[1]);
        
        //==================================================================
        int Score[] =new int[5];
        Score[0] = 50;
        System.out.println("Score at index 4 : " + Score[4]);
    }
}
