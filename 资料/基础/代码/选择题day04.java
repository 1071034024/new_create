
2.�����������ִ�к�i��ֵ��(D  )�� (2��)
	int i=16; 
	do{
	i/=2;
	} while(i>3);
	A��16
	B��8
	C��4
	D��2

3.����ѡ�������ȷ����һ������Ϊ3��һά������� ( A  )(2��)
	A��
	new int[3]
	B��
	new int[3]{}
	C��
	new int[][3]
	D��
	���ϴ𰸶�����
4.���¹��ڱ���˵��������� (   C )(2��)
	A��
	������������һ����Ч�ı�ʾ��
	B��
	���������ȳ�ʼ������ʹ��
	C��
	����һ�������壬�ڳ����е��κ�λ�ö����Ա�����
	D��
	�ڳ����У����Խ�һ��char���͵�ֵ��ֵ��һ��int���͵ı���������Ҫ��������

5.�������ִ�еĽ����(   A ) (2��)
	class  Test{
		public  static  void  main(String[] args){
		  System.out.println(����+��a��+1); 
		}
	}
	A��
	98
	B��
	a1
	C��
	971
	D��
	197
7.���������ִ�н�����sum���һ�µ�ѡ���ǣ� B  ��(2��)
	int i=1;
	int sum=0;
	while(i<=100){
	  if(i%2==0){
	  	sum=sum+i;
	}
	  i++;
	}
	A��
	for (int x =1; x<=100;x++){ sum=sum+x;}
	B��
	for (int x =0; x<=100;x+=2){ sum=sum+x;}
	C��
	for (int x =1; x<=100;x+=2){ sum=sum+x;}
	D��
	����ȫ��
8.�����ĸ�����java�еĹؼ��֣�  C ��(2��)
	A��
	public
	B��
	true
	C��
	main
	D��
	class

10.�������ִ�еĽ���ǣ�D ��(2��)
	int x = 1,y = 1;
	if(x++==2 & ++y==2){
	 	x=7;
	}
	System.out.println("x="+x+"  ,  y="+y);
	A��
	x=1 y=2
	B��
	x=7 y=1
	C��
	x=7 y=2
	D��
	x=2 y=2
12.�Ķ��������Σ�ִ�н����ȷ��˵����( C   )(2��)
	public class Demo{
	����public static void main (String[] args){
	  	int[] arr = new int[10];
	���� 	System.out.println(arr[1]);
	����}
	}
	A��
	����ʱ����������
	B��
	����ʱ��ȷ������ʱ����������
	C��
	�����
	D��
	�����
13. ����java���룬���£��������У�����ǣ� A  ��(2��)
	public static void main(String[] args){
	 boolean flag;
	 System.out.println(��flag��+flag); 
	}
	A��
	�������
	B��
	����ͨ��������������ʱ����
	C��
	�������У����flag=false
	D��
	�������У����flag=
14. �����������к�,�����ȷ���ǣ�(  B )(2��)
	int a=1,b=2;
	int c=(a+b>3 a++:++b);
	A��
	a=2,b=3
	B��
	a=1,b=3
	C��
	a=1,b=2
	D��
	c=2
15. �����������͵��ļ�������java����������� ( D  )(2��)
	A��
	.java
	B��
	.jre
	C��
	.exe
	D��
	.class

18. ����ѡ��ṹ�����ĸ�˵����ȷ��B��(2��)
	A��
	if���� else������ɶԳ���
	B��
	if������û��else����Ӧ
	C��
	switch�ṹ��ÿ��case����б�����break���
	D��
	switch�ṹ�б�����default���
	19. ����main����˵��������ǣ�B��(2��)
	A��
	main������java����ִ�е����
	B��
	main�����ķ�����������Ҫ��һ�д���
	C��
	main���붨����һ������
	D��
	main�����Ķ����ʽΪ��public static void main(String[] args){}
20. �������ִ�еĽ���ǣ� C��(2��)
	boolean b=true;
	if(b=false){
	 System.out.println("a");
	}else if(b){
	 System.out.println("b"); 
	}else if(!b){
	 System.out.println("c");
	}else{
	 System.out.println("d");
	}
	A��
	a
	B��
	b
	C��
	c
	D��
	d
21. Ӧ�ó����main��������������䣬��ִ�к�����Ľ���� ( B )(2��)
	int[] x = {125,21,5,168,98};
	int max = x[0];
	for (int i=1; i<x.length; i++){
	  if(x[i] < max)
	  max = x[i];
	}
	System.out.println(max);
	A��

	125
	B��
	5
	C��
	168
	D��
	98
