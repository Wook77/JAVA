import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] Score = new int[n][n];
		int x, y = 0;

		int number = 1, f = 0;

		while (number <= n * n) {

			for (x = f; x < n - f; x++) { // ��
				Score[f][x] = number++;
			}

			int a = f + 1; // ������
			for (y = a; y < n - f; y++) {
				Score[y][n - f - 1] = number++;
			}

			a = n - f - 2; // �Ʒ�
			for (x = a; x >= f; x--) {
				Score[n - f - 1][x] = number++;
			}

			a = n - f - 2; // ����
			for (y = a; y > f; y--) {
				Score[y][f] = number++;
			}

			f += 1;
		}

		for (y = 0; y < n; y++) { // ���
			for (x = 0; x < n; x++) {
				System.out.print(Score[y][x] + " ");
			}
			System.out.println();
		}

	}
}
