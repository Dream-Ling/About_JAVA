import java.util.Scanner;

//������4�� 
//��Ŀ����һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5�� 
//�����������n���зֽ���������Ӧ���ҵ�һ����С������k��Ȼ������������ɣ� 
//(1)����������ǡ����n����˵���ֽ��������Ĺ����Ѿ���������ӡ�����ɡ� 
//(2)���n<>k����n�ܱ�k��������Ӧ��ӡ��k��ֵ������n����k����,��Ϊ�µ���������n,�ظ�ִ�е�һ���� 
//(3)���n���ܱ�k����������k+1��Ϊk��ֵ,�ظ�ִ�е�һ����
public class Programe4 {
	public static void main(String[] args) {
		Scanner print = new Scanner(System.in);
		System.out.println("������һ��������");
		int n = print.nextInt();
		System.out.print(n + "=");
		int i = 2;
		for (; i <= n; i++) {
			if (i == n) {
				System.out.println(n);
				break;
			} else if (n % i == 0) {
				System.out.print(i + "*");
				n = n / i;
			} else
				i++;
		}
		print.close();
	}
}
