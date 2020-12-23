package loopExample;

public class breakEx {
	public static void main(String[] args) {
	
	//홀수만출력하기
	for(int i = 0;i < 300; i++) {
			if((i % 2 == 0)) {
				continue;
				}
			System.out.println(i);
		}

	}
}
