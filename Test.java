//import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

// public class Test{
// 	public static void main(String[] args) {
//             int grade=10;
//             System.out.print("该考生的成绩为：");
//             if(grade < 0 || grade > 100)
//             {
//                   System.out.print("您输入的成绩有误！");
//             }
//             else if(grade >= 90)
//             {
//                   System.out.print("A");
//             }
//             else if(grade >= 80)
//             {
//                   System.out.println("B");
//             }
//             else if(grade >= 70)
//             {
//                   System.out.println("C");
//             }
//             else if(grade >= 60)
//             {
//                   System.out.println("D");
//             }
//             else
//             {
//                   System.out.println("E");
//             }

// 		}
// 	}
// public class Test{
//       public static void main(String[] args){
//            //创建键盘扫描器对象
//         java.util.Scanner S = new java.util.Scanner(System.in);
//         String UserInput = S.next();//接收字符串
//         System.out.println(UserInput);
//         int num = S.nextInt();//接收整数
//         System.out.println(num);
//         double dnum =S.nextDouble();//接收浮点数
//         System.out.println(dnum);
//       }
// }
// public class Test
// {
//       public static void main(String[] args){
//             System.out.print("请输入年龄：");
//             java.util.Scanner B = new java.util.Scanner(System.in);
//             int age = B.nextInt();
//             String str ="年龄";
//             if(age < 0 || age > 150){
//                 str =  "您输入的年龄有误！";
//             }
//             else if(age >= 60){
//                   str = "该年龄处于老年阶段。";
//             }
//             else if(age > 40){
//                   str = "该年龄处于中年阶段。";
//             }
//             else{
//                   str = "该年龄处于青年阶段。";
//             }
//             System.out.println(str);
//       }
// }

// public class Test
// {
//       public static void main(String[] args){
//             System.out.print("请输入现在室外的情况（下雨-->1/晴天-->0）以及您的性别（男-->1/女-->0：）：");
//             java.util.Scanner S = new java.util.Scanner(System.in);
//            int WeatherLike = S.nextInt();
//            int Sex = S.nextInt();
//            if (WeatherLike == 1){
//                   if (Sex == 1){
//                         System.out.println("黑伞适合你。");
//                   }
//                   else if (Sex == 0){
//                         System.out.println("花伞更配您。");
//                   }
//                   else {
//                         System.out.println("您的性别有问题吗？");
//                   }
//             }
//             else {
//                   System.out.print("请判断现在的温度：");
//                   double WeatherNum = S.nextDouble();
//                   if(WeatherNum >= 30){
//                         if (Sex == 1)
//                         System.out.println("带上眼镜吧，帅哥");
//                         else if(Sex == 0) {
//                               System.out.println("涂上防晒霜哦");
//                         }
//                         else {
//                               System.out.println("您的性别有问题吗？");
//                         }
//                   }
//                   else {System.out.println("放心出门吧");}
//             }
//       }
// }

// public class Test
// {
//       public static void main(String[] args){
//             System.out.print("请输入数字：");
//             java.util.Scanner B = new java.util.Scanner(System.in);
//             int Num = B.nextInt();
//             if(Num >1 && Num <7){
//             switch(Num){
//                   case 1:
//                   System.out.println("星期一");
//                   break;
//                   case 2:
//                   System.out.println("星期二");
//                   break;
//                   case 3:
//                   System.out.println("星期三");
//                   break;
//                   case 4:
//                   System.out.println("星期四");
//                   break;
//                   case 5:
//                   System.out.println("星期五");
//                   break;
//                   case 6:
//                   System.out.println("星期六");
//                   break;
//                   default:
//                   System.out.println("星期日");
//                   break;
//             }
//       }
//       else {System.out.println("输入有误，请输入1-7之间的数字。");}
//      }

// }

