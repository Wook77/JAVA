package testpjt;
import java.util.Scanner;

public class TestB9 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int Score[][] = new int [n][n];
	int x, y, z;
	int number =1 , k = 1, p = 0;


		for (z=0; z<n; z++) {							//앞쪽 삼각형
			
			if(z%2 == 0) {
				for(y=0,x=p; x>=0; y++,x--) {
					Score[y][x] = number++;
				}
				p+=2;
			} else {
				
				int a = k;
				for(y=a,x=0; y>=0; y--,x++) {
					Score[y][x] = number++;
				}
				k+=2;
			}  
			
		}
		
		k = 1;
//		boolean isReverse = (n % 2 != 0) ? true : false;
		boolean isReverse = (n % 2 == 0) ? false : true;
		for (z=0; z<n; z++) {						//뒤쪽 삼각형
			if(isReverse) {
				for (y=n-1,x=k; x<n; x++,y--) {
					Score[y][x] = number++;
				}
				
			} else {
				for (x=n-1,y=k; y<=n-1; x--,y++) {
					Score[y][x] = number++;
				}
			}
			k++;
			isReverse = !isReverse;
		}
		
		
		
		

		for (y = 0; y < n; y++) {			 // 출력
			for (x = 0; x < n; x++) {
				System.out.print(Score[y][x] + " ");
			}
			System.out.println();
		}

	}
}


