package javaStudy01;

public class ArrayExam {

	public static void main(String[] args) {
		//1차원 배열
		int[] array1 = new int[100];
		
		array1[0] = 50;
		array1[10] = 100;
		
		//생성과 함께 초기화
		int[] array2 = new int[] {1,2,3,4};
		
		int [] array3 = {1,2,3,4};
		
		System.out.println(array3[3]);
		int value = array3[0];
		
		System.out.println(value);
	}
}