// public class Test
// {
//       public static void main(String[] args){
//             System.out.println("***使用本系统实现简单的运算***");
//             java.util.Scanner B = new java.util.Scanner(System.in);
//             System.out.print("请输入第一个数字：");
//             int Num1 = B.nextInt();
//             System.out.print("请输入所需的运算符（+ - * / %）：");
//             String operator = B.next();
//             System.out.print("请输入第二个数字：");
//             int Num2 = B.nextInt();
//             switch(operator){
//                   case "+":
//                   System.out.print(Num1+"+"+Num2+"="+ (Num1 + Num2));
//                   break;
//                   case "-":
//                   System.out.print(Num1+"-"+Num2+"="+ (Num1 - Num2));
//                   break;
//                   case "*":
//                   System.out.print(Num1+"*"+Num2+"="+ (Num1 * Num2));
//                   break;
//                   case "/":
//                   if(Num2 != 0)
//                   System.out.print(Num1+"/"+Num2+"="+ (Num1 / Num2));
//                   else System.out.println("Sorry, your input is incorrect!");
//                   break;
//                   case "%":
//                   if(Num2 != 0)
//                   System.out.print(Num1 + "%" + Num2 + "=" + (Num1 % Num2));
//                   else System.out.println("Sorry, your input is incorrect!");
//                   break;
//                   default:
//                   System.out.println("Sorry, your input is incorrect!");
//                   break;
//             }
//       }
// }

// public class Test{
//       public static void main(String[] args){
//             int i;
//         for(i=1;i <= 10;i++)
//         {
//         System.out.println(i);
//       }
//        System.out.println(i);
//       }
// }

// public class Test{
//       public static void main(String[] args)
//       {
//             int i=1;
//             int Sum = 0;
//             for(;i<=100;i++){
//                   if(i % 2 != 0){
//                         Sum += i;
//                   }
//             }
//             System.out.println(Sum);
//       }
// }

// public class Test
// {
//       public static void main(String[] args)
//       {
//             for(int i = 1;i <= 10;i++)
//             {
//                   for(int j=1;j<3;j++)
//                   {
//                         System.out.println(j);
//                   }
//             }
//       }
// }

// public class Test //九九乘法表
// {
//       public static void main(String[] args)
//       {
//             for(int i=1;i<10;i++)
//             {
//                   for(int j=1;j<=i;j++)
//                   {
//                         System.out.print(j+"*"+i+"="+(i*j)+" ");
//                         if(i==j)
//                         {
//                               System.out.print("\n");
//                         }
//                   }
//             }
//       }
// }

// public class Test//求1-100之间的素数，每八个换行
// {
//       public static void main(String[] args)
//       {
//             int count=0;
//            for(int i=2;i<=100;i++){
//            boolean IsSuShu = true;
//            for (int j = 2;j < i;j++)
//            {
//                  if(i % j == 0)
//                  {
//                        IsSuShu = false;
//                        break;
//                  }
//            }
//            if(IsSuShu)
//            {
//                  count++;
//                  System.out.print(i+" ");
//                  if(count%8==0)
//                  {System.out.println();}
//            }
//            //System.out.println(IsSuShu ? i + "不是素数":i + "是素数");
//       }
//       }
// }

// public class Test
//   {
//     public static void main(String[] args)
//     {
//       int i=1;
//       while(i<=10)
//       {
//         System.out.println(i);
//         i++;
//       }
//     }
//   }

// public class Test//以for循环为例
//       {
//         public static void main(String[] args)
//         {
//           //给for循环起名for1
//           for1:for(int j=0;j<3;j++)
//           {
//             //给for循环起名for2
//           for2:for(int i=1;i<10;i++)
//           {
//             if(i==5)
//             {
//               break for1;//终止for1循环
//             }
//             System.out.println(i);//输出结果为：1 2 3 4
//           }
//         }
//       }
//       }

// public class Test
// {
//   public static void main(String[] args)
//   {
//     for(int i=0;i<10;i++)
//     {
//       if(i == 5)
//       {
//         break;
//       }
//       System.out.println("i="+i);
//     }
//     System.out.println("************");
//     for(int i=0;i<10;i++)
//     {
//       if(i == 5)
//       {
//         continue;
//       }
//       System.out.println("i="+i);
//     }
//     System.out.println("--------------");
//   }
// }

