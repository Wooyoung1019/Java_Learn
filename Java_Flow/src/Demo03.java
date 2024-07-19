import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            System.out.println("整数数据：" + num);
        }else {
            System.out.println("输入的不是整数");
        }
        System.out.println("请输入一个小数：");
        if (scanner.hasNextFloat()) {
            float num = scanner.nextFloat();
            System.out.println("小数数据：" + num);
        }else {
            System.out.println("输入的不是小数");
        }
        scanner.close();
    }
}
