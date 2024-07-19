# 注释

+ 代码量比较少的时候还可以看懂，但当项目结构复杂起来，就需要用到注释了
+ 注释不会执行，是给写代码的人看的
+ Java中的注释有三种：
  + 单行注释
  + 多行注释
  + 文档注释

---

# 标识符

|              |              |             |               |            |
|:------------:| :----------: |:-----------:|:-------------:|:----------:|
|   abstract   |    assert    | **boolean** |   **break**   |  **byte**  |
|     case     |    catch     |  **char**   |   **class**   |   const    |
| **continue** |   default    |     do      |  **double**   |  **else**  |
|     enum     |   extends    |  **final**  |    finally    | **float**  |
|   **for**    |     goto     |   **if**    |  implements   |   import   |
|  instanceof  |   **int**    |  interface  |   **long**    |   native   |
|   **new**    |   package    | **private** | **protected** | **public** |
|  **return**  |   stricttp   |  **short**  |  **static**   |   super    |
|    switch    | synchronized |    this     |     throw     |   throws   |
|  transient   |     try      |  **void**   |   volatile    |   while    |

+ 所有标识符都应该以字母、美元符、下划线开始
+ 首字母之后可以是字母、美元符、下划线或数字的任何符号组合
+ 不能使用关键字作为变量名或标识符
+ 标识符是大小写敏感的
+ 可以使用中文命名，但是一般不建议，也不建议使用拼音，很low 

---

# 数据类型

## 强类型语言

+ 要求变量的使用严格符合规定，所有变量都必须先定义后才能使用

## 弱类型语言

+ 变量可以不符合规定

> Java的数据类型分为两大类
>
> + 基本类型
>   + 数值类型
>     + 整数
>       + byte
>       + short
>       + int
>       + long
>     + 浮点数
>       + float
>       + double
>     + 字符类型
>       + char
>   + boolean类型
> + 引用类型
>   + 类
>   + 接口
>   + 数组

+ 位（bit）：是计算机内部数据存储的最小单位，8位二进制
+ 字节（byte）：是计算机中数据处理的基本单位，习惯上用大写B表示
+ 字符：是指计算机中使用的字母、数字、字和符号

+ 1bit=1位
+ 1B=8b
+ 1KB = 1024B    1MB = 1024KB    1GB = 1024MB    1TB = 1024GB

## 整数扩展

> 二进制：0b开头的数字
>
> 八进制：0开头的数字
>
> 十进制：正常
>
> 十六进制：0x开头的数字

## 浮点数扩展

> ```java
> float f = 0.1f;
> double d = 1.0/10;
> // (f == d) 为false?
> ```
>
> ```java
> float f1 = 1234561234f;
> float f2 = f1 + 1;
> // (f1 == f2) 为true?
> ```

## 字符扩展

> 所有字符本质还是数字
>
> 编码 Unicode

## 转义字符

`\t` `\n`

## 布尔扩展

```java
boolean flag = true;
if (flag == true){} //老手
if (flag){} //新手
```