package javaStudy01;

public class ForExam {

	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i<=100; i++) {
//			if(i % 2 != 0) {
//				continue;			// 짝수만 더함
//			}
			total += i;
			if(i == 50) {			
				break;				//50까지의 합
			}
		}
		
		System.out.println(total);
	}

}
