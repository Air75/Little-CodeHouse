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
      System.out.println("hello world");
  }
} 