package work0530_Array;

public class ArrayEx3 {
	public static void main(String[] args) {
		int[] number = new int[10];
		for( int i= 0; i< number.length; i++) {
			number[i]= i;
			System.out.println(number[i]);
		}
		System.out.println();
		
		for( int i = 0; i< 100; i++) {
			int n = (int)(Math.random()*10);
			int temp = number[0];
			number[0] = number[n];
			number[n] = temp;
		}
		for(int i= 0; i< number.length; i++) {
			System.out.print(number[i]+" ");
		}
	}
}
