package com.itheima;

import java.util.Scanner;

/*
 * ����
 * (1)����¼��5��int���͵����ݴ洢����arr��
 * (2)���巽����arr�����е����ݷ�ת
 * (3)���巽���Է�ת���������б���
 * 
 * ������
 * 		A:����һ������Ϊ5������
 * 		B:ͨ������¼�����ݸ������е�Ԫ�ظ�ֵ
 * 		C:���巽����arr�����е����ݷ�ת
 * 			ʲô�Ƿ�ת?���ʵ�ַ�ת
 * 		D:���巽���Է�ת���������б���
 */
public class Test7 {
	public static void main(String[] args) {
		//����һ������Ϊ5������
		int[] arr = new int[5];
		
		//ͨ������¼�����ݸ������е�Ԫ�ظ�ֵ
		Scanner sc = new Scanner(System.in);
		for(int x=0; x<arr.length; x++) {
			System.out.println("������"+(x+1)+"��Ԫ��ֵ��");
			int number = sc.nextInt();
			arr[x] = number;
		}
		
		//��תǰ
		printArray(arr);
		
		//���巽����arr�����е����ݷ�ת
		reverse(arr);
		
		//���巽���Է�ת���������б���
		printArray(arr);
	}
	
	//��������
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0; x<arr.length; x++) {
			if(x==arr.length-1) {
				System.out.println(arr[x]+"]");
			}else {
				System.out.print(arr[x]+", ");
			}
		}
	}
	
	/*
	 * ������ȷ��
	 * 		����ֵ���ͣ�void
	 * 		�����б�int[] arr
	 */
	public static void reverse(int[] arr) {
		for(int start=0,end=arr.length-1; start<=end; start++,end--) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
	
}
