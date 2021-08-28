import java.util.Scanner;
public class B10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int i,j,g = 0;
		int k = (n*2-1);
		
		
		
		if(m==1) {
				for(i=1; i<=n; i++) {
					
					for(j=1; j<=i; j++) {
						
						System.out.print("*");
					}
			
					System.out.println();
				}
			}
			
		
		if(m==2) {
				for(i=1; i<=n; i++) {		
					
					for (j=n; j>=i; j--) {
						
						System.out.print("*");
					}
					System.out.println();
				}
		}
		
		if(m==3) {
			
			for (i = 1; i<=k; i+=2) {
				
					for (g = 1; g<=(k-i)/2; g++)
						System.out.print(" ");	
				
						for (j = 1; j<=i; j++) {
								System.out.print("*");
						}
						System.out.println();
			}
		}
		
	}

}
