package com.itheima_02;
/*
 * дһ������������һ������(����1)���ڿ���̨��ӡ1�������ݵ�ֵ
 */
public class MethodTest {
	public static void main(String[] args) {
		//���÷���
		printNumber(3);
		System.out.println("------------");
		printNumber(10);
	}
	
	/*
	 * дһ������������һ������(����1)���ڿ���̨��ӡ1�������ݵ�ֵ
	 * 
	 * ������ȷ��
	 * 		����ֵ���ͣ�void
	 * 		�����б�int n
	 */
	public static void printNumber(int n) {
		
		for(int x=1; x<=n; x++) {
			System.out.println(x);
		}
	}
}
