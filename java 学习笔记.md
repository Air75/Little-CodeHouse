# JAVA学习笔记(基础篇)
## **1、常用的DOS命令**
* *cls* 清屏
* *DOS* 窗口的内容怎么复制：<br>
在DOS窗口的任意位置，点击鼠标右键，选择标记，选中需要复制的内容，在DOS窗口的任意位置点击鼠标右键，此时被复制的内容已经到剪贴板了。在需要粘贴的未知粘贴即可。
* *dir* 列出当前目录下所有的子文件/子目录。
* *cd*
	* cs命令表示：change directory【改变目录】
	* cd命令怎么使用？
	cd 目录的路径
	* 但是路径包括绝对路径和相对路径
	* 绝对路径：表示该路径从某个磁盘的盘符下作为出发点的路径
	* 相对路径：表示该路径从当前所在的路径下作为出发点的历经
* *cd ..* 回到上级目录
* *cd \\* 直接回到根目录
* 怎么切换盘符？<br>
	* 输入需要切换的盘符+:即可。例：<br>
	c:<br>
	d:<br>
	e:
******
### **附：Java的编译与运行及环境变量**
* 使用记事本、Notepad++、editplus、UltraEdit等文本编辑器编写好Java源文件（文件拓展名为.java），在源文件所在目录打开cmd
使用`javac 文件名.java`进行编译，编译为扩展名为.class的字节码文件，编译完成后使用`java 文件名`运行，运行时不需要加上扩展名。 <br>
* windows操作系统搜索硬盘上某个命令的方法：
  * 首先会从当前目录下搜索；
  * 当前目录搜索不到时，会从环境变量path指定的路径当中搜索某个命令；
  * 如果搜索不到，则会报错。
* 绿色软件链接：<a href="http://www.carrotchou.blog/">胡萝卜周</a>
********
## **2、JAVA 课程(第二章 java语言基础)**
<a href="https://www.bilibili.com/video/av11361088?p=1" target="_blank">链接：哔哩哔哩 动力节点Java零基础学习视频</a>

### **1、HelloWorld程序**
* 课程链接 <a href="https://www.bilibili.com/video/av11361088?p=14">点这p14</a>
```java
public calss HelloWorld
{
public static void main(String[] args)
{
System.out.println("Hello World!");
}
}
```
*****
### **2、数据类型**
* 课程链接 <a href="https://www.bilibili.com/video/av11361088?p=32">点这p32</a>
 
数据类型|字节大小|比特位/二进制位|默认值
:--:|:--:|:--:|:--:
byte|1|8|0
short|2|16|0
int|4|32|0
long|8|64|0L
float|4|32|0.0f
double|8|64|0.0d
boolean|1|8|false
char|2|16|\u0000
* 对于数值类型的基本类型的取值范围，我们无需强制去记忆，
因为它们的值都已经以常量的形式定义在对应的包装类中了。请看下面的例子：
```java
public class DataType02 {  
    public static void main(String[] args) {  
        // byte  
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);  
        System.out.println("包装类：java.lang.Byte");  
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);  
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);  
        System.out.println();  
  
        // short  
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);  
        System.out.println("包装类：java.lang.Short");  
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);  
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);  
        System.out.println();  
  
        // int  
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);  
        System.out.println("包装类：java.lang.Integer");  
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);  
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);  
        System.out.println();  
  
        // long  
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);  
        System.out.println("包装类：java.lang.Long");  
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);  
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);  
        System.out.println();  
  
        // float  
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);  
        System.out.println("包装类：java.lang.Float");  
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);  
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);  
        System.out.println();  
  
        // double  
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);  
        System.out.println("包装类：java.lang.Double");  
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);  
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);  
        System.out.println();  
  
        // char  
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);  
        System.out.println("包装类：java.lang.Character");  
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台  
        System.out.println("最小值：Character.MIN_VALUE="  
                + (int) Character.MIN_VALUE);  
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台  
        System.out.println("最大值：Character.MAX_VALUE="  
                + (int) Character.MAX_VALUE);  
    }  
}
```
* 结果如下：
```java
基本类型：byte 二进制位数：8
包装类：java.lang.Byte
最小值：Byte.MIN_VALUE=-128
最大值：Byte.MAX_VALUE=127

基本类型：short 二进制位数：16
包装类：java.lang.Short
最小值：Short.MIN_VALUE=-32768
最大值：Short.MAX_VALUE=32767

基本类型：int 二进制位数：32
包装类：java.lang.Integer
最小值：Integer.MIN_VALUE=-2147483648
最大值：Integer.MAX_VALUE=2147483647

基本类型：long 二进制位数：64
包装类：java.lang.Long
最小值：Long.MIN_VALUE=-9223372036854775808
最大值：Long.MAX_VALUE=9223372036854775807

基本类型：float 二进制位数：32
包装类：java.lang.Float
最小值：Float.MIN_VALUE=1.4E-45
最大值：Float.MAX_VALUE=3.4028235E38

基本类型：double 二进制位数：64
包装类：java.lang.Double
最小值：Double.MIN_VALUE=4.9E-324
最大值：Double.MAX_VALUE=1.7976931348623157E308

基本类型：char 二进制位数：16
包装类：java.lang.Character
最小值：Character.MIN_VALUE=0
最大值：Character.MAX_VALUE=65535
```
* 注：1字节=8比特位
* **转义字符<br>**
\\' -->单引号字符<br>
\\ -->反斜杠字符<br>
\r -->回车<br>
\n -->换行<br>
\f -->走纸换页<br>
\t -->横向跳格<br>
\b -->退格<br>

* **精度损失**
* 以下代码编译错误，错误原因：<br>
	不兼容的类型: 从long转换到int可能会有损失，即“精度损失”。
```java
public class DataType01
{
public static void main(String[] args)
{
int a;
a=123L;
System.out.println(a);
}
}
```

* java 在编译过程中将整数型数值默认视为int型。
* 关于浮点型数据类型
  * float 单精度【4个字节】
  * double 双精度【8个字节，精度较高】
   * double的精度太低【相对而言】，不适合做财务软件。财务涉及到钱的
   问题，要求精度较高，所以SUN公司在基础SE类库当中为程序员准备了精确度
   更高的类型，只不过这种类型是一种引用数据类型，不属于基本数据类型，
   它是：java.math.BigDecimal
   * 其实Java程序中SUN提供了一套庞大的类库，java程序员是基于这一套基础的类库来进
   行开发的。
   * 在Java语言当中，所有的浮点型字面值【3.0】，默认呗当做都变了类型来处理，要想该
   字面值被当做float类型来处理，需要在字面值后面添加F/f。
