package assignment;

public class OperationEx3 {
	public static void main(String[] args) {
		
		int num1 = 10;
		System.out.println(num1 += 1);
		//num1에 숫자 1을 더한값을 출력
		System.out.println(num1 %= 10);
		// 1에 10을 나눈뒤 나머지를 출력
		int num2 = 20;
		System.out.println(num2 -= 1);  // num2 = num2 - 1
		
		int num3 = (5 > 3)? 10:20;
		System.out.println(num3);
	}

}
