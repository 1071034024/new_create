package ceshi;

import java.util.Scanner;

/*1.定义4个方法，分别求两个int类型数据和（两个数相加）、差（两个数相减）、积（两个数相乘）、商（两个数相除），并将结果返回，方法描述如下： 
//求num1和num2的和并返回 
public static int add(int num1,int num2) 
//求num1和num2的差值并返回 
public static int sub(int num1,int num2) 
//求num1和num2的乘积并返回 
public static int mul(int num1,int num2) 
//求num1和num2的商并返回 
public static int div(int num1,int num2)
2.使用上面定义的方法模拟计算器功能，对键盘录入的两个int类型的数据依次进行加、减、乘、除的运算，并打印运算结果 
3.要求： 
       (1)键盘录入三个整数,其中前两个整数代表参加运算的数据， 
              第三个整数为要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算) 
       (2)演示格式如下: 
              请输入第一个整数:30 
              请输入第二个整数:40 
              请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):0 
              控制台输出:30+40=70*/
public class ceShi03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入第一个整数:");
		int a = sc.nextInt();

		System.out.println("请输入第二个整数:");
		int b = sc.nextInt();

		System.out.println("请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):");
		int c = sc.nextInt();

		switch (c) {
		case 0:
			int add = add(a, b);
			System.out.println(a + "+" + b + "=" + add);
			break;
		case 1:
			int sub = sub(a, b);
			System.out.println(a + "-" + b + "=" + sub);
			break;
		case 2:
			int mul = mul(a, b);
			System.out.println(a + "*" + b + "=" + mul);
			break;
		case 3:
			int div = div(a, b);
			System.out.println(a + "/" + b + "=" + div);
			break;
		default:
			System.out.println("输入的运算错误!!");
			break;
		}
	}

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int sub(int num1, int num2) {
		return num1 - num2;
	}

	public static int mul(int num1, int num2) {
		return num1 * num2;
	}

	public static int div(int num1, int num2) {
		return num1 / num2;
	}

}
