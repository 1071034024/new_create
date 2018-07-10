
2.下列语句序列执行后，i的值是(D  )。 (2分)
	int i=16; 
	do{
	i/=2;
	} while(i>3);
	A、16
	B、8
	C、4
	D、2

3.以下选项可以正确创建一个长度为3的一维数组的是 ( A  )(2分)
	A、
	new int[3]
	B、
	new int[3]{}
	C、
	new int[][3]
	D、
	以上答案都不对
4.以下关于变量说法错误的是 (   C )(2分)
	A、
	变量名必须是一个有效的标示符
	B、
	变量必须先初始化，再使用
	C、
	变量一旦被定义，在程序中的任何位置都可以被访问
	D、
	在程序中，可以将一个char类型的值赋值给一个int类型的变量，不需要特殊声明

5.下面程序执行的结果是(   A ) (2分)
	class  Test{
		public  static  void  main(String[] args){
		  System.out.println(““+’a’+1); 
		}
	}
	A、
	98
	B、
	a1
	C、
	971
	D、
	197
7.和下面代码执行结束后，sum结果一致的选项是（ B  ）(2分)
	int i=1;
	int sum=0;
	while(i<=100){
	  if(i%2==0){
	  	sum=sum+i;
	}
	  i++;
	}
	A、
	for (int x =1; x<=100;x++){ sum=sum+x;}
	B、
	for (int x =0; x<=100;x+=2){ sum=sum+x;}
	C、
	for (int x =1; x<=100;x+=2){ sum=sum+x;}
	D、
	上述全对
8.下面哪个不是java中的关键字（  C ）(2分)
	A、
	public
	B、
	true
	C、
	main
	D、
	class

10.下面程序执行的结果是（D ）(2分)
	int x = 1,y = 1;
	if(x++==2 & ++y==2){
	 	x=7;
	}
	System.out.println("x="+x+"  ,  y="+y);
	A、
	x=1 y=2
	B、
	x=7 y=1
	C、
	x=7 y=2
	D、
	x=2 y=2
12.阅读下面代码段：执行结果正确的说法是( C   )(2分)
	public class Demo{
	　　public static void main (String[] args){
	  	int[] arr = new int[10];
	　　 	System.out.println(arr[1]);
	　　}
	}
	A、
	编译时将产生错误
	B、
	编译时正确，运行时将产生错误
	C、
	输出零
	D、
	输出空
13. 给定java代码，如下，编译运行，结果是（ A  ）(2分)
	public static void main(String[] args){
	 boolean flag;
	 System.out.println(“flag”+flag); 
	}
	A、
	编译错误
	B、
	编译通过，单出现运行时错误
	C、
	正常运行，输出flag=false
	D、
	正常运行，输出flag=
14. 下面程序的运行后,结果正确的是：(  B )(2分)
	int a=1,b=2;
	int c=(a+b>3 a++:++b);
	A、
	a=2,b=3
	B、
	a=1,b=3
	C、
	a=1,b=2
	D、
	c=2
15. 下面哪种类型的文件可以在java虚拟机中运行 ( D  )(2分)
	A、
	.java
	B、
	.jre
	C、
	.exe
	D、
	.class

18. 关于选择结构下列哪个说法正确（B）(2分)
	A、
	if语句和 else语句必须成对出现
	B、
	if语句可以没有else语句对应
	C、
	switch结构中每个case语句中必须用break语句
	D、
	switch结构中必须有default语句
	19. 关于main方法说法错误的是（B）(2分)
	A、
	main方法是java程序执行的入口
	B、
	main方法的方法体重至少要有一行代码
	C、
	main必须定义在一个类中
	D、
	main方法的定义格式为：public static void main(String[] args){}
20. 下面程序执行的结果是（ C）(2分)
	boolean b=true;
	if(b=false){
	 System.out.println("a");
	}else if(b){
	 System.out.println("b"); 
	}else if(!b){
	 System.out.println("c");
	}else{
	 System.out.println("d");
	}
	A、
	a
	B、
	b
	C、
	c
	D、
	d
21. 应用程序的main方法中有以下语句，则执行后输出的结果是 ( B )(2分)
	int[] x = {125,21,5,168,98};
	int max = x[0];
	for (int i=1; i<x.length; i++){
	  if(x[i] < max)
	  max = x[i];
	}
	System.out.println(max);
	A、

	125
	B、
	5
	C、
	168
	D、
	98
