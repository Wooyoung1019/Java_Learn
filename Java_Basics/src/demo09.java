import java.util.Scanner;

public class demo09 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/(double) b);

        System.out.println("***************************");
        int d = 1;
        System.out.println("d = " + d);
        int e = d++;
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        int f = ++d;
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        double pow = Math.pow(2,3);
        System.out.println(pow);
    }
}