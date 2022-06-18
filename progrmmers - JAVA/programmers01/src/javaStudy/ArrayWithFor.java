package javaStudy01;

public class ArrayWithFor {

	public static void main(String[] args) {
		int[] iarray = new int[100];
		iarray[0] = 1;
		iarray[0] = 2;
		
		for(int i = 0; i<(iarray.length); i++) {
			iarray[i] = i+1;
			System.out.println(i);
		}
		
		int sum = 0;
		
		for(int i= 0; i< iarray.length; i++) {
			sum += iarray[i];
		}
		System.out.println("sum = " + sum);
		
	}
}
