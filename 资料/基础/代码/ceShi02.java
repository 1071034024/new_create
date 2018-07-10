package ceshi;

import java.util.Random;


/*1.创建两个长度为5的数组，数组内元素为随机生成的、不重复的 1-100之间的偶数（每个数组内部的元素一定是不重复的1-100之间的偶数，但两个数组间可以有重复的）。 
2.定义一个方法unionArr(描述如下)，传入两个数组，方法中将两个数组元素合并到一个新数组中，并且将新数组的内容打印到控制台上           
       public static int[] unionArr(int[] arr1,int[] arr2) 
       功能: 两个数组的元素存入到一个新数组中并返回 
3.程序运行结果*/
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
