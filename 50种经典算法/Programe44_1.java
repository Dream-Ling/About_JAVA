import java.util.Scanner;

public class Programe44_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n;
		do {
			System.out.print("������һ�����ڵ���6��ż����");
			n = s.nextInt();
		} while (n < 6 || n % 2 != 0); // �ж������Ƿ���>=6ż��,����,��������
		for (int i = 3; i <= n / 2; i += 2) {
			if (fun(i) && fun(n - i)) {
				System.out.println(n + " = " + i + " + " + (n - i));
			} // ������п��ܵ�������
		}
		s.close();
	}

	static boolean fun(int a) { // �ж��Ƿ��������ĺ���
		boolean flag = false;
		if (a == 3) {
			flag = true;
			return (flag);
		}
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				flag = false;
				break;
			} else
				flag = true;
		}
		return (flag);
	}
}
