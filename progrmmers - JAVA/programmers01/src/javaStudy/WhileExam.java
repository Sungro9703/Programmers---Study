package javaStudy;

public class WhileExam {

	public static void main(String[] args) {
		//while
		
		// i가 10보다 작을 동안 i 출력
		int i = 0;
		
		while(i<10) {
			System.out.println(i);
			i++;
		}

		
		// 1부터 100까지의 합
		int total = 0;
		int j = 1;
		while(j <= 100) {
			total += j;
			j++;
		}
		System.out.println(total);
	}

}
