public class Demo08 {
    public static void main(String[] args) {
        int oddSun = 0;
        int evenSun = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenSun += i;
            } else {
                oddSun += i;
            }
        }
        System.out.println("奇数和为：" + oddSun);
        System.out.println("偶数和为：" + evenSun);
    }
}