22. �������ִ�еĽ���ǣ�C��(2��)
	int i = 100;
	while(true){
	 if (i++ > 100){
	  break;
	 }
	System.out.println(i);
	}
	A��
	100
	B��
	101
	C��
	102
	D��
	����

24. ���ʽ5/2����������(  A)(2��)
	A��
	2
	B��
	2.0
	C��
	1
	D��
	1.0

25. �����ĸ����ʽ���õõ�x��y�������еĽϴ�ֵ ( B )(2��)
	A��
	x>y?y:x
	B��
	x<y?y:x
	C��
	x>y?(x+y):(x-y)
	D��
	x==y y:x;
26. �������ִ�еĽ��(2��)
	for(int  i=1;i<=10;i++){
	 	if (i%3==0){
	  	continue;
	 	}
	System.out.println(��java�����ࡱ);
	}
	����Ļ�ϴ�ӡ���Ρ�java�����ࡱ (C  )
	A��
	5
	B��
	6
	C��
	7
	D��
	8
27. ��������ĸ��������ȷ��( C)(2��)
	A��
	byte a=0,b=3; byte c =a+b;
	B��
	short s =23; s=s+12;
	C��
	short s=23; s+=12;
	D��
	float f = 23+23.23;
28. �������ִ�еĽ���ǣ�D��(2��)
	int x=2,y=3;
	switch(x){
	 default:
	  y++;
	 case 3:
	  y++;
	 case 4:
	  y++;
	}
	System.out.println("y="+y);
	A��
	3
	B��
	4
	C��
	5
	D��
	6

29. �������Java���Կ�ƽ̨˵���������(C)(2��)
	A��
	java���Ա�д�ĳ���һ�α���󣬿����ڶ��ϵͳƽ̨�����С�
	B��
	java���Կ�ƽ̨������java�����
	C��
	java��ƽ̨��java�����Ҳ�ǿ�ƽ̨�ģ���ͬϵͳƽ̨ʹ����ͬ��java�������
	D��
	ԭ����java����ͨ��java������ڲ�ͬϵͳƽ̨�����У�ֻҪ��ϵͳ���԰�װ��Ӧ��java���������ϵͳ�Ϳ�������java����
30. ����˵����ȷ����(B��(2��)
	A��
	JVM����Java�����������java�������
	B��
	JRE����java���л���������java����������еĹ��߻���
	C��
	JDK����java����������javac�����е�һ������
	D��
	���ܷ�Χ��JDK > JVM > JRE
	
��ѡ�� ��10�����֣�40��

31. �����ĸ������Ǵ���ģ�ACD��(4��)
	A��
	float f = 1.1;
	B��
	int I = 10;
	C��
	int other = (int) true;
	D��
	double 3d = 3.3d;//���������ֲ��ܿ�ͷ

33. ���������������ȷ˵���ǣ�BC��(4��)
	A
	���������ֺ�Ӣ��������ĸ��ɣ��ҿ�����������
	B��
	����Ҫ��������֪��
	C��
	������ɶ��������ɣ�ÿ����������ĸ��д
	D��
	������Java�Ѿ�������Ĺؼ���

34.
	forѭ����ʽ���£�
	for(���ʽ1;���ʽ2;���ʽ3){
	 //code
	}
	��������������ǣ�AC��(4��)
	A��
	���ʽ1���Ĵ���ᱻִ�ж��
	B��
	���ʽ1�����Զ������
	C��
	���ʽ3���ھ���ѭ���Ƿ�Ӧ�ý���
	D��
	���ʽ2��ֵ�������������ͣ�Ҳ������boolean����
35. ������Щ�ǺϷ��ı�ʾ����BC��(4��)
	A��
	2variable
	B��
	variable2
	C��
	what$
	D��
	_3_
36. �����˵����ȷ����( A C)(4��)
	A��
	byte ,short,char �������Ϳ����Զ�ת��Ϊint
	B��
	float �������Ϳ����Զ�ת��Ϊlong��
	C��
	��java������Ĭ��С��Ϊdouble
	D��
	byte a=23; byte b=12; a+b�Ľ��Ϊbyte����

38. ���ж��� float x=3.5f, y=4.6f, z=5.7f; �����µı��ʽ�У�ֵΪfalse����( ABC)(4��)
	A��
	x > y || x > z
	B��
	x < y & ! ( x < z )
	C��
	z > ( y + x )
	D��
	x != y
39.��������ĸ��������ȷ��( AD)(4��)
	A��
	short s=23; s+=12;
	B��
	float f = 23+23.23;
	C��
	short s =23; s=s+12;
	D��
	byte b=10;b++;
