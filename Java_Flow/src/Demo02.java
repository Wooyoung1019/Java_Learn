import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner02 = new Scanner(System.in);
        System.out.println("使用nextLine方式接收");
        if (scanner02.hasNextLine()) {
            String str = scanner02.nextLine();
            System.out.println("输入的内容为：" + str);
        }
        scanner02.close(); // 关闭扫描器
    }
}