// public class Test
// {
//       //方法初步
//       public static void main(String[] args)
//        {
//              java.util.Scanner S = new java.util.Scanner(System.in);
//              System.out.print("Please input a number:");
//              int a = S.nextInt();
//              System.out.print("Please input a number:");
//              int b = S.nextInt();
//              System.out.println("The sum is:"+Test.sumInt(a,b));
//              printStr1();//当调用程序与方法处于一个类时，“类名.”即"Test."可以不写
//              otherClass.printStr2();//当调用程序与方法不处于一个类时，“类名.”即"Test."必须写
//        }
//        public static int sumInt(int a,int b) {
//              int c=a+b;
//             return c;
//        }
//        public static void printStr1()
//        {
//              System.out.println("Hello class1");
//        }
// }
// class otherClass
// {
//       public static void printStr2()
//       {
//             System.out.println("Hello Class2");
//       }
// }

// public class Test{//深入return语句
//       public static void main(String[] args) {
//             java.util.Scanner B = new java.util.Scanner(System.in);
//             int a =B.nextInt();
//             int b =B.nextInt();
//             int c=Test.divide(a, b);
//             if(c == 1){
//                   System.out.println(a+">"+b);
//             }
//             else{
//                   System.out.println(a+"<"+b);
//             }
//       }
//       public static int divide(int a,int b) {
//             // if(a/b > 0){
//             //       return 1;
//             // }
//             //       return 0;
//             return a/b > 0 ? 1 : 0;
//       }
// }

// public class Test{//在返回值类型是void的方法当中使用“return;”语句。
//       public static void main(String[] args) {
//             Test.returnTest();
//       }
//       public static void returnTest() {
//             for(int i=0;i<10;i++){
//                   if(i == 5){
//                         return;
//                   }
//                   System.out.println("i-->"+i);
//             }
//             System.out.println("returnTest");
//       }
// }

// public class Test{
//       public static void main(String[] args){
//         int result1 = sumInt(1,2);
//         System.out.println(result1);
//         double result2 = sumDouble(1.0,2.0);
//         System.out.println(result2);
//         long result3 = sumLong(1L,2L);
//         System.out.println(result3);
//       }
//       public static int sumInt(int a,int b){
//         return a+b;
//       }
//       public static double sumDouble(Double a,double b){
//         return a+b;
//       }
//     public static long sumLong(long a,long b){
//         return a+b;
//       }
//     }

// public class Test{
//       public static void main(String[] args){
//             //使用自定义方法代替System.out.println();
//             M.p("Hello world");
//       }
// }

// public class Test{//递归示例
//       public static void main(String[] args){
//         doSome();
//       }
//       public static void doSome(){
//         System.out.println("Begin");
//         doSome();
//         System.out.println("Over");
//     }
// }

// public class Test{//递归计算1~n的和
//       public static void main(String[] args){
//             System.out.print("请输入一个int类型的数，将会计算1~n的和：");
//             java.util.Scanner B = new java.util.Scanner(System.in);
//         int n = B.nextInt();
//         int returnValue = sum(n);
//         for(;n > 1;n--){
//               System.out.print(n+" + ");
//         }
//         System.out.print("1 = "+returnValue);
//       }
//       public static int sum(int n){
//         if(n == 1){
//           return 1;
//         }
//         return n + sum(n-1);
//       }
// }

// public class Test{//类和对象
//   int sno;
//   String sname;
//   int age;
//   String addr;
//   public static void main(String[] args){
//   //创建对象
//   Test S = new Test();
//   //访问对象
//   System.out.println(S.sno);
//   System.out.println(S.sname);
//   System.out.println(S.age);
//   System.out.println(S.addr);
//   System.out.println("*********************");
//   //修改对象数据
//   S.sno = 123;
//   S.sname = "Jack";
//   S.age = 20;
//   S.addr = "China";
//   System.out.println(S.sno);
//   System.out.println(S.sname);
//   System.out.println(S.age);
//   System.out.println(S.addr);
// }
// }

// public class Test{//对象的应用，联合User.java  Address.java
//   public static void main(String[] args){
//     User U = new User();
//     System.out.println(U.name);
//     System.out.println(U.no);
//     System.out.println(U.addr);

//     U.no = 100;
//     U.name ="jaa";
//     U.addr = new Address();
//     U.addr.city ="Beijin";
//     System.out.println(U.name + U.no + U.addr.city);
//   }
// }