```java
public class DataType03
{
public static void main(String[] args)
{
// 3.0是double类型的字面值，d是double类型的变量，不存在类型转换
double d = 3.0;
System.out.println(d);

/*5.1是double类型的字面值，f是float类型的变量，大容量转换成小容量需要加强制类型
转换符，所以以下程序编译报错。
*/
//float f = 5.1;

//解决方案1：强制类型转换
float f = (float)5.1;
//解决方案2：没有类型转换
float f = 5.1F;
}
}   
```
* **注意：double和float在计算机中内部二进制存储的时候存储的都是近似值。**
* 关于布尔型数据类型：
* 在Java语言当中boolean类型只有两个值，true和false，没有其他值，不像C语言当中，
0和1可以表示假和真。
* 关于基本数据类型之间的互相转换：六条转换规则【需要记住】

1. 八种基本数据类型当中除布尔类型之外剩下的7种类型之间都可以相互转换
2. 小容量向大容量转换，称为自动转换，容量从小到大排序为：
   - byte<short(char)<int<long<float<double
   - 注：任何浮点型不管占用多少个字节，都比整数型容量大。char和short可表示的种类
  数量相同，但是char可以取更大的正整数。
3. 大容量转换成小容量，叫做强制类型转换，需要加强制类型转换符，程序才能编译通过，
但是在运行阶段可能会损失精度，所以谨慎使用。
4. 当整数字面值没有超出byte，short，char的取值范围，可以直接复制给byte，short，
char类型的变量。
5. byte，short，char混合运算的时候，各自先转换成int类型再做运算。
6. 多种数据类型混合运算，先转换成容量最大的那种类型再做运算。 
* 八种基本数据类型的默认值是一切向0看齐。
******
### **3、运算符**
* 课程链接 <a href="https://www.bilibili.com/video/av11361088?p=45">点这p45</a>
* 算数运算符
* 关系运算符
* 逻辑运算符
* 赋值类运算符
* 字符串连接运算符
* 三元运算符

* **1、关于Java编程中运算符之：算术运算符**

运算符|含义
:--:|:--:
+|求和
-|相减
*|乘积
/|商
%|求余数【取模】
++|自加1
--|自减1

* **2、关系运算符**

运算符|含义
:--:|:--:
\>|大于
\>=|大于等于
<|小于
<=|小于等于
==|等于
!=|不等于

* =  是赋值运算符
* == 是关系运算符  关系运算符运算的结果一定是布尔类型：true/false

* **3、逻辑/布尔运算符**

运算符|含义
:--:|:--:
$|逻辑与
\||逻辑或
!|逻辑非
^|逻辑异或（两边的算子只要不一样-->一真一假,结果就是true）
<=|小于等于
==|等于
!=|不等于
&&|短路与
\|\||短路或

* 逻辑运算符要求两边的算子都是布尔类型，并且逻辑运算符最终的运算结果为布尔类型。
* 注：
 1. 短路与和逻辑与最终的运算结果是相同的，只不过短路与存在短路现象。
 2. 短路或和逻辑或最终的运算结果是相同的，只不过短路或存在短路现象。
 * 逻辑与与短路与
 ```java
 public class OpertorTest01
 {
 public static void main(String[] args)
 {
  int x=10;
  int y=8;
  //逻辑与
  System.out.println(x < y & ++x < y);
  System.out.println(x);//结果为：11
 
 int a=10;
  int b=8;
  //短路与
  /*
    x < y 的结果是false，整个表达式的结果已经确定为false，所以后面的表达式没有再执行，
  	这种现象被称为短路现象。短路与才会有短路现象，逻辑与是不会存在短路现象的，
  */
  System.out.println(a < b && ++a < b);
  System.out.println(a);//结果为：10
 }
 }
 ```
  * 从某个角度来看，短路与更智能，由于后面的表达式可能不执行，所以执行效率较高，这种方式在实际的开发中使用较多，短路与比逻辑与使用的多。短路与更常用。
  * 但是，在某些特殊的业务逻辑当中，要求运算符两边的算子必须全部执行，此时必须使用逻辑与，不能使用短路与，不能使用短路与，使用短路与可能导致右边的表达式不执行。
  * **什么时候发生短路或？**
    * 第一个表达式执行的结果为true，会发生短路或。
  * **什么时候发生短路与？**
    * 第一个表达式执行的结果为false，会发生短路与。

* 赋值运算符
  * 赋值类运算符包括：
    * 基本的赋值运算符  =
    * 扩展的赋值运算符  += -= *= /= %=
    * 赋值类的运算符优先级：先执行等号右边的表达式，将执行的结果赋给左边的变量。
  ```java
  public class OpertorTest02{
  public static void main(String[] args){
    //注意以下代码
    int i=10;
    i += 5;//等同与：i=i + 5;
    System.out.println(i);
    //扩展的赋值运算符【+=运算符可以翻译为“累加/追加”】
    byte c=10;
    //c=c+5;//编译报错
    c += 5;//编译通过,此处等同于 c=(byte)(c+5);
    byte z= 0;
    z += 128;//编译通过，等同于：z = (byte)(z + 128);
    System.out.println(z);// -128 [损失精度]
    // 重要结论：扩展类的复制运算符不改变运算结果类型，假设最初这个变量的类型是byte类型，无论怎么进行追加或追减，最终该变量的数据类型还是byte类型。
  } 
  }
  ```
  * 字符串连接运算符
    * 关于‘+’
      * '+' 运算符在Java语言当中有两个作用：
        1. 加法运算，求和
        2. 字符串的连接运算
      * 当‘+’运算符两边的数据都是数字的化，一定是进行加法运算。
      * 当‘+’ 运算符两边的数据只要有一个数据是字符串。一定会进行字符串连接运算，并且，连接之后的结果还是一个字符串类型。 
    * 三目运算符
      * 语法规则：
        * 布尔表达式？表达式1：表达式2
        * 当布尔表达式的结果为true的时候，选择表达式1作为整个表达式的结果。
        * 当布尔表达式的结果为false的时候，选择表达式2作为整个表达式的结果。
```java
          public class OpertorTesto3{
            public static void main(String[] args){
              boolean sex = false;
              //sex ? '男':'女';编译报错，因为它不是一个完整的Java语句。
              //正确语法
              char c= sex ? '男':'女';
              System.out.println(c);
            } 
          }
``` 
***************
### **4、控制语句**
* 课程链接 <a href="https://www.bilibili.com/video/av11361088?p=52">点这p52</a>
* 选择结构
  * if,if...else
  * switch
* 循环结构
  * for
  * while
  * do...while()
* 控制循环的语句
  * break
  * continue 
