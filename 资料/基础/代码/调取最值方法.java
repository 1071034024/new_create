package com.pritace;
//1.ʹ��ѭ���ķ�ʽ����¼��6����������¼���ʱ��Ҫ������ʾ��������ڼ�����������������6�����洢��������
//2.����ȥ����������С��ֵ������ֵ֮���ʣ��Ԫ��ƽ��ֵ��
//3.�������ƽ��ֵ��ӡ������̨�ϣ�
import java.util.Scanner;

public class Pritace01 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�������" + (i + 1) + "����");
			arr[i] = scanner.nextInt();

		}
		int max = getMax(arr);
		System.out.println(max);
		int min = getMin(arr);
		System.out.println(min);

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != max && arr[i] != min) {
				sum += arr[i];

			}
		}
		double ave = sum / (6 - 2);
		System.out.println(ave);
	}

	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

		}
		return min;
	}

}
