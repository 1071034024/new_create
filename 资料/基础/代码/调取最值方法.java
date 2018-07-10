package com.pritace;
//1.使用循环的方式键盘录入6个整数，（录入的时候要求先提示”请输入第几个数：”）并将这6个数存储到数组中
//2.计算去掉数组中最小的值和最大的值之后的剩余元素平均值；
//3.将求出的平均值打印到控制台上；
import java.util.Scanner;

public class Pritace01 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个数");
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