***********
* 关于if
  * if语句的语法结构：四种编写方式
    * 第一种：
    ```
    if(布尔表达式){
    java语句；
    java语句；
    java语句；
    ...
    }
    ```
    * 第二种：
    ```
    if(布尔表达式true){
    Java语句；
    Java语句；
    ...
    }
    else{
      java语句；
      java语句；
      ...
    }
    ```
    * 第三种：
    ```
    if(布尔表达式){
      java语句；
      java语句；
      ...
    }
    else if{
      java语句；
      java语句；
      ...
    }
    else if{
      java语句；
      java语句；
      ...
    }
    else if{
      java语句；
      java语句；
      ...
    }
    ``` 
    * 第四种：
    ```
    if(布尔表达式){
      java语句；
      java语句；
      ...
    }
    else if{
      java语句；
      java语句；
      ...
    }
    else if{
      java语句；
      java语句；
      ...
    }
    else if{
      java语句；
      java语句；
      ...
    }
    else{
      java语句；
      java语句；
      ...
    }
    ``` 
    * 注意：以上的第二种编写方式和第四种编写方式都带有else分支，这两种方式可以保证百分之百会有分支执行。
    * 所有的控制语句都是可以嵌套使用的，只要合理嵌套就行。
    * 对应课程：52节。
    * **附：接受用户键盘输入**
    ```java
    public class KeyInput{
      public static void main(String[] args){
        //创建键盘扫描器对象
        java.util.Scanner S = new java.util.Scanner(System.in);
        //调用Scanner对象的next()方法开始接受用户键盘输入
        String UserInput = S.next();//接收字符串
        System.out.println("输入的字符串是："UserInput);
        int num = S.nextInt();//接收整数
        System.out.println("输入的整数是："num);
        double dnum = S.nextDouble();//接收浮点数
        System.out.println("输入的小数是："dnum);
      }
    }
    ```  
***************
* 关于switch
* switch也属于选择结构，也是分支语句
* 一个完整的switch语句应该这样编写：
  ```java
   switch(int/string类型的字面值或变量){
     case int/string类型的字面值或变量:
     Java语句;
     ...
     break;
     case int/string类型的字面值或变量:
     Java语句;
     ...
     break;
     case int/string类型的字面值或变量:
     Java语句;
     ...
     break;
     case int/string类型的字面值或变量:
     Java语句;
     ...
     break;
  ...
  default:
    java语句;
    ...   
   }
  ```

  * switch语句的执行原理：
    * switch后面小括号中的 “数据”和case后面的 “数据”进行一一匹配，匹配成功的分支执行。按照自上而下的顺序依次匹配。
    * 匹配成功的分支执行，分支当中没有"break;"语句的话，会直接进入下一个分支执行（不进行匹配），这种现象被称为case穿透现象，【提供break语句可以避免穿透】
    * 所有分支都没有匹配成功，当有default的语句时，会执行default分支当中的语句。
    * switch和case后面只能是int/string类型的数据，不能是探测其他数据类型。
      * 当然byte，short，char也可以直接写到switch和case后面，因为他们可以直接进行类型转换。
      * JDK6的switch和case后面只能探测int类型。
      * JDK7之后包括7在内，引入新特性，switch关键字和case关键字后面可以探测int或string类型的数据。
    * case可以合并：
    ```java
    int i = 10；
    switch(i){
      case 1: case 2: case 3: case 10:
      System.out.println("Test code!");
    }
    ``` 

    * <a href ="https://www.bilibili.com/video/av11361088?p=61">点击bilibili 课程p61</a>

******
* 循环结构：
  * 在程序当中总有一些需要反复的语句需要执行，如果没有循环结构，那么这段需要重复执行的代码自然是需要重复编写的。代码无法得到重复使用，所以多数编程语言都是支持循环结构的，将来把需要反复执行的代码片段放到“循环体”，再联合“计数器”，共同控制这段需要反复执行的代码片段。
  * 基本上所有的编程语言支持的循环结构包括三种：
    * for循环
    * while循环
    * do...while循环
  * for循环的语法结构：
    ```java
    for(初始化表达式;布尔表达式;更新表达式){
    循环体：由Java语句构成
     }
    ```
    * for循环的执行过程：
    ```java
    public class ForTest01{
      //输出数字1~10
      public static vois main(String[] args){
        int i;
        for(i=1;i <= 10;i++)
        System.out.println(i);
      }
    }
    ``` 
      * 始化表达式、布尔表达式、更新表达式都可以不写，但是；必须要。
      * 初始化表达式最先执行，在整个for循环当中只执行一次。
      * 执行过程：
        * 先执行初始化表达式，并且该表达式只执行一次
        * 判断布尔表达式的结果为true或false
          * 布尔表达式为true
            * 执行循环体
            * 执行更新表达式
            * 判断布尔表达式的结果为true或false
            * ...
          * 布尔表达式为false
            * 循环结束
* 继续学习 <a href="https://www.bilibili.com/video/av11361088?p=69">点这p69</a>
* 循环语句与条件判断语句嵌套使用
```java
public class ForTest
{
  public static void main(String[] args)
  {
            for(int i=1;i<=100;i++)
            {
                  if(i % 2 != 0)
                  {
                        System.out.println(i);
                  }
            }
  }
}
```
* for循环嵌套for循环
```java
public class ForTest
{
   public static void main(String[] args)
      {
            for(int i = 1;i <= 10;i++)
            {
                  for(int j = 1;j < 3;j++)
                  {
                        System.out.println(j);
                  }
            }
      }
}
```
  * 九九乘法表
  ```java
  public class Test //九九乘法表
  {
        public static void main(String[] args)
        {
              for(int i=1;i<10;i++)
              {
                    for(int j=1;j<=i;j++)
                    {
                          System.out.print(j+"*"+i+"="+(i*j)+" ");
                          if(i==j)
                          {
                                System.out.print("\n");
                                //System.out.println();
                          }
                    }
              }
        }
  }
  ``` 
