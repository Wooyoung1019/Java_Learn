public class demo03 {
    public static void main(String[] args) {
        // 强制转换 （类型）变量名
        int i = 128; //内存溢出
        byte b = (byte) i;
        for (int a = 97; a < 1000; a++){
            System.out.println((char) a);
        }
    }
}
