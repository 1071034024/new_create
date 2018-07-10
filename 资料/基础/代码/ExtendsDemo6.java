package com.itheima_03;
/*
 * 继承中构造方法的执行顺序
 * 			在子父类中，创建子类对象，调用子类的构造方法，
 * 			在子类的构造方法的第一行代码如果没有调用父类的构造或者没有调用子类的其他构造，则默认调用父类无参构造
 * 为什么要调用父类构造？
 * 			因为需要给父类的成员变量初始化
 * 肯定会先把父类的构造执行完毕，在去执行子类构造中的其他代码
 * 
 * 我是父类无参构造 --- 我是子类有参构造 --- 我是子类无参构造
 */
public class ExtendsDemo6 {
	public static void main(String[] args) {
		//Die d = new Die();
		Zi6 z = new Zi6();
	}
}

class Die6 {
	public Die6() {
		System.out.println("我是父类无参构造");
	}
	
	public Die6(int num) {
		System.out.println("我是父类有参构造");
	}
}

class Zi6 extends Die6 {
	public Zi6() {
		//super(1);
		//super();
		
		this(1);//不会再调用父类的无参构造了
		
		System.out.println("我是子类无参构造");
	}
	
	public Zi6(int num) {
		//会默认调用父类无参构造
		System.out.println("我是子类有参构造");
	}
}