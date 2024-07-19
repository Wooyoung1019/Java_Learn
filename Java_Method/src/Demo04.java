public class Demo04 {
    public static void main(String[] args) {
        System.out.println(foo(2));
    }

    public static int foo(int a) {
        if (a == 1) {
            return 1;
        }else {
            return a * foo(a - 1);
        }
    }
}
