package com.itheima;

import java.util.Random;
import java.util.Scanner;

/*
 * 猜数字小游戏案例
 *		系统产生一个1-100之间的随机数，请猜出这个数据是多少。
 *
 * 分析：
 * 		A:系统产生一个1-100之间的随机数
 * 			Random r = new Random();
 * 			int number = r.nextInt(100) + 1;
 * 		B:键盘录入我们要猜的数据
 * 		C:比较这两个数据,用if语句实现
 * 			大了：提示大了
 * 			小了：提示小了
 * 			猜中了：提示恭喜你,猜中了
 * 		D:多次猜数据,而我们不知道猜多少次,怎么办呢?
 * 			while(true) {循环体语句;}
 */
public class RandomTest {
	public static void main(String[] args) {
		//系统产生一个1-100之间的随机数
		Random r = new Random();
		//获取随机数
		int number = r.nextInt(100) + 1;
		
		//多次猜数据
		while(true) {
			//键盘录入我们要猜的数据
			Scanner sc = new Scanner(System.in);
			//接收数据
			System.out.println("请输入你要猜的数据(1-100)：");
			int guessNumber = sc.nextInt();
			
			//比较这两个数据,用if语句实现
			if(guessNumber > number) {
				System.out.println("你猜的数据"+guessNumber+"大了");
			}else if(guessNumber < number) {
				System.out.println("你猜的数据"+guessNumber+"小了");
			}else {
				System.out.println("恭喜你,猜中了");
				break;
			}
		}
	}
}
