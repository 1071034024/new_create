package ceshi;

/*1.���巽��public static boolean isSXH(int num) 
����:�ж�����num�Ƿ���ˮ�ɻ���,����Ƿ���true,������Ƿ���false 
2.����1�ж���ķ���ʵ���ж������Ƿ�Ϊˮ�ɻ���,�ڿ���̨2��һ��������е�ˮ�ɻ���������ӡˮ�ɻ����ܸ�����*/
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
		System.out.println("ˮ�ɻ��ܸ���Ϊ:" + count);
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