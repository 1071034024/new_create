package com.itheima;

import java.util.Scanner;

/*
 * ���󣺼���¼������,Ҫ����������λ������,����Ҫ�����ݽ��м���,���ܹ�������:
 * ÿλ���ֶ�����5,Ȼ�����10���������������,
 * �ٽ���һλ�͵���λ����,�ڶ�λ�͵���λ����,
 * ��Ѽ��ܺ���������������̨
 * 
 * ������
 * 		A:����¼��һ��4λ��
 * 			������4567
 * 		B:����һ������Ϊ4������
 * 			int[] arr = new int[4];
 * 			arr = {4,5,6,7};
 * 		C:�������е����ݽ��м��ܹ���Ĳ���
 * 			ÿλ���ֶ�����5,Ȼ�����10���������������
 * 				arr[x] += 5;
 * 				�����arr = {9,10,11,12};
 * 				arr[x] %= 10;
 * 				�����arr = {9,0,1,2};
 * 			�ٽ���һλ�͵���λ����,�ڶ�λ�͵���λ����
 * 				�����arr = {2,1,0,9};
 *		D:��Ѽ��ܺ���������������̨
 */
public class Test9 {
	public static void main(String[] args) {
		//����¼��һ��4λ��
		Scanner sc = new Scanner(System.in);
		//��������
		System.out.println("������һ��4λ����");
		int number = sc.nextInt();
		
		//����һ������Ϊ4������
		int[] arr = new int[4];
		arr[0] = number/10/10/10%10;
		arr[1] = number/10/10%10;
		arr[2] = number/10%10;
		arr[3] = number%10;
		
		//�������е����ݽ��м��ܹ���Ĳ���
		//ÿλ���ֶ�����5,Ȼ�����10���������������
		for(int x=0; x<arr.length; x++) {
			arr[x] += 5;
			arr[x] %= 10;
		}
		
		//�ٽ���һλ�͵���λ����,�ڶ�λ�͵���λ����
		int temp = arr[0];
		arr[0] = arr[3];
		arr[3] = temp;
		
		temp = arr[1];
		arr[1] = arr[2];
		arr[2] = temp;
		
		//��Ѽ��ܺ���������������̨
		for(int x=0; x<arr.length; x++) {
			System.out.print(arr[x]);
		}
		System.out.println();
	}
}
