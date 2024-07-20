# 数组

## 数组概述

+ 相同类型数据的有序集合
+ 数组描述的是相同类型的若干个数据，按照一定的先后次序排列组合而成
+ 每一个数据称作一个数组元素，每个数组元素通过一个下标来访问他们



## 数组声明创建

+ ```java
  # 声明数组
  int[] array; // 常用
  int array[]; // 知道就行
  ```

+ ```java
  # 创建数组
  nums = new int[10];
  ```

+ ```
  # 数组赋值
  num[0] = 1;
  # 取值
  num_0 = num[0];
  ```

+ 数组索引从0开始，没有赋值的默认为初始值

+ `array.Lenth`获取数组的长度

+ 长度一旦被创建就固定了

+ 同一数组元素类型相同

+ 数组中的元素可以是任何数据类型，包括基本类型和引用类型

+ 数组变量属于引用类型，也可以看作对象，每个元素是数组的成员变量

+ 下表的合法区间是[0，length - 1]

+ `ArrayIndexOutofBoundsException`：下标越界异常



## 数组使用

### for-each循环

### 三种初始化

+ 静态初始化 `int[] a = {1, 2, 3};`
+ 动态初始化 `int a = new int[2];`
+ 数组的默认初始化



## 多维 数组



## Arrays类



## 稀疏数组


