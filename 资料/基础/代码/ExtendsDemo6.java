package com.itheima_03;
/*
 * �̳��й��췽����ִ��˳��
 * 			���Ӹ����У�����������󣬵�������Ĺ��췽����
 * 			������Ĺ��췽���ĵ�һ�д������û�е��ø���Ĺ������û�е���������������죬��Ĭ�ϵ��ø����޲ι���
 * ΪʲôҪ���ø��๹�죿
 * 			��Ϊ��Ҫ������ĳ�Ա������ʼ��
 * �϶����ȰѸ���Ĺ���ִ����ϣ���ȥִ�����๹���е���������
 * 
 * ���Ǹ����޲ι��� --- ���������вι��� --- ���������޲ι���
 */
public class ExtendsDemo6 {
	public static void main(String[] args) {
		//Die d = new Die();
		Zi6 z = new Zi6();
	}
}

class Die6 {
	public Die6() {
		System.out.println("���Ǹ����޲ι���");
	}
	
	public Die6(int num) {
		System.out.println("���Ǹ����вι���");
	}
}

class Zi6 extends Die6 {
	public Zi6() {
		//super(1);
		//super();
		
		this(1);//�����ٵ��ø�����޲ι�����
		
		System.out.println("���������޲ι���");
	}
	
	public Zi6(int num) {
		//��Ĭ�ϵ��ø����޲ι���
		System.out.println("���������вι���");
	}
}