**********
* **while语句**
  1. while循环的语法结构：
     ``` while（布尔表达式）
     {
         循环体；
     }  
     ```

   2. 使用while循环输出1~10
   ```java
  public class Test
  {
    public static void main(String[] args)
    {
      int i=1;
      while(i<=10)
      {
        System.out.println(i+" ");
        i++;
      }
    }
  }
   ```  
  * do...while循环
    * 语法结构
    ```java
    do
    {
      循环体；
    }
    while(布尔表达式);
    ``` 
  * 控制循环的语句break/continue
  * 关于break
    1. break是Java语句当中的关键字，被翻译为“中断”
    2. break+“;”可以称为一个单独的完整的Java语句：  break;
    3. break语句使用在switch语句当中，用来终止switch语句的执行。
    4. break语句同样可以使用在循环语句当中，用来种植循环的执行。
    * break终止哪个循环呢？
      ```java
      public class Test//以for循环为例
      {
        public static void main(String[] args)
        {
          for(int i=1;i<10;i++)
          {
            if(i==5)
            {
              break;
            }
            System.out.println(i);//输出结果为：1 2 3 4
          }
        }
      }
      ```   
      ```java
       public class Test//以for循环为例
      {
        public static void main(String[] args)
        {
          //给for循环起名for1
          for1:for(int j=0;j<3;j++)
          {
            //给for循环起名for2
          for2:for(int i=1;i<10;i++)
          {
            if(i==5)
            {
              break for1;//终止for1循环
            }
            System.out.println(i);//输出结果为：1 2 3 4
          }
        }
      }
      }
      ```
  * continue语句：
    * 表示：继续/下一个
    * continue语句也是一个continue关键字加一个分号构成一个单独的Java语句，主要出现在循环语句当中用来J控制循环的执行。
    * break与continue的区别
      * break表示终止循环；
      * continue表示跳到下一循环。
      ```java
      public class Test
      {
        public static void main(String[] args)
        {
          for(int i=0;i<10;i++)
          {
            if(i == 5)
            {
              break;
            }
            System.out.println("i="+i);//输出结果：0 1 2 3 4
          }
          System.out.println("************");
          for(int i=0;i<10;i++)
          {
            if(i == 5)
            {
              continue;
            }
            System.out.println("i="+i);//输出结果：0 1 2 3 4 6 7 8 9
          }
          System.out.println("--------------");
        }
      }
      ``` 
      * 继续学习 <a href="https://www.bilibili.com/video/av11361088?p=80">点这p80</a>
      * 求素数
      ```java
       public class Test//求1-100之间的素数，每八个换行
      {
            public static void main(String[] args)
            {
                  int count=0;
                for(int i=2;i<=100;i++){
                boolean IsSuShu = true;
                for (int j = 2;j < i;j++)
                {
                      if(i % j == 0)
                      {
                            IsSuShu = false;
                            break;
                      }
                }
                if(IsSuShu)
                {
                      count++;
                      System.out.print(i+" ");
                      if(count%8==0)
                      {System.out.println();}
                }
                //System.out.println(IsSuShu ? i + "不是素数":i + "是素数");
            }
            }
      }
      ```
************
### **5、方法初步**
* 课程链接 <a href="https://www.bilibili.com/video/av11361088?p=80">点这p80</a>
  * C语言中叫“函数/function”。
  * 在java中应该有这样一种机制：
    * 某个功能代码只需要写一遍；
    * 要使用这个功能，只需要给这个功能传递具体的数据；
    * 这个功能完成之后返回一个最终的结果；
    * 这样代码就可以重复利用，提高代码的复用性。【这就是“方法”】
    * 使用这个方法称为“调用/invoke”。
  * 方法定义在类体当中，在一个类中可以定义多个方法，方法编写的位置没有先后顺序。方法体中不能再定义方法。
