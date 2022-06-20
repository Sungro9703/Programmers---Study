package javaStudy03;

public class MethodOverloadExam {
	//메소드 오버로딩 - 매개변수의 유형과 개수가 다르게 하여 같은 이름의 메소드를 여러개 가질 수 있게 함
	
	public static void main(String[] args) {
		Myclass2 m = new Myclass2();
		
		System.out.println(m.plus(4, 5));
		
		System.out.println(m.plus(4, 6, 7));
		
		System.out.println(m.plus("hello", " world"));
	}
}
