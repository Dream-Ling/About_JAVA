import java.util.Scanner;

public class Programe6_1 {
	public static void main(String[] args) {
		int a, b, m;
		Scanner s = new Scanner(System.in);
		System.out.print("����һ�������� ");
		a = s.nextInt();
		System.out.print("�ټ���һ�������� ");
		b = s.nextInt();
		deffe cd = new deffe();
		m = cd.deff(a, b);
		int n = a * b / m;
		System.out.println("���Լ��: " + m);
		System.out.println("��С������: " + n);
		s.close();
	}
}

class deffe {
	public int deff(int x, int y) {
		int t;
		if (x < y) {
			t = x;
			x = y;
			y = t;
		}
		while (y != 0) {
			if (x == y)
				return x;
			else {
				int k = x % y;
				x = y;
				y = k;
			}
		}
		return x;
	}
}