* **方法的基础语法**
  * 方法怎么定义，语法结构：
  ```
  {修饰符列表} 返回值类型 方法名（形式参数列表）
  {
    方法体；
  } 
  ```
    * 关于修饰符列表
      * 可选项，不是必须的，目前统一写为：public static
      * 方法的修饰符列表当中有static关键字的话，怎么调用这个方法呢？
        * `类名.方法名(实际参数列表);`
    * 返回值类型
      * 一个方法是可以完成某个特定功能的，这个功能结束之后大多数都是需要返回最终执行结果的，执行结果可能是一个具体存在的数据。而这个具体存在的数据就是返回值。数据一定会有类型。此处需要指定的是返回值具体的类型。返回值可以指定Java当中的*任意类型*。
      * 也可能这个方法执行结束之后不反悔任何数据，java中规定，当一个方法执行结束之后不妨会任何数据的话，返回值类型位置必须编写：void关键字。
      * 返回值若不是void，表示这个方法执行结束之后必须返回一个具体的数值。当方法执行结束的时候没有返回任何数据的话编译器报错。使用“return 值；”返回，并且要求“值”的数据类型必须和“方法的返回值类型”一致，不然编译器报错。
      * 返回值类型是void的时候，在方法体中不能编写“return 值；”这样的语句。但是可以编写“return；”这样的语句。
      * 只要带有return关键字的语句执行，return语句所在的方法结束。
    * 方法名：
      * 只要是合法的标识符就行；
      * 最好见名知意；
      * 首字母小写，后面每个单词首字母大写；
      * 最好是动词。
    * 形式参数列表/形参
      * 形参是局部变量（有数据类型）  int a；
      * 形参的个数可以是0~n个；
      * 多个形参之间用“逗号”隔开；
      * 形参起决定性作用的是形参的数据类型，形参的名字就是局部变量的名字。方法在调用的时候，实际给这个方法传递的真实数据被称为：实际参数，简称实参。
      * 实参与形参必须满足：数量相同；类型相同。例如：
      ```java
                    //方法定义
                    public static int sum(int a,int b){}
                    //方法调用
                    sum("avb","df");//编译报错
                    sum(123,20);//123 20是实参列表
      ```
      <a href="https://www.bilibili.com/video/av11361088?p=83">继续学习 p83</a>
    * 方法体必须由大括号括起来，方法体中的代码有顺序，遵循自上而下的顺序依次执行。并且方法体由Java语句构成，每一个Java语句以“；”结尾。
    * 方法怎么调用？
      * 方法只定义不去调用时是不会执行的，只有在调用的时候才会执行。
      * 语法规则：【方法的修饰符列表中有static】
      ```java
      类名.方法名(实参列表);//这是一条Java语句，表示调用某个类的某个方法，传递这样的实参。
      ``` 
    * 方法的修饰符列表中有static关键字时：
    ```java
    public class Test
    {
      //方法初步
      public static void main(String[] args)
       {
             java.util.Scanner S = new java.util.Scanner(System.in);
             System.out.print("Please input a number:");
             int a = S.nextInt();
             System.out.print("Please input a number:");
             int b = S.nextInt();
             System.out.println("The sum is:"+Test.sumInt(a,b));
             printStr1();//当调用程序与方法处于一个类时，“类名.”即"Test."可以不写
             otherClass.printStr2();//当调用程序与方法不处于一个类时，“类名.”即"Test."必须写
       }
       public static int sumInt(int a,int b) {
             int c=a+b;
            return c;
       }
       public static void printStr1()
       {
             System.out.println("Hello class1");
       }
    }
    //一般不建议在一个Java文件里面写多个class，此处为方便多写。
    class otherClass
    {
          public static void printStr2()
          {
                System.out.println("Hello Class2");
          }
    }
    ``` 
    * 深入return语句
      * 带有return关键字的Java与酒只要执行，所在的方法执行结束；
      * 在*同一个作用域*当中，return语句下面不能编写任何代码，因为这些代码永远执行不到。
      ```java
        public class Test{//深入return语句
        public static void main(String[] args) {
              java.util.Scanner B = new java.util.Scanner(System.in);
              int a =B.nextInt();
              int b =B.nextInt();
              int c=Test.divide(a, b);
              if(c == 1){
                    System.out.println(a+">"+b);
              }
              else {
                    System.out.println(a+"<"+b);
              }
        }
        //以下程序可以保证“return 1;”或“return 0;”执行，编译通过。
        public static int divide(int a,int b) {
              if(a/b > 0){
                    return 1;
                    //System.out.println("Hello");//此处报错，因为在同一个作用域中，return下面的语句不执行。
              }
              //此处可加else，也可以不加else，因为如果上面的return执行了的话，整个方法结束，不会执行下面的return。如果上面的return不执行，直接执行下面的return。
              System.out.println("Hello");//此处可行，因为在这个作用域中，该语句不处于return语句的下面。
                    return 0;
                    //以上代码可写为：return a/b > 0 ? 1 : 0;
        }
      }
      ``` 
    * 在返回值类型是void的方法当中使用“return;”语句。
    ```java
    public class Test{//在返回值类型是void的方法当中使用“return;”语句。
      public static void main(String[] args) {
            Test.returnTest();
      }
      public static void returnTest() {
            for(int i=0;i<10;i++){
                  if(i == 5){
                        return;//不是终止for循环，终止的是returnTest()方法
                        //break;//终止的是for循环
                  }
                  System.out.println("i-->"+i);
            }
            System.out.println("returnTest");
      }
    }
    ``` 
    * 当方法在执行过程中，在JVM中的内存是如何分配，内存是如何变化的？
      * 方法只定义不调用，是不会执行的，并且也不会给该方法分配运行所属的内存空间。只有在调用这个方法时，才会动态的给这个方法分配所属的内存空间。
      * 在JVM内存划分上有这样三块主要的内存空间：方法区内存、堆内存、栈内存
      * 关于“栈”数据结构：
        * 栈：stack，是一种数据结构；
        * 数据结构反映的是数据的存储形态；
        * 作为程序员需要提前精通：数据结构+算法；
        * 常见的数据结构：数组、队列、栈、链表、二叉树、哈希表/散列表...
        * 栈
          1. 栈帧永远指向栈顶元素；
          2. 栈顶元素处于活跃状态，其他元素静止；
          3. 术语：{压栈/入栈/push}、{弹栈/出栈/pop}；
          4. 栈数据结构存储数据的特点是：先进后出/后进先出。 
      * 方法代码怕片段存在哪里？方法执行的时候执行过程的内存在哪里分配？
        * 方法代码片段属于.class文件的一部分，字节码文件在类加载的时候，将其放到了方法区当中，所以JVM中的三块主要的内存空间中方法区内存最先有数据，存放了代码片段。
        * 代码片段虽然在方法区当中只有一份，但是可以重复调用。每一次调用这个方法的时候，需要给该方法分配独立的活动场所，在栈内存中分配。【栈内存中分配方法运行所属内存空间】
        * 方法在调用的瞬间，会费该方法分配内存空间，会在栈中发生压栈动作，方法执行结束之后，给该方法分配的内存空间全部释放，此时发生弹栈动作。
          * 压栈：给方法分配内存；
          * 弹栈：释放该方法的内存空间。
        * 局部变量在“方法体”中声明，局部变量运行阶段内存在栈中分配。
        * 继续学习 <a href="https://www.bilibili.com/video/av11361088?p=93">点这p93</a>
        * 重点：方法在调用的时候，在参数传递的时候，实际上传递的是变量中保存的那个“值”传过去了。
      * 方法的重载机制/overload
        * sumInt,sumLong,sumDouble方法虽然功能不同，但是功能是相似的，都是求和。在以下程序当中功能相似的方法，分别起了三个不同的名字，这对于程序员来说，调用犯法的时候不方便，程序员需要记忆更多的方法，才能完成调用。
        ```java
        public class Test{
        public static void main(String[] args){
          int result1 = sumInt(1,2);
          System.out.println(result1);
          double result2 = sumDouble(1.0,2.0);
          System.out.println(result2);
          long result3 = sumLong(1L,2L);
          System.out.println(result3);
        }
        public static int sumInt(int a,int b){
          return a+b;
        }
        public static double sumDouble(Double a,double b){
          return a+b;
        }
        public static long sumLong(long a,long b){
          return a+b;
        }
        }
        ``` 
        * 什么时候考虑使用方法重载？
          * 功能相似的时候，尽可能让方法名相同。但是，功能不同或不相似的时候，尽可能让方法名不同。
        * 什么条件满足之后构成了方法重载？
          * 在同一个类中；
          * 方法名不同；
          * 参数列表不同：数量不同、顺序不同、类型不同。
        * 方法重载和什么有关系，和什么没有关系？
          * 方法重载和方法名+参数列表有关系；
          * 方法重载和返回值类型无关、和修饰符列表无关。
          * 例：以下程序报错。
          ```java
          public class Test{
            public static void main(String[] args){

            }
            public static void m(){

            }
            public static int m(){
              return 1;
            }
          }
          ``` 
          * 使用自定义方法代替System.out.println();
          ```java
          public class Test{
            public static void main(String[] args){
            //使用自定义方法代替System.out.println();
            M.p("Hello world");
             }
          }
          ``` 
      * 方法的递归调用
        * 方法自身调用自身叫做递归调用；
        * 递归算法非常耗费栈内存，能不用尽量不用。
        * 递归必须有结束条件，没有结束体哦阿健一定会发生栈内存溢出错误。
        * 即使有了结束条件，且结束条件是正确的，也有可能发生栈内存溢出错误，因为递归得太深了。
        * 例：
      ```java
      public class RecursionTest{
        public static void main(String[] args){
          doSome();
        }
        public static void doSome(){
          System.out.println("Begin");
          doSome();
          System.out.println("Over");
        }
      }
      ``` 
      * 使用递归计算1~N的和（阶乘同理）
      ```java
      public class Test{
        public static void main(String[] args){
          int n = 4;
          int returnValue = sum(n);
          System.out.println(returnValue);
        }
        public static int sum(int n){
          if(n == 1){
            return 1;
          }
          return n + sum(n-1);
        }
      }
      ``` 
**********
## **3、JAVA 课程(第三章 面向对象【Java语言的核心机制，最重要的内容】)**
课程链接 <a href="https://www.bilibili.com/video/av11361088?p=108">点这p108</a>
### **1、面向对象与面向过程**
* 区别
  * 面向过程 --> 关注因果关系。
  * 面向对象 --> 关注独立的个体【对象】能完成哪些功能。
