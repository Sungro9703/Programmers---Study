package javaStudy;

public class TernaryExam {

	public static void main(String[] args) {
		// 삼항 연산자
		//5가 4보다 크다면 ? 50 다르다면 40
		int b1 = (5 > 4) ? 50 : 40;
		System.out.println(b1);
		
		//if문과 비슷
		int b2 = 0;
		if(5 > 4) {
			b2 = 50;
		}else {
			b2 = 40;
		}
		System.out.println(b2);
	}
}
