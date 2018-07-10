package ceshi;

/*1.定义方法public static boolean isSXH(int num) 
功能:判断数字num是否是水仙花数,如果是返回true,如果不是返回false 
2.借助1中定义的方法实现判断数据是否为水仙花数,在控制台2个一行输出所有的水仙花数，最后打印水仙花的总个数。*/
public class ceShi01 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 100; i <1000; i++) {
			boolean sxh = isSXH(i);
			if (sxh) {
				System.out.print(i + " ");
				count++;
				if (count % 2 == 0) {
					System.out.println();
				}
			}

		}
		System.out.println("水仙花总个数为:" + count);
	}

	public static boolean isSXH(int num) {
		int ge = num % 10;
		int shi = num / 10 % 10;
		int bai = num / 10 / 10 % 10;
		if ((ge * ge * ge + shi * shi * shi + bai * bai * bai) == num) {
			return true;
		} else {
			return false;
		}
	}

}