public class Demo03 {
    public static void main(String[] args) {
        Demo03 demo03 = new Demo03();
        demo03.test(1, 2, 3, 4, 5);
    }

    public void test(int ... i) {
        System.out.println(i[1]);
    }
}
