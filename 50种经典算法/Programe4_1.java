import java.util.Scanner;

public class Programe4_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("�����һ��������:     ");
		int n = s.nextInt();
		int k = 2;
		System.out.print(n + "=");
		while (k <= n) {
			if (k == n) {
				System.out.println(n);
				break;
			} else if (n % k == 0) {
				System.out.print(k + "*");
				n = n / k;
			} else
				k++;
		}
		s.close();
	}
}
