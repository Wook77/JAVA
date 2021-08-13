

import java.util.Scanner;

public class TestB8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		char Score[][] = new char[n * 2 - 1][n * 2 - 1];
		int x, y;
		char number = 'A';
	
		int k = 0;
		int cnt=0;

		while (cnt <= ((n*2-1) * (n*2-1) / 2)) {

			int a = k;
			for (x = n - 1, y = a; x >= a; x--, y++) { 		// 1
				Score[y][x] = number++;
				if('['== number)
					number = 'A';
				cnt++;
				
				//System.out.print(y+ "/" + x+" ");
			}

			a = k + 1;
			for (x = a; x <= n - 1; x++, y++) {			 // 2
				Score[y][x] = number++;
				if('['== number)
					number = 'A';
				cnt++;
				
				
			}

			a = n * 2 - 3 - k;
			for (x = n, y = a; x <= n * 2 - 2 - k; x++, y--) { // 3
				Score[y][x] = number++;
				if('['== number)
					number = 'A';
				cnt++;
				
				
			}

			a = n * 2 - 3 - k; 								// 4
			for (x = a; x >= n; x--, y--) {
				Score[y][x] = number++;
				if('['== number)
					number = 'A';
				cnt++;
			}

			k++;

			
			
			
			if (y== n && x==n)
				break;
			  
		}

	
		
		for (y = 0; y < n * 2 - 1; y++) { 					// Ãâ·Â
			for (x = 0; x < n * 2 - 1; x++) {
				
				System.out.print(Score[y][x] + " ");
				
			}
			System.out.println();
		}

	}
}