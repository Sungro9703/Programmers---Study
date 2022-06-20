package javaStudy03;

public class Myclass2 {
	//메소드 오버로딩 - 매개변수의 유형과 개수가 다르게 하여 같은 이름의 메소드를 여러개 가질 수 있게 함
	// 이름은 같지만 매개변수의 수, 타입이 다른 메소드
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int plus(int x, int y, int z) {
		return x + y + z;
	}
	
	public String plus(String x, String y) {
		return x + y;
	}
}
