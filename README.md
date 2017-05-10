# About Java

### Study Method

**多练；多问；自己动手，调试错误；复习和总结！**

### Basic Concept

#### 对象

万物皆对象，客观存在的事物皆为对象！

#### 封装、继承、多态

封装：*就是将类的某些信息隐藏在类内部，不允许外部直接访问，而是通过该类提供的方法来实现对隐藏信息的访问。*

*多态 = 引用多态 + 方法多态*

#### JDK、JRE、JVM ？

JDK：*Java Development Kit （Java 开发工具包）*

JRE ：*Java Runtime Environment（Java 运行时环境）* 

JVM：*Java Virtual Machine （Java 虚拟机）*

#### 数据类型

数据类型分为 基本数据类型 和 引用数据类型

基本数据类型分为 数值型（byte，short，int，long，float，double） 字符型（char） 布尔型（boolean）

引用数据类型分为 类（class） 接口（interface） 和 数组

#### 关键字

super final abstract

#### 常量

用 `final` 关键字声明，且常量名一般为大写字符。

```java
final char SEX = '男';
```

#### 访问修饰符 private、protected、public

|  访问修饰符 | 本类 | 同包 | 子类 | 其他 |
| --------- |:----:|:---:|:---:| ----:|
| private   | true |||
| 默认 (缺省)   | true | true ||
| protected | true | true | true |
| public    | true | true | true |true|

#### 成员内部类、静态内部类、方法内部类

#### a++ VS ++a

	int b = a++;  // 先将 a 的值赋值给变量 b，然后再执行自增
	int c = ++a;  // 让 a 先自增，然后将值赋给变量 b
	
#### 运算优先级

*`()` 运算优先级最高！*

#### 分支

`continue` 的作用是跳过循环体中剩余的语句执行下一次循环。

### 语法

#### equals()

*equals() 比较的是对象的引用是否是指向同一块内存地址。*

`equals("Hello")`  //用于判断字符串的内容是否相同，相同则返回 true。

#### 一维声明数组的方式

	int[] scores = new int[5];
	String[] names = {"Bob","Jeff","Lucy"};

#### 二维声明数组的方式

	String[][] names = new String[2][3];
	int[][] ages = {{2,3},{4,5}};