* 面向对象的三大特征
  * 封装
  * 继承
  * 多态
  * 所有面向对象的编程语言都有这三大特征。
  * 采用面向对象的方式开发一个软件，生命周期中：【整个生命周期中贯穿使用 oo 面向对象方式】
    * 面向对象的分析：OOA
    * 面向对象的设计：OOD
    * 面向对象的编程：OOP
  * 类和对象的概念
    * 什么是类？
      * 类在现实世界中不存在，是一个模板，是一个概念，是人类大脑思考抽象的结果；
      * 类代表了一类事物；
      * 在现实世界中，对象A与对象B之间具有共同特征，进行抽象总结出的一个模板，这个模板被称为类；
      * 类有属性和方法。
    * 什么是对象？
      * 对象又被称为实例/instance
      * 对象是实际存在的个体，现实世界当中实际存在。
    * 类到对象的过程：实例化
    * 对象到类的过程：抽象
  * 类的定义
    * 语法结构：
    ```java
    [修饰符列表] class 类名{

    }
    ``` 
    * Java语言中所有的class都属于引用数据类型。
  * 对象的创建与使用：
    * 通过一个类可以实例化多个对象。
    * 实例化对象的语法：`new 类名();`
    * new是Java语言当中的一个运算符；
    * new运算符的作用是创建对象，在JVM堆内存中开辟新的内存空间；
    * 方法区内存：在类加载的时候，class字节码代码片段被加载到该内存空间当中。
    * 栈内存（局部变量）：方法代码片段执行的时候，会给该方法分配内存空间，在栈内存中压栈。
    * 堆内存：new的对象在堆内存中存储。
    * 什么是对象？
      * new运算符在堆内存中开辟的内存空间称为对象。
    * 什么是引用？
      * 引用是一个变量，只不过这个变量中保存了另一个java对象的地址。
      * 以下代码中`new student()`为对象，`S`为引用。
      ```java
      public class student{
        int sno;
        String sname;
          student S =new atudent();
      }
      ```
      * Java语言中，程序员不能直接操作堆内存，Java中没有指针，不像C语言。
      * Java语言当中，程序员只能通过“引用”区访问堆内存当中对象内部的实例变量。 
      * 访问实例变量的语法格式为：
      ```java
      //读取数据：引用.变量名
      int stuNo = S.sno;
      System.out.println(stuNO);
      //修改数据：引用.变量名 = 值
      S.no = 123;
      S.name = Jack;
      ``` 
    * 关于JVM中主要的三大内存空间
      1. JVM主要包括栈内存、堆内存、方法区内存等三大内存空间。
      2. 堆内存和方法区内存只有一个，栈内存与线程数相同。
      3. 方法调用的时候，该方法所需要的内存空间在栈内存中分分配，称为压栈，方法执行结束之后，该方法所属的内存空间释放，称为弹栈。
      4. 栈中主要存储的是方法体中的局部变量。
      5. 方法的代码片段以及整个类的代码片段都被存储到方法去内存中，在类加载时这些代码会载入。
      6. 在程序之心发的过程中使用new运算符创建的java对象，存储在堆内存中，对象颞部有实例变量，所以实例变量存储在堆内存中。
      7. 变量分类：
         1. 局部变量【方法体中声明】
         2. 成员变量【方法体外声明】
            1. 实例变量【前边修饰符没有static】
            2. 静态变量【前边修饰符中有static】
      8. 静态变量存储子啊方法区内存中。
      9. 三块内存中变化量最频繁的是栈内存，最先有数据的是方法去内存，垃圾回收器主要针对的是堆内存。
      10. 垃圾回收器【自动垃圾回收机制、GC机制】什么时候会考虑将某个Java对象的内存回收呢？
          1.  当堆内存当中的Java对象成为垃圾的时候，会被垃圾回收器回收。
          2.  当没有更多的引用指向该对象时，这个对象就会变成垃圾。此时，这个对象无法被访问，因为访问对象只能通过引用的方式进行访问。 
  * 继续学习 <a href="https://www.bilibili.com/video/av11361088?p=119">点这P119</a>
  * 关于eclipse
    * 设置字体：
      * window/preferences/font/colors and fonts/basic/text font
    * 常用快捷键
      * ctrl d：删除一行
      * alt /：自动补全
      * ctrl 1：纠错
      * ctrl shift f：快速格式化
### **2、面向对象的封装性**
* 
    * 为什么要封装？封装有什么好处？
      1. 封装之后，对于那个事物来说，看不到这个事物比较复杂的那一面，只能看到该事物简单的一面。复杂性封装，对于提供简单的操作入口。照相机就是一个很好的封装的案例，照相机的实现原理非常复杂，但是对于使用照相机的人来说操作起来时非常方便的。
      2. 封装之后才会形成真正的“对象”，真正的“独立体”。
      3. 封装就意味着以后的程序可以重复使用，并且这个事物应该适应性比较强，在任何场合都可以使用。
      4. 封装之后，对于事物本身，提高了安全性。
      5. 需要记住：
        * setter 和 getter方法没有static关键字
        * 有static关键字修饰的方法怎么调用：`类名.方法名(实参);`
        * 没有static关键字修饰的方法怎么调用：`引用.方法名(实参);`
      
      ```java
      /*
      封装的步骤：
      1.所有属性私有制，使用private关键字进行修饰，private表示私有的，修饰的所有数据只能在本类中访问。
      2.对外部提供简单的操作入口，也就是睡哦以后外部程序想访问age属性，必须通过这些简单的入口进行访问。对外提供两个公开的方法：set/get
        通常访问属性有两种方式：
         1.读取属性的值，读取 get
         2.修改属性的值，修改 set
         set方法的命名规范：
          public void set SetAge(int a){
            age = a;
          }
         get方法的命名规范：
          public int GetAge(){
            return age;
          }
      */
      public class User{
        //属性私有化
        private int age;
      
      public void setAge(int a){
        //编写业务逻辑代码进行安全控制
        if(a < 0 || a > 150){
          System.out.println("对不起，您输入的年龄不合法！");
          return;
        }
        //程序可以执行到这里的话，说明a是合法的,则进行赋值运算
        age = a;
      }
      public int getAge(){
        return age;
      }
      }
      ``` 
      * 访问
      ```java
      public class UserTest{
        public static void main(String[] args){
          User user = new User;
          //编译报错，age属性私有化，在外部程序中不能直接被访问
          //System.out.println(User.age);
          user.setAge(-100);
          System.out.println(getAge());
        }
      }
      ``` 
      * 快速封装：
        * 右键.java文件-->sourse-->generate getter and setter...
