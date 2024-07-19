# 包机制

> 包的本质就是一个文件夹

+ 为了更好的组织类，Java提供了包机制，用于区别类名的命名空间

+ 包语句的语法格式为：

  `package pkg [. pkg2 [. pkg3...]];`

+ 一般利用公司域名倒置作为包名

+ `package`必须放在最前面，`import`放在其后

# [JavaDoc](https://www.oracle.com/cn/java/technologies/java-se-api-doc.html)

+ 是用来生成自己的API文档
+ 参数信息
  + @author 作者名
  + @version 版本名
  + @since 指明需要最早使用的jdk版本
  + @param 参数名
  + @return 返回值情况
  + @throws 异常抛出情况 

CMD：`javadoc 参数 Java文件`

IDEA：`Tools`->`Generate java Doc`->