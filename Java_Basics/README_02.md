# 类型转换

+ 由于Java是强类型语言，所以要进行有些运算的时候，要用到类型转换

  > 低-------------------------------------------------------------->高
  >
  > byte，short，char -> int -> long -> float -> double

+ 运算中，不同类型的数据先转化为同一类型，然后进行运算

+ 强制类型转换：高-》低

+ 自动类型转换：低-》高

+ 自动向上转型

---

# 注意点

1. 不能对布尔类型转换
2. 不能把对象类型转换为不相干的类型
3. 在高转低的时候，强制转换
4. 转换的时候可能存在内存溢出，或者精度问题

---

# 变量

+ 变量就是可以变化的量

+ Java是一种强类型语言，每个变量都必须声明其类型

+ Java变量是程序中最基本的存储单元，其次要素包括变量名，变量类型和**作用域**

  > type varName  [=value] [{, varName [=value]}];
  >
  > // 数据类型 变量名 = 值；

+ 注意事项

  + 每个变量都有类型，类型可以是基本类型也可以是引用类型
  + 变量名必须是合法的标识符
  + 变量声明是一条完整的语句，因此每一个声明都必须以分号结束

# 作用域

+ 类变量 static
+ 实例变量
+ 局部变量
+ 常量 final

# 命名规范

+ 见名知意
+ 类成员变量：首字母小写和驼峰原则
+ 局部变量：首字母小写和驼峰原则
+ 常量：大写字母和下划线
+ 类名：首字母大写和驼峰原则
+ 方法名：首字母小写和驼峰原则

# 运算符

+ 算数运算符：+，-，*，/，% ，++，--
+ 赋值运算符：=，+=，-=，*=，/=
+ 关系运算符：>，<，>=，<=，==，!=，instanceof
+ 逻辑运算符：&&(短路运算)，||，!
+ 位运算符：&，|，^，~，>>，<<，>>>
+ 条件运算符：?，:

> A = 0011 1100
>
> B = 0000 1101
>
> A & B：0000 1100
>
> A | B：0011 1101
>
> A ^ B：0011 0001（相同是0）
>
> ~B：1111 0010

# 三元运算符

`a = x ? y : z` : x如果为真a=y，x如果为反a=z

# 优先级

`(`  `)`