******** 
### **3、构造函数**
* 
    * 构造方法又被称为构造函数/构造器/Constructor
    * 构造方法语法结构：
    ```java
    [修饰符列表] 构造函数名 (形式参数列表){
      构造方法体；
    }
    ``` 
    * 对于构造方法来说，返回值类型不需要指定，不能指定。只要写上，就会变为普通方法。
    * 对于构造方法来说，构造方法的方法名必须与类名保持一致。
    * 构造方法的作用：
      1. 构造存在的意义是，通过构造方法的调用，可以创建对象。 
      2. 
    * 构造方法应该怎么用？
      1. 普通方法是这样调用的，方法修饰符中有static时：`类名.方法名(实参列表)`方法修饰符中没有static时 `引用.方法名(实参列表)` 
      2. 构造方法：`new 构造方法名(实参列表)`
    * 每一个构造方法调用之后都有返回值，但是这个“return 值;”这样的语句不需要写,构造方法结束之后，Java自动返回值。并且放回置类型时构造函数所在类的类型。例如下面构造方法的返回值为"User"。<br>    `User user = new User`
    * 当一个类中没有定义任何构造方法的话，系统默认给该类提供一个无参数的构造方法，这个构造方法被称为缺省构造器。
    * 当一个类显示的将构造方法定义出来了，那么系统就不再默认为这个类提供缺省构造器。建议开发中手动的为当前类提供无参数的构造方法。
    * 构造方法支持方法重载机制。
    ```java
    public class User{
      public User(){

      }
      public User(int i){
        System.out.println("带有int类型的构造器");
      }
    }
    ``` 
    * 构造方法的另一个作用：
      * 创建对象的同时，初始化实例变量的内存空间。
      ```java
      public 
      ``` 
      * 继续学习 <a href="https://www.bilibili.com/video/av11361088?p=133">点这P133</a>
### **4、对象和引用**
* 对象和引用的概念：
  * 对象：目前在使用new运算符在堆内存中开辟的内存空间称为对象。
  * 引用：是一个变量，不一定是局部变量，还可能是成员变量。引用保存了内存地址，指向了堆内存当中的对象，
  * 所有访问实例相关的数据，都需要通过“引用.”的方式访问，因为只有通过引用才能找到对象。
  * 只有一个空的引用，访问对象的实例相关的数据会出现空指针异常。
### **5、参数的传递**
*  java中参数的传递只传递值。
### **6、this关键字**
* this是一个关键字，翻译为：这个。
* this是一个引用，this是一个变量，this变量中保存了内存地址指向了自身。this存储在JVM堆内存Java对象内部。
* this在多数情况下都是可以不写的。
* 创建100个对象，每一个对象都有this，也就是说有100个不同的this。
* this可以出现在“实例方法”当中，this指向当前正在执行这个动作的对象。（this代表当前对象）
* this不能使用在带有static的方法中。
  ```java
  public class CustomerTest {

    public static void main(String[] args) {
      Customer c1 = new Customer();
        c1.name = "张三";
        c1.shopping();
      Customer c2 = new Customer();
      c1.name = "李四";
      c1.shopping();
    }
  }

    class Customer {
    String name;

    public Customer() {
      
    }
    //不带有static的一个方法
    //顾客购物
    //所以购物这个行为属于对象级别的行为
    //由于每一个对象在执行购物这个动作的时候最终结果不同，所以购物这个动作必须有“对象”的参与。
    //重点：没有static关键字的方法称为“实例方法”
    //没有static关键字的变量被称为“实例变量”
    //注意：当一个行为/动作执行的过程中是需要对象参与的，那么这个方法一定要定义为“实例方法”，不需要static关键字
    public void shopping() {

      System.out.println(this.name+"在购物！");
      //以上代码同 System.out.println(name+"在购物！");
    }
    //带有static
  public static void doSome(){
    //这个执行过程中没有“当前对象”，因为带有static的方法是通过类名的方式访问的
    //或者说这个“上下文”当中没有“当前对象”，自然不存在this（this代表的是当前正在执行这个动作的对象）
    //System.out.println(name);
  }
  }
  ``` 
  * 带有static和不带有static的方法调用方式:
  ```java
  public class Test{//带有static和不带有static的方法调用方式
    public static void main(String[] args) {
      doSome();
      Test T = new Test();
      T.doOther();
    }
    public static void doSome() {
      System.out.println("do some");
    }
    public void doOther() {
      System.out.println("do other");
    }
  }
  ``` 
  * 重复看 <a href="https://www.bilibili.com/video/av11361088?p=141">点这p141</a>
  * this可以用在：
    * 实例方法中，代表当前对象【语法格式：this.】
    * 构造方法中，通过当前的构造方法调用其他的构造方法【语法格式：this(实参);】这种语法只能出现在构造方法第一行。
  * **重点：带有static和不带static方法调用的区别**
  ```java
    public class Test {
    public static void method1() {

      System.out.println("method1");
    }

    public void method2() {

      System.out.println("method2");
    }

    public static void main(String[] args) {//带有static，不能使用this
      method1();//method1带有static，使用“类名.方法名”的方式调用
      Test t1 = new Test();
      t1.method2();//method2不带static，是实例方法，需要创建对象调用
      t1.doSome();//doSome不带static，是实例方法，需要创建对象调用
    }
    public void doSome() {//不带static，可以使用this
      Test.method1();//method1带有static，使用“类名.方法名”的方式调用
      this.method2();//使用this调用
    }
  }
  ``` 
**********
### **7、static关键字**
  ```java
  public class CHineseTest {

    public static void main(String[] args) {
      Chinese person1 = new Chinese("522127199810120014", "小明");
        System.out.println(person1.id);
        System.out.println(person1.name);
        System.out.println(Chinese.country);
      Chinese person2 = new Chinese("978678566767656543", "小华");
        System.out.println(person2.id);
        System.out.println(person2.name);
        System.out.println(Chinese.country);
    }

  }
  class Chinese {
    String id;
    String name;
    //国籍：所有锅鸡一样，这种特性属于类级别的特征，可以提升为整个模板的特征，可以在变量前添加static关键字修饰。
    //静态变量，静态变量在类加载的时候初始化，不需要创建对象，内存就开辟了，静态变量存储在方法区内存中。
    static String country = "中国";
    public Chinese() {
      
    }
    public Chinese(String Id,String Name) {
      this.id = Id;
      this.name = Name;
    }
  }
  ```
  * 所有对象都有这个属性，但是这个属性的值会随着对象的变化而变化【不同对象的这个属性具体的值不同】，定义为实例变量。
  * 所有对象都有这个属性，并且所有对象的这个属性的值是一样的，建议定义为静态变量，节省内存开销。
  * 可以使用static关键字来定义“静态代码块”
    * 语法格式：
    ```java
    static{
      java语句;
    } 
    ```
    * 静态代码块在类加载时执行，并且只执行一次。
    * 静态代码块在一个类中可以编写多个，遵循自上而下的执行过程；
    * 通常静态代码块当中完成预备工作，先完成数据的准备工作，例如：初始化连接池，解析XML配置文件...
    ```java
    public class Test{
      static{
        System.out.println("类加载1");
        System.out.println("类加载2");
      }
      static{
        System.out.println("类加载3");
        System.out.println("类加载4");
      }
      public static void mian(String[] args){

      }
    } 
    ```
    * 静态代码块的作用？
      * 记录类加载的日志；
      * 是Java为程序员准备的一个特殊的时刻，这个特殊的时刻称为类加载时刻。若希望在此时可执行一段特殊的程序，这段程序可以直接放到静态代码块当中。
    * 实例代码块（使用得非常少）:
    ```java
    public class Test{
      {
        System.out.println(1);
      }
      {
        System.out.println(1);
      }
      {
        System.out.println(1);
      }
      public static void main(String[] args){
          new Test();
      }
    } 
    ```
      * 实例代码块在构造方法执行之前执行，构造方法执行一次，实例代码块执行一次。
      * 实例代码块也是Java语言为程序员准备得一个特殊的时机，这个特殊时机被称为：对象初始化时机。
  * 方法什么时候定义为静态的？
    * 方法描述的是动作，当所有的对象执行这个动作的时候，最终产生影响是一样的，那么这个动作已经不再属于摩尔一个对象动作了，可以将这个动作提升为类级别的动作，模板级别的动作。
    * 静态变量中无法直接访问实例方法和实例变量。
    * 继续学习 <a href="https://www.bilibili.com/video/av11361088?p=148">点这P148</a>
    * 大多数方法都定义为实例方法，一般一个行为或者一个动作在发生的时候，都需要对象的参与。但是也有例外，例如：大多数的“工具类”中的方法都是静态方法，因为工具类就是方便编程，为了方便方法的调用，自然不需要new对象是最好的。
