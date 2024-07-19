public class demo04 {
    public static void main(String[] args) {
        // 操作比较大的数的时候，注意溢出问题
        int money = 10_0000_0000;
        int years = 20;
        int total = money*years; //-1474836480 计算的时候已经溢出了
        long total2 = money*years; // 默认是int 转换前已经存在问题
        long total3 = money*((long) years);
        System.out.println(total);
        System.out.println((long) total);
        System.out.println((double) total);
        System.out.println(total2);
        System.out.println(total3);

        long money1 = 10_0000_0000L;
        int years1 = 10;
        long total4 = money1*years;
        System.out.println(total4);
    }
}
