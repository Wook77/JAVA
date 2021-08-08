import java.util.Scanner;

public class ArrayTest1 {			// 배열 최댓값 최솟값 구하기
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();				
		
		int[] bear = new int[a];		
		
		int max = 0;
		int min = 0;
		
		for(int i=0; i<bear.length; i++) {
			bear[i] = sc.nextInt();
			
			if(i==0) {
				max = bear[0];
				min = bear[0];
			}
			
			
			
			if(bear[i]> max) {
				max = bear[i];
			} 
			
			if (bear[i]<min) {
				min = bear[i];
			}
		}
		System.out.print(min+" ");
		System.out.print(max);
		
	}
}
	
