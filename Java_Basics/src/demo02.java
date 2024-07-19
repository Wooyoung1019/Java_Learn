public class demo02 {
    public static void main(String[] args) {
        // 整数扩展：进制  二进制 0b   十进制   八进制 0   十六进制 0x
        int i1 = 0b10; // 二进制
        int i2 = 10; // 十进制
        int i3 = 010; // 八进制
        int i4 = 0x10; //十六进制
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println("==========================");

        // 浮点数扩展
        // float    有限  离散  舍入误差    大约  接近但不等于
        // double
        // BigDecimal
        float f = 0.1f;
        double d = 1.0/10;
        System.out.println(f==d); //false
        System.out.println(f);
        System.out.println(d);

        float f1 = 1234561234f;
        float f2 = f1 + 1;
        System.out.println(f1 == f2); // true
        System.out.println("==========================");

        // 字符扩展
        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println((int)c1);
        System.out.println((int)c2);
        System.out.println((char)65);

        // 编码 Unicode
        char c3 = '\u0061';
        System.out.println(c3);

        // 转义字符
        System.out.println("hello\tworld\n!!!");

        // 布尔扩展
        boolean flag = true;
        if (flag == true){}
        if (flag){}
    }
}
