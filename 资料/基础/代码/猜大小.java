package com.itheima;

import java.util.Random;
import java.util.Scanner;

/*
 * ������С��Ϸ����
 *		ϵͳ����һ��1-100֮������������³���������Ƕ��١�
 *
 * ������
 * 		A:ϵͳ����һ��1-100֮��������
 * 			Random r = new Random();
 * 			int number = r.nextInt(100) + 1;
 * 		B:����¼������Ҫ�µ�����
 * 		C:�Ƚ�����������,��if���ʵ��
 * 			���ˣ���ʾ����
 * 			С�ˣ���ʾС��
 * 			�����ˣ���ʾ��ϲ��,������
 * 		D:��β�����,�����ǲ�֪���¶��ٴ�,��ô����?
 * 			while(true) {ѭ�������;}
 */
public class RandomTest {
	public static void main(String[] args) {
		//ϵͳ����һ��1-100֮��������
		Random r = new Random();
		//��ȡ�����
		int number = r.nextInt(100) + 1;
		
		//��β�����
		while(true) {
			//����¼������Ҫ�µ�����
			Scanner sc = new Scanner(System.in);
			//��������
			System.out.println("��������Ҫ�µ�����(1-100)��");
			int guessNumber = sc.nextInt();
			
			//�Ƚ�����������,��if���ʵ��
			if(guessNumber > number) {
				System.out.println("��µ�����"+guessNumber+"����");
			}else if(guessNumber < number) {
				System.out.println("��µ�����"+guessNumber+"С��");
			}else {
				System.out.println("��ϲ��,������");
				break;
			}
		}
	}
}