// public class Test{//对象与类的应用
//   public static void main(String[] args){
//     System.out.println("欢迎注册！请按以下提示输入信息");
//     User U = new User();
//     U.addr.city = "beej";
//     System.out.println(U.addr.city);
//     System.out.print("请输入您的姓名：");
//     java.util.Scanner S = new java.util.Scanner(System.in);
//     U.name= S.next();
//     System.out.print("请输入您的身份证号：");
//     U.no = S.nextInt();
//     System.out.print("请输入您的住址：");
//     U.addr.city = S.next();
//     System.out.print("请输入您的邮编：");
//     U.addr.zipcode = S.nextInt();
//     System.out.println("恭喜注册成功！您的信息如下：");
//      System.out.println("姓名："+U.name);
//     System.out.println("身份证号："+U.no);
//     System.out.println("住址："+U.addr.city);
//     System.out.println("邮编："+U.addr.zipcode);
//   }
// }

// public class Test {

// 	public static void main(String[] args) {
// 		Customer c1 = new Customer();
// 			c1.name = "张三";
// 			c1.shopping();
// 		Customer c2 = new Customer();
// 		c2.name = "李四";
//     c2.shopping();
//     c2.doSome();
//   }
// }
//   class Customer {
// 	String name;

// 	public Customer() {

// 	}
// 	//不带有static的一个方法
// 	//顾客购物
// 	//所以购物这个行为属于对象级别的行为
// 	//由于每一个对象在执行购物这个动作的时候最终结果不同，所以购物这个动作必须有“对象”的参与。
// 	//重点：没有static关键字的方法称为“实例方法”
// 	//没有static关键字的变量被称为“实例变量”
// 	//注意：当一个行为/动作执行的过程中是需要对象参与的，那么这个方法一定要定义为“实例方法”，不需要static关键字
// 	public void shopping() {
// 		System.out.println(this.name+"在购物！");
//   }
//   //带有static不能使用this
// public static void doSome(){
//   //System.out.println(name);
//   System.out.println("he");
// }
// }

// public class Test{
//   int num = 1;
//   public static void main(String[] args) {
//     Test num = new Test();
//     System.out.println(num.num);
//   }
// }

// public class Test{//带有static和不带有static的方法调用方式
//   public static void main(String[] args) {
//     doSome();
//     Test T = new Test();
//     T.doOther();
//   }
//   public static void doSome() {
//     System.out.println("do some");
//   }
//   public void doOther() {
//     System.out.println("do other");
//   }
// }

// public class Test{
//   public static void main(String[] args) {
//     User U =new User();
//     U.setId(10);
//     System.out.println(U.getId());
//   }

// }
// class User{
//   private int id;
//   public User() {

//   }

//   public void setId(int id) {
//     this.id =id;
//   }
//   public int getId() {
//     return id;
//   }
//   }

// public class Test {

//   public static void main(String[] args) {
//     Chinese person1 = new Chinese("522127199810120014", "小明");
//       System.out.println(person1.id);
//       System.out.println(person1.name);
//       System.out.println(Chinese.country);
//     Chinese person2 = new Chinese("978678566767656543", "小华");
//       System.out.println(person2.id);
//       System.out.println(person2.name);
//       System.out.println(Chinese.country);
//   }

// }
// class Chinese {
//   String id;
//   String name;
//   static String country = "中国";
//   public Chinese() {

//   }
//   public Chinese(String Id,String Name) {
//     this.id = Id;
//     this.name = Name;
//   }
// }

// public class Test{
//   static{
//     System.out.println("类加载");
//   }
//   public static void main(String[] args){
//     System.out.println(" ");
//   }
// } 

// public class Test{
//   {
//     System.out.println(1);
//   }
//   {
//     System.out.println(1);
//   }
//   {
//     System.out.println(1);
//   }
//   public static void main(String[] args){
//       new Test();
//   }
// } 

// public class Test {//方法重写
//   public static void main(String[] args) {
//     Animal animal = new Animal();
//     animal.move();
//     Cat cat = new Cat();
//     cat.move();
//     Bird bird = new Bird();
//     bird.move();
//   }
// }

// class Animal {
//   public void move() {
//     System.out.println("动物在移动");
//   }
// }

// class Cat extends Animal {

// }

// class Bird extends Animal {
//   public void move() {
//     System.out.println("鸟在飞");
//   }
// }

// public class Test {//多态
//   public static void main(String[] args) {

