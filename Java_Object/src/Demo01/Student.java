package Demo01;

// 学生类
public class Student {
    // 属性：姓名，年龄，性别，学号
    String name;
    int age;

    // 构造方法
    public Student() {
        System.out.println("构造方法");
        this.name = "wooyoung";
        this.age = 24;
    }

    // 方法
    public void study() {
        System.out.println(this.name + "学习");
    }


}