22. 下面程序执行的结果是（C）(2分)
	int i = 100;
	while(true){
	 if (i++ > 100){
	  break;
	 }
	System.out.println(i);
	}
	A、
	100
	B、
	101
	C、
	102
	D、
	报错

24. 表达式5/2的运算结果是(  A)(2分)
	A、
	2
	B、
	2.0
	C、
	1
	D、
	1.0

25. 下面哪个表达式可用得到x和y两个数中的较大值 ( B )(2分)
	A、
	x>y?y:x
	B、
	x<y?y:x
	C、
	x>y?(x+y):(x-y)
	D、
	x==y y:x;
26. 下面程序执行的结果(2分)
	for(int  i=1;i<=10;i++){
	 	if (i%3==0){
	  	continue;
	 	}
	System.out.println(“java基础班”);
	}
	在屏幕上打印几次“java基础班” (C  )
	A、
	5
	B、
	6
	C、
	7
	D、
	8
27. 下面程序哪个语句是正确的( C)(2分)
	A、
	byte a=0,b=3; byte c =a+b;
	B、
	short s =23; s=s+12;
	C、
	short s=23; s+=12;
	D、
	float f = 23+23.23;
28. 下面程序执行的结果是（D）(2分)
	int x=2,y=3;
	switch(x){
	 default:
	  y++;
	 case 3:
	  y++;
	 case 4:
	  y++;
	}
	System.out.println("y="+y);
	A、
	3
	B、
	4
	C、
	5
	D、
	6

29. 下面关于Java语言跨平台说法错误的是(C)(2分)
	A、
	java语言编写的程序，一次编译后，可以在多个系统平台上运行。
	B、
	java语言垮平台依赖于java虚拟机
	C、
	java垮平台，java虚拟机也是垮平台的（不同系统平台使用相同的java虚拟机）
	D、
	原理是java程序通过java虚拟机在不同系统平台上运行，只要该系统可以安装相应的java虚拟机，该系统就可以运行java程序。
30. 下面说法正确的是(B）(2分)
	A、
	JVM就是Java虚拟机，包含java核心类库
	B、
	JRE就是java运行环境，包含java程序编译运行的工具环境
	C、
	JDK就是java开发环境，javac是其中的一个工具
	D、
	功能范围：JDK > JVM > JRE
	
多选题 共10题满分：40分

31. 下列哪个声明是错误的（ACD）(4分)
	A、
	float f = 1.1;
	B、
	int I = 10;
	C、
	int other = (int) true;
	D、
	double 3d = 3.3d;//变量名数字不能开头

33. 关于类的命名，正确说法是（BC）(4分)
	A
	可以由数字和英文拉丁字母组成，且可以任意排序
	B、
	命名要做到见名知意
	C、
	如果是由多个单词组成，每个单词首字母大写
	D、
	可以是Java已经定义过的关键字

34.
	for循环格式如下：
	for(表达式1;表达式2;表达式3){
	 //code
	}
	下面描述错误的是（AC）(4分)
	A、
	表达式1处的代码会被执行多次
	B、
	表达式1处可以定义变量
	C、
	表达式3用于决定循环是否应该结束
	D、
	表达式2的值可以是任意类型，也可以是boolean类型
35. 下面哪些是合法的标示符（BC）(4分)
	A、
	2variable
	B、
	variable2
	C、
	what$
	D、
	_3_
36. 下面的说法正确的是( A C)(4分)
	A、
	byte ,short,char 数据类型可以自动转化为int
	B、
	float 数据类型可以自动转换为long。
	C、
	在java语言中默认小数为double
	D、
	byte a=23; byte b=12; a+b的结果为byte类型

38. 设有定义 float x=3.5f, y=4.6f, z=5.7f; 则以下的表达式中，值为false的是( ABC)(4分)
	A、
	x > y || x > z
	B、
	x < y & ! ( x < z )
	C、
	z > ( y + x )
	D、
	x != y
39.下面程序哪个语句是正确的( AD)(4分)
	A、
	short s=23; s+=12;
	B、
	float f = 23+23.23;
	C、
	short s =23; s=s+12;
	D、
	byte b=10;b++;