//     /*
//     1.Animal和Cat之间存在继承关系，Animal是父类，Cat是子类
//     2.Cat is Animal
//     3.new Cat()创建的对象的类型是Cat，animal2这个引用的数据类型是Animal，可见他们进行了类型转换
//     4.子类转换成父类型，称为向上转换/upcastint，或者称为自动类型转换。
//     5.Java中允许这种语法：父类型引用指向子类型对象。
//     */

//     Animal animal2 = new Bird();

//     /*
//     1. Java程序永远分为编译阶段和运行阶段。
//     2. 先分析编译阶段，再分析运行阶段，编译无法通过，根本无法运行。
//     3. 编译阶段编译器检查animal2这个引用的数据类型为Animal，由于Animal.class字节码当中有move()方法，所以编译通过了，这个过程称为静态绑定，编译阶段绑定，只有静态绑定成功之后才有后面的进行。
//     4. 在程序运行阶段，JVM内存中真实创建的对象是Bird对象，那么以下程序在运行阶段一定会调用Cat对象的move()方法，此时发生了程序的动态绑定，运行阶段绑定。
//     5. 无论Bird类有没有重写方法，运行阶段一定调用的是Bird对象的move方法，因为底层真实对象就是Bird对象。
//     6. 父类型引用指向子类型对象这种机制导致程序存在编译阶段绑定和运行阶段绑定两种不同的形态/状态，这种机制可以称为一种多态语法机制。
//     */

//     animal2.move();//鸟在飞
//     //animal2.eat();//报错
//     Bird bird = (Bird)animal2;//强制类型转换
//     bird.eat();
//     Animal a3 = new Bird();
//     /*
//       1.以下程序编译没有问题，因为编译器检查到a3的数据类型是Animal，Animal和Cat之间存在继承关系，并且Animal是父类型，Cat是子类型，父类型转换成子类型叫做向下转换，语法合格
//       2.程序虽然编译通过了，但是程序在运行阶段会出现异常，因为JVM堆内存中真实存在的对象是Bird类型，Bird对象无法转换为Cat对象，因为两种类型之间不存在任何继承关系，此时出现著名的异常：
//     */
//     //Cat c3 = (Cat)a3;
//     if(a3 instanceof Cat){
//       Cat c3 = (Cat)a3;
//       c3.move();
//     }
//     else if(a3 instanceof Bird){
//       Bird b3 = (Bird)a3;
//       b3.eat();
//     }
//   }
// }

// class Animal {
//   public void move() {
//     System.out.println("动物在移动");
//   }
// }

// class Cat extends Animal {

// }

// class Bird extends Animal {
//   public void move() {
//     System.out.println("鸟在飞");
//   }
//   public void eat(){
//     System.out.println("鸟吃虫子");
//   }
// }

// public class Test {//多态的应用
//   public static void main(String[] args) {
//     Master xiaoming = new Master();
//     Cat tom = new Cat();
//     xiaoming.feed(tom);
//     Dog Jary = new Dog();
//     xiaoming.feed(Jary);
//     Bird Bob = new Bird();
//     xiaoming.feed(Bob);
//   }
// }

// class Master {
//   public void feed(Pet pet) {
//     pet.eat();
//   }
// }

// class Pet {
//   public void eat() {
//   }
// }

// class Cat extends Pet {
//   public void eat() {
//     System.out.println("小猫吃鱼！");
//   }
// }

// class Dog extends Pet {
//   public void eat() {
//     System.out.println("小狗啃骨头！");
//   }
// }
// class Bird extends Pet{
//   public void eat(){
//     System.out.println("小鸟吃虫！");
//   }
// }

// public class Test {
//   public static void main(String[] args) {// string当中的方法调用示例
//     String newString = "ab替换前ab替换前ab替换前ab替换前".replaceAll("替换前", "替换后");
//     System.out.println(newString);
//     System.out.println("这句话一共8个字".length());
//   }
// }

// public class Test{
//   public static void main(String[] args) {
//     final int i = 100;
//     //i = 10;//编译错误，无法为最终变量i分配值：The final local variable i cannot be assigned. It must be blank and not using a compound assignment
//     System.out.println(i);
//   }
// }
// class T{
//   public void PutS(){
//   System.out.println("Test");
// }
// }
// class A extends T{
//   //public void PutS();//报错
// }

