import java.util.Scanner;

//��Ŀ��һ��ż�����ܱ�ʾΪ��������֮�͡� 
public class Programe44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n, i;
		do {
			System.out.print("������һ�����ڵ���6��ż����");
			n = s.nextInt();
		} while (n < 6 || n % 2 != 0); // �ж������Ƿ���>=6ż��,����,�������� fun
		funn fc = new funn();
		for (i = 2; i <= n / 2; i++) {
			if ((fc.fun1(i)) == 1 && (fc.fun1(n - i) == 1)) {
				int j = n - i;
				System.out.println(n + " = " + i + " + " + j);
			} // ������п��ܵ�������
		}
		s.close();
	}
}

class funn {
	public int fun1(int a) // �ж��Ƿ��������ĺ���
	{
		int i, flag = 0;
		if (a == 3) {
			flag = 1;
			return (flag);
		}
		for (i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				flag = 0;
				break;
			} else
				flag = 1;
		}
		return (flag); // ��������,����0,������,����1
	}

}
