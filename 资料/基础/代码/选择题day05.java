1.下面关于void的含义说法正确的是：（A  ）(2分)
	A、
	方法没有返回值
	B、
	方法体为空
	C、
	没有意义
	D、
	定义方法时必须使用

6.下面关于java中方法，描述错误的是( C  )(2分)
	A、
	定义一个方法时,如果该方法没有返回值,应该写void
	B、
	定义一个方法之前要明确该方法需要的参数和返回值类型
	C、方法可以提高代码复用性，提高程序运行的效率
	D、
	方法只有调用才会被执行
	7.和下面代码执行结束后，sum结果一致的选项是（ B  ）(2分)
	int i=1;
	int sum=0;
	while(i<=100){
	  if(i%2==0){
	  	sum=sum+i;
	}
	  i++;
	}
	A、
	for (int x =1; x<=100;x++){ sum=sum+x;}
	B、
	for (int x =0; x<=100;x+=2){ sum=sum+x;}
	C、
	for (int x =1; x<=100;x+=2){ sum=sum+x;}
	D、
	上述全对

9. 类中某方法定义如下：
	public  static double fun(int a,int b){   
		return a*1.0/b;  
	} 
	同一类内其它方法调用该方法的正确方式是：( A   )(2分)
	A、
	double a = fun(1,2);
	B、
	double a = fun(1.0,2.0);
	C、
	int x = fun(1,2);
	D、
	int x = fun(1.0,2.0);

11. 给定java代码，如下：
	public byte count(byte b1, byte b2){
	 return ____;
	}
	要使这段代码能够编译成功，横线处可以填入(A    )(2分)
	A、
	(byte)(b1-b2)
	B、
	b1-b2
	C、
	(byte)b1+b2
	D、
	(byte)b1/b2




16. 同一类中有两个以上方法同名称方法重载，Java语言规定(B  )(2分)
	A、
	不允许重载
	B、
	重载方法的参数列表必须不同
	C、
	重载方法的返回值类型必须不同
	D、
	重载方法的参数列表和返回值类型必须都不同。
	17.下面哪个关键字可以定义一个类（B）(2分)
	A、
	interface
	B、
	class
	C、
	extends
	D、
	implements




23. 以下关于方法的参数列表说法错误的是 ( D  )(2分)
	A、
	参数列表是用来定义调用该方法时必须要传入的参数.
	B、
	参数列表中的参数称为形式参数.
	C、
	调用该方法时,传入的参数称为实际参数.
	D、
	如果一个方法的形式参数全是基本数据类型的.该方法运行结束后会影响调用方法时传入的实际参数.







多选题 共10题满分：40分


32. 下面关于return语句说法正确的是：（CD）(4分)
	A、
	只能让方法返回数值
	B、
	方法都必须显式使用该关键字
	C、
	方法中可以有多句return
	D、
	可以用来返回数值以外的类型



37. 下列函数中能和函数int max(int  a,  int  b, double  c)构成重载关系的是(B C)(4分)
	A、
	double max(int a, int b, double c)
	B、
	void max(int a, double c, int b)
	C、
	int max(double a, int b)
	D、
	int max(int x, int y, double z)

40. 下列方法定义中，正确的是( CD  )(4分)
	A、
	int x( ){ return true; }
	B、
	void x( ){ return true; }
	C、
	int x( ){ char ch='a'; return (int)ch; }
	D、
	int x( int a, int b){ return a+b; }