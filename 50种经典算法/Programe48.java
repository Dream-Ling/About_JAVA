import java.util.Scanner;

//��Ŀ��ĳ����˾���ù��õ绰�������ݣ���������λ���������ڴ��ݹ������Ǽ��ܵģ����ܹ������£�ÿλ����
//������5,Ȼ���úͳ���10��������������֣��ٽ���һλ�͵���λ�������ڶ�λ�͵���λ������ 
public class Programe48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// System.out.println("������һ����λ����");
		int num = 0, temp;
		do {
			System.out.println("������һ����λ����");
			num = sc.nextInt();
		} while (num < 1000 || num > 9999);
		int a[] = new int[4];
		a[0] = num % 1000; // ȡǧλ������
		a[1] = (num / 100) % 10; // ȡ��λ������
		a[2] = (num / 10) % 10; // ȡʮλ������
		a[3] = num % 10; // ȡ��λ������
		for (int i = 0; i < 4; i++) {
			a[i] += 5;
			a[i] %= 10;
		}
		for (int i = 0; i <= 1; i++) {
			temp = a[i];
			a[i] = a[3 - i];
			a[3 - i] = temp;
		}
		System.out.print("���ܺ������Ϊ��");
		for (int i = 0; i < 4; i++) {
			System.out.print(a[i]);
		}
	}

}
