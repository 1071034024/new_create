package com.itheima_05;

import java.util.Scanner;

/*
 * ����¼��һ���ַ������Ѹ��ַ���������ĸת�ɴ�д������ΪСд��(ֻ����Ӣ�Ĵ�Сд��ĸ�ַ�)
 * 
 * ������
 * 		A:����¼��һ���ַ���
 * 		B:��ȡ����ĸ
 * 		C:��ȡ��������ĸ������ַ���
 * 		D:Bת��д+CתСд
 * 		E:�������
 */
public class StringTest {
	public static void main(String[] args) {
		//����¼��һ���ַ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String s = sc.nextLine();
		
		//��ȡ����ĸ
		String s1 = s.substring(0, 1);
		
		//��ȡ��������ĸ������ַ���
		String s2 = s.substring(1);
		
		//Bת��д+CתСд
		String s3 = s1.toUpperCase()+s2.toLowerCase();
		
		//�������
		System.out.println("s3:"+s3);
	}
}
