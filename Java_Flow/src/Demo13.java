public class Demo13 {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i*2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
