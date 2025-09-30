public class HW15_ArrayOddEven {
    public static void main(String[] args) {
        int[] arr = {7, 9, -1, 4, 12, 9, 3, 2, -7, 2, 1, 9, -15, 24, 11, 13};
        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0 ;i < arr.length;i++) {
            int num = arr[i];
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Odd: " + oddCount);
        System.out.println("Even: " + evenCount);
    }
}