package com.itheima_05;

import java.util.Scanner;

/*
 * 键盘录入一个字符串，把该字符串的首字母转成大写，其余为小写。(只考虑英文大小写字母字符)
 * 
 * 分析：
 * 		A:键盘录入一个字符串
 * 		B:截取首字母
 * 		C:截取除了首字母以外的字符串
 * 		D:B转大写+C转小写
 * 		E:输出即可
 */
public class StringTest {
	public static void main(String[] args) {
		//键盘录入一个字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();
		
		//截取首字母
		String s1 = s.substring(0, 1);
		
		//截取除了首字母以外的字符串
		String s2 = s.substring(1);
		
		//B转大写+C转小写
		String s3 = s1.toUpperCase()+s2.toLowerCase();
		
		//输出即可
		System.out.println("s3:"+s3);
	}
}
