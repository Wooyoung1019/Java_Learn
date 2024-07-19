import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        // 我们可以输出多个数字，并求其总和与平均数，每输入一个数字用回车确认，
        // 通过输入非数字来结束并输出执行结果
        Scanner scanner = new Scanner(System.in);
        double sun = 0;
        int num = 0;
        System.out.println("请输入多个数字，用回车确认，输入非数字结束：");
        while (scanner.hasNextDouble()) {
            double nextDouble = scanner.nextDouble();
            sun += nextDouble;
            num++;
        }
        System.out.println("输入了" + num + "个数字");
        System.out.println("总和为：" + sun + "，平均数为：" + sun / num);
        scanner.close();
    }
}
