package loopExample;

public class forEx {
		public static void main(String[] args) {
			int i;
			int j;
			for(i = 2; i <= 9; i++) {
				for (j = 1; j <= 9; j++) {
					System.out.println(i + "X" + j + "=" + i*j);
				}
			}
		}
	}