// public class Test{
//   //final int age;//编译错误
//   //第一种解决方案
//   final int age = 10;
//   //第二种解决方案
//   final int num;
//   public Test(){
//     this.num = 20;
//   }
// }

// public class Test{
// public static void main(String[] args) {
//   User u = new User();
//   System.out.println(u.i);
//   System.out.println(u.j);
// }
// }
// class User{
//   //受保护的
//   protected int i = 10;
//   //缺省的
//   int j = 20;
// }

// public class TestTest {
//     public static void main(String[] args) {
//       new B();
//     }
//   }
  
//   class A {
//     public A() {
//       System.out.println("A类的无参数构造方法！");
//     }
//   }
  
//   class B extends A {
//     public B() {
//       System.out.println("B类的无参数构造方法！");
//     }
//   }
  
//   public class Test {//接口的基础语法
  
//   }
  
//   interface A {
//     // 常量必须用public static final修饰
//     public static final String SUccess = "success";
//     public static final double PI = 3.14;
//     // public static final可以省略
//     byte MAX_VALUE = 127;// 常量
  
//     // 抽象方法，接口中所有的抽象方法都是public abstract
//     public abstract void m1();
  
//     // public abstract是可以省略的
//     void m2();
//   }
  
//   interface B {
//     void m1();
//   }
  
//   interface C {
//     void m2();
//   }
  
//   interface D {
//     void m3();
//   }
  
//   interface E extends B, C, D {// 支持多继承
//     void m4();
//   }
  
//   // inplements是实现的意思，是一个关键字
//   // inplements和extends意义相同
//   class MyClass implements B, C {
//     public void m1() {
//     }
  
//     public void m2() {
//     }
//   }
  
//   class F implements E {
//     public void m1() {
//     }
  
//     public void m2() {
//     }
  
//     public void m3() {
//     }
  
//     public void m4() {
//     }
//   }
  
  
  // public class Test{
  // public static void main(String[] args){
  //   Object o = new Object();
  //   String str = o.toString();
  //   System.out.println(str);
  // }
  // }
  
  
  // public class Test{//JDBC编程六步
  //   public static void main(String[] args){
  //     //1.注册为驱动
  //     DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.Driver());
  //   }
  // }
  
  
  // public class Test{
  //   public static void main(String[] args) {
  //       Animal cat = new cat();
  //       cat.move();
  //       }
  // }
  // abstract class Animal{
  //   public abstract void move();
  // }
  // class cat extends Animal{
  //   public void move(){
  //       System.out.println("cat move");
  //   }
  // }

  // public class Test {
  //   public static void main(String[] args){
  //     System.out.println(math.PI);
  //   }
  // }
  // interface A{

  // }
  // interface B{

  // }
  // interface C extends A,B{

  // }
  // interface math{//接口中的抽象方法定义时：public abstract修饰符可以省略
  //   //public abstract void sum(int a,int b);
  //   void sum(int a,int b);
  //   //public final static double PI = 3.1415926;接口中的常量前面的public final static也可以省略
  //   double PI = 3.1415926;
  // }


  // public class Test{
  //   public static void main(String[] args){
  //     mathImpl ma = new mathImpl();
  //     System.out.println(ma.sum(1, 2));
  //     System.out.println(ma.sub(2, 1));
  //   }
  // }
  // interface math{
  //   int sum(int a,int b);
  //   int sub(int a,int b);
  // }
  // class mathImpl implements math {
  //   public int sum(int a,int b){
  //     return a+b;
  //   }
  //   public int sub(int a,int b){
  //     return a-b;
  //   }
  // }


  // public class Test{
  //     public static void main(String[] args){
  //       C c = new C();
  //       c.m1();
  //       c.m2();
  //     }
  // }
  // interface A{
  //   void m1();
  // }
  // interface B{
  //   void m2();
  // }
  // class C implements A,B{//一个类可以实现同时实现多个接口
  //   public void m1(){
  //     System.out.println("interface A");
  //   }
  //   public void m2(){
  //     System.out.println("interface B");
  //   }
  // }


//   public class Test{
//     public static void main(String[] args){
//       fly ca = new cat();
//     ca.flya();
//   }
// }
//   class Animal{

