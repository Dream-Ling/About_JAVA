import java.util.Scanner;

//��Ŀ����s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�����2+22+222+2222+22222(��ʱ����5�������)��
//����������м��̿��ơ� 
//1.����������ؼ��Ǽ����ÿһ���ֵ
public class Programe8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������������");
		long a = sc.nextInt();
		System.out.println("������Ҫ����Ĵ�����");
		int n = sc.nextInt();
		int i = 0;
		int sum = 0;
		long b = 0;
		while (i < n) {
			b+=a;
			sum+=b;
			a=a*10;
			++i;
		}
		System.out.println(sum);
		sc.close();
	}
}