### **8、继承**
* 继承是面向对象三大特征之一（封装、继承、多态）
* 继承的基本作用是：代码复用。继承最重要的作用是：有了继承才有了以后方法的“覆盖”和“多态”机制。
* 语法格式：
  ```java
    [修饰符列表] calss 类名 extends 父类名{
      类体 = 属性 + 方法
    }
  ```
* java语言中的继承只支持单继承，一个类不能同时继承很多类，只能继承一个类，在C++中支持多继承。
* 关于继承中的一些术语：
  * B类继承A类，其中：
    * A类称为：符类、积累、超类、superclass
    * B类称为：子类，派生类、subclass
* 在Java语言当中，子类继承父类都继承哪些数据？
  * 私有的不支持继承；
  * 构造方法不支持继承；
  * 其他的都支持继承。
* 虽然Java语言当中只支持单继承，但是一个类也可以间接继承其他类，例如：
  ```java
   C extends B{
   }
   B extends A{
   }
   A extends T{
   }
   //C直接继承B类，但是C类间接继承T A B类。
  ```
* java语言中假设没有显示的继承任何类，该类默认继承javaSE库当中提供的java.lang.Object类。 Java语言中任何一个类中都有Object类的特征。
### **9、方法的覆盖**
* 回顾方法重载：
  1. 方法重载又称为overload；
  2. 方法重载在什么时候使用？
     * 当在同一个类当中，方法完成的功能是相似的，建议方法名相同，这样方便程序员的编程，就i想在调用一个方法一样，代码美观。
  3. 什么tia偶见满足之后构成方法重载？
     1. 在同一个类中；
     2. 方法名相同；
     3. 参数名不同：类型、顺序、个数
  4. 方法和什么无关？
     1. 和方法的返回值类型无关
     2. 和方法的修饰符列表无关  
* 方法覆盖
  1. 方法覆盖又被称为方法重写：override  
  2. 什么时候使用方法重写？
     * 当父类中的方法无法满足当前子类的业务需求，子类有必要将父类中继承过来的方法进行重新编写，这个编写过程称为方法重写/方法覆盖。
  3. 什么条件满足之后发生方法重写？
     1. 方法重写发生在具有继承甚得父子类之间；
     2. 方法重写的时候返回值相同，方法名相同，形参列表相同；
     3. 方法重写的时候访问权限不能更低，只能更高；
     4. 方法重写的时候抛出异常不能更多，可以更少
  4. 建议方法重写的时候尽量复制粘贴，以免写错，导致没有产生覆盖。（eclipse有工具可以生成）
  5. 注意：私有方法和构造方法不能继承，所以不能覆盖。静态方法不存在覆盖（讲多态时解释）。覆盖只针对方法，不谈属性。
  ```java
  public class Test{
  public static void main(String[] args){
    Animal animal = new Animal();
    animal.move();
    Cat cat = new Cat();
    cat.move();
    Bird bird = new Bird();
    bird.move();
  }
  }

  class Animal{
    public void move(){
    System.out.println("动物在移动");
  }
  }

  class Cat extends Animal{//继承，没有方法重写

  }

  class Bird extends Animal{
    public void move(){//方法重写
    System.out.println("鸟在飞");
  }
  }
  ```
  
### **10、多态**
* 上述代码中，Cat继承Animal，Bird继承Animal，Cat和Bird没有任何继承关系。
* 面向对象三大特征：封装、继承、多态
* 关于多态中涉及到的几个概念：
  1. 向上转型（upcasting）“子”转“父”：又被称为自动类型转换
  2. 向下转型（downcasting）“父”转“子” ：又被称为强制类型转换。（需要加强制类型转换符）
     * 需要记住：无论是向上转型还是向下转型，两种类型之间必须要有继承关系。没有继承关系，程序是无法编译通过的。
* 举例：
```java
public class Test {//多态
  public static void main(String[] args) {

    /*
    1.Animal和Cat之间存在继承关系，Animal是父类，Cat是子类
    2.Cat is Animal
    3.new Cat()创建的对象的类型是Cat，animal2这个引用的数据类型是Animal，可见他们进行了类型转换
    4.子类转换成父类型，称为向上转换/upcastint，或者称为自动类型转换。
    5.Java中允许这种语法：父类型引用指向子类型对象。
    */

    Animal animal2 = new Bird();
    
    /*
    1. Java程序永远分为编译阶段和运行阶段。
    2. 先分析编译阶段，再分析运行阶段，编译无法通过，根本无法运行。
    3. 编译阶段编译器检查animal2这个引用的数据类型为Animal，由于Animal.class字节码当中有move()方法，所以编译通过了，这个过程称为静态绑定，编译阶段绑定，只有静态绑定成功之后才有后面的进行。
    4. 在程序运行阶段，JVM内存中真实创建的对象是Bird对象，那么以下程序在运行阶段一定会调用Cat对象的move()方法，此时发生了程序的动态绑定，运行阶段绑定。
    5. 无论Bird类有没有重写方法，运行阶段一定调用的是Bird对象的move方法，因为底层真实对象就是Bird对象。
    6. 父类型引用指向子类型对象这种机制导致程序存在编译阶段绑定和运行阶段绑定两种不同的形态/状态，这种机制可以称为一种多态语法机制。
    */
    
    animal2.move();//鸟在飞
    //animal2.eat();//报错
  }
}

class Animal {
  public void move() {
    System.out.println("动物在移动");
  }
}

class Cat extends Animal {

}

class Bird extends Animal {
  public void move() {
    System.out.println("鸟在飞");
  }
  public void eat(){
    System.out.println("鸟吃虫子");
  }
}
```
* 继续学习<a href="https://www.bilibili.com/video/av11361088?p=153">点这P153</a> 