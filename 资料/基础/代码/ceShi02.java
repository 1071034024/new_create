package ceshi;

import java.util.Random;


/*1.������������Ϊ5�����飬������Ԫ��Ϊ������ɵġ����ظ��� 1-100֮���ż����ÿ�������ڲ���Ԫ��һ���ǲ��ظ���1-100֮���ż���������������������ظ��ģ��� 
2.����һ������unionArr(��������)�������������飬�����н���������Ԫ�غϲ���һ���������У����ҽ�����������ݴ�ӡ������̨��           
       public static int[] unionArr(int[] arr1,int[] arr2) 
       ����: ���������Ԫ�ش��뵽һ���������в����� 
3.�������н��*/
public class ceShi02 {
public static void main(String[] args) {
	
	Random s = new Random();
	int[] arr1 = new int[5];
	int[] arr2 = new int[5];
	int flag = 0;
	for (int i = 0; i < arr1.length; i++) {
		int a = s.nextInt(101);
		for (int j = 0; j < arr1.length; j++) {
			if (a == arr1[j]) {
				flag = 1;
				i--;
			}
		}
		
	}
}
}