//   }
//   interface fly{
//     void flya();
//   }
//   class cat extends Animal implements fly{//继承和实现都存在的时候，extends在前，implements在后
//       public void flya(){
//         System.out.println("cat fly");
//       }
//   }

// public class Test{
//   public static void main(String[] args) {
//   int chessarr[][] = new int[11][11];
//   chessarr[1][2] = 1;
//   chessarr[2][3] = 2;
//   for(int[] row:chessarr){
//       for(int data:row){
//           System.out.printf("%d\t",data);
//       }
//       System.out.println();
//   }
//   }
// }

// public class Test{
//   public static void main(String[] args){
//     MyTime mT = new MyTime(2020,5,3);
//     //一个日期对象转换成字符串形式的话，希望的是看到具体的时间
//     //MyTime类重写toString()方法之前
//     //System.out.println(mT.toString());//输出：MyTime@7382f612

//     //MyTime类重写toString()方法之后
//     System.out.println(mT.toString());//输出：2020年5月3日
//   }
// }
// class MyTime{
//   int year;
//   int month;
//   int day;

//   public MyTime(){

//   }
//   public MyTime(int year,int month,int day){
//     this.year = year;
//     this.month = month;
//     this.day = day;
//   }

//   //重写toString()方法
//   //向简洁的、详实的、易阅读的方向发展
//   public String toString(){
//     return this.year+"年"+this.month+"月"+this.day+"日";
//   }
// }


// public class Test{
//   public static void main(String[] args) {
//     //判断两个基本数据类型的数据是否相等直接使用“==”就行
//     int a = 100;
//     int b = 100;
//     //这个“==”是判断a中保存的100和b中保存的100是否相等
//     System.out.println(a==b);//输出 true

//     //判断两个java对象是否相等
//     MyTime t1 =new MyTime(2008,1,1);
//     MyTime t2 =new MyTime(2008,1,1);
//     //这里的“==”判断的是：t1中保存的对象地址和t2中保存的对象地址是否相等
//     System.out.println(t1 == t2);//输出：false
//     //未重写时输出结果
//     System.out.println(t1.equals(t2));//false
//   }
// }
// class MyTime{
//   int year;
//   int month;
//   int day;

//   public MyTime(){

//   }
//   public MyTime(int year,int month,int day){
//     this.year = year;
//     this.month = month;
//     this.day = day;
// }
// //Object类中的equals方法当中，默认采用的是“==”判断两个java对象是否相等，而“==”判断的是两个对象的地址是否相等，如果需要判断两个对象的内容是否相等，就需要重写equals方法
// public boolean equals(Object obj){
//     int year1 = this.year;
//     int month1 = this.month;
//     int day1 = this.day;
//     if(obj instanceof MyTime){
//       MyTime t = (MyTime)obj;
//       int year2 = t.year;
//       int month2 = t.month;
//       int day2 = t.day;
//       if(year1==year2 && month1 == month2 && day1 == day2){
//         return true;
//       }
//     }
//     return false;
// }
// }


// public class Test{//java语言当中的string重写了toString()和equals方法
//   public static void main(String[] args){
//     //大部分情况下，采用这种方式创建字符串对象
//     String s1 = "Hello";
//     String s2 = "World";
//     System.out.println(s1 == s2);

//     //实际上string也是一个类，不属于基本数据类型，所以一定存在构造方法
//     String s3 = new String("Test1");
//     String s4 = new String("Test1");
//     System.out.println(s3==s4);//false
//     //String类已经重写了equals方法，比较两个字符串不能使用“==”，必须使用equals。
//     System.out.println(s3.equals(s4));//true

//     String x = new String("Test2");
//     //如果String没有重写toString方法，输出结果：java.lang.String@十六进制的地址
//     //经过测试，string类已经重写了toString方法
//     System.out.println(x.toString());
//   }
// }


// public class Test{
//   public static void main(String[] args){
//     //Person p = new Person();
//     //提示：java中的垃圾回收器不是轻易启动的，可能会因为垃圾太少或者时间没到等情况不执行
//     //把p变为垃圾
//     //p = null;
//     //多造点垃圾
//     for(int i = 0;i<=100000000;i++){
//       Person p = new Person();
//       p = null;
//     }
//   }
// }

