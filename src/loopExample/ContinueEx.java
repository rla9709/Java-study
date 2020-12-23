package loopExample;

public class ContinueEx {

	public static void main(String[] args) {
		int all = 0;
		int i;
		for(i = 0; i < 101; i++) {
			if((i % 2) == 0) {
				continue;
			} all += i;
			System.out.println(all);
		}

	}

}
