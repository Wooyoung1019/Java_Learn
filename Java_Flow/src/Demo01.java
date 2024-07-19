import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner01 = new Scanner(System.in);
        System.out.println("使用next方式接收：");
        if (scanner01.hasNext()) {
            String str = scanner01.next();
            System.out.println("输入的数据为：" + str);
        }
        scanner01.close(); // 关闭扫描器
    }
}