// class Person{
//   //重写finalize()方法
//   //person类型的对象被垃圾回收器回收的时候，垃圾回收器负责调用：p.finalize();
//   //项目开发中会有这样的需求：所有对象在JVM中被释放的时候，请记录释放时间。这时则需要将代码写到finalize()中
//   protected void finalize() throws Throwable{
//     System.out.println("即将被销毁！");
//   }
// }


// public class Test{
//   public static void main(String[] args){
//     Object o = new Object();
//     int hashCodeValue = o.hashCode();
//     //对象内存地址经过哈希算法转换的一个数字，可以等同看作内存地址
//     System.out.println(hashCodeValue);
//   }
// }


// public class Test{
//   static class NeiBu00{
//     //该类在类的内部，所以称为内部类
//     //由于前面又static，所以称为“静态内部类”
//   }
//   class Neibu01{
//     //该类在类的内部，所以称为内部类
//     //没有static叫做实例内部类
//   }
//   public void doSome(){
//     int i = 100;
//     class NeiBu02{
//       //该类在类的内部，所以称为内部类
//       //局部内部类
//     }
//   }
// }


// public class Test{
//   public static void main(String[] args){
//     Mymath ma = new Mymath();
//     //未使用匿名内部类
//     //ma.sum(new Calcu2(), 1, 5);
//     //使用匿名内部类
//     ma.sum(new Calcu(){//写的是接口名，以下的程序代表了对接口的实现
//       public int sum(int a,int b){
//         return a+b;
//       }
//     }, 1, 5);
//   }
// }
// interface Calcu{
//   int sum(int a,int b);
// }
// // class Calcu2 implements Calcu{
// //   public int sum(int a,int b){
// //     return a+b;
// //   }
// // }//使用匿名内部类时不需要再此处写接口的实现

// class Mymath{
//   public void sum(Calcu c,int x,int y){
//     int reValue = c.sum(x,y);
//     System.out.println(x+"+"+y+"="+reValue);
//   }
// }

import java.util.Scanner;
//该方法实现的队列只能使用一次，不能复用
public class Test {
    public static void main(String[] args) {//数组模拟队列
        System.out.println("Hello world");
        Queue queue = new Queue(4);
        boolean loop = true;
        while (loop) {
            System.out.println("a:添加数据");
            System.out.println("g:获取数据");
            System.out.println("s:查看队列");
            System.out.println("h:查看头数据");
        Scanner scanner =new Scanner(System.in);
        String x = scanner.next();
        int y;
        switch (x)
        {
            case "a":
                System.out.println("请输入一个数据");queue.addQueue(y=scanner.nextInt());break;
            case "g":try {
                System.out.println(queue.getQueue());break;
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());break;
            }
            case "s":try {
                queue.showQueue();break;
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());break;
            }
            case "h":try {
                System.out.println(queue.headQueue());break;
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

        /*int get = queue.getQueue();
        System.out.println(get);*/
    }
    }
}

class Queue{
    private int MaxSize;
    private int front;
    private int rear;
    private int[] arr;
    public Queue(int arrMaxSize){
        MaxSize = arrMaxSize;
        front = -1;
        rear = -1;
        arr = new int[MaxSize];
    }
    public boolean isFull(){//判断队列是否为满
        return rear == MaxSize-1;
    }
    public boolean isEmpty(){//判断队列是否为空
        return rear == front;
    }
    public void addQueue(int n){//添加数据到队列
        //先判断队列是否为满
        if(isFull()){
            System.out.println("F队列已满，不能添加数据！");
            return;
        }
        rear++;
        arr[rear] = n;
    }
    public int getQueue() {//获取队列的数据，出队列
        //判断队列是否为空
        if (isEmpty()) {
            //通过抛出异常
            throw new RuntimeException("G队列空，不能获取数据！");
        }
        front++;
        return arr[front];
    }
    public void showQueue(){//显示队列的所有数据
        //遍历
        if(isEmpty()){
            System.out.println("S队列为空，没有数据！");
            return;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }
    public int headQueue(){//显示队列的头数据
        //判断
        if(isEmpty()){
            throw new RuntimeException("H队列为空，无头数据");
        }
        return arr[front+1];
    }
}
