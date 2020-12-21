package Second;

public class constant {
	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final float PI = 3.14f;
		
		final int STUDENT_NUM = 31;
		
		int num = 0;
		if ( num == 30) {}
		
		System.out.println(STUDENT_NUM);
		
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum);
		float fNum = 0.9F;
		
		int num1 = (int)dNum + (int)fNum;
		// 3 + 0 = 3
		int num2 = (int)(dNum + fNum);
		// 3 + 1 = 4
		System.out.println(num1);
		System.out.println(num2);
	}
}
