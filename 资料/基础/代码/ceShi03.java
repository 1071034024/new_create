package ceshi;

import java.util.Scanner;

/*1.����4���������ֱ�������int�������ݺͣ���������ӣ�����������������������������ˣ����̣������������������������أ������������£� 
//��num1��num2�ĺͲ����� 
public static int add(int num1,int num2) 
//��num1��num2�Ĳ�ֵ������ 
public static int sub(int num1,int num2) 
//��num1��num2�ĳ˻������� 
public static int mul(int num1,int num2) 
//��num1��num2���̲����� 
public static int div(int num1,int num2)
2.ʹ�����涨��ķ���ģ����������ܣ��Լ���¼�������int���͵��������ν��мӡ������ˡ��������㣬����ӡ������ 
3.Ҫ�� 
       (1)����¼����������,����ǰ������������μ���������ݣ� 
              ����������ΪҪ���е�����(0:��ʾ�ӷ�����,1:��ʾ��������,2:��ʾ�˷�����,3:��ʾ��������) 
       (2)��ʾ��ʽ����: 
              �������һ������:30 
              ������ڶ�������:40 
              ��������Ҫ���е�����(0:��ʾ�ӷ�����,1:��ʾ��������,2:��ʾ�˷�����,3:��ʾ��������):0 
              ����̨���:30+40=70*/
public class ceShi03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�������һ������:");
		int a = sc.nextInt();

		System.out.println("������ڶ�������:");
		int b = sc.nextInt();

		System.out.println("��������Ҫ���е�����(0:��ʾ�ӷ�����,1:��ʾ��������,2:��ʾ�˷�����,3:��ʾ��������):");
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
			System.out.println("������������!!");
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
