import java.util.Scanner;

//��Ŀ����һ��������5λ����������Ҫ��һ�������Ǽ�λ�������������ӡ����λ���֡�
public class Programe24 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("������һ����������");
//		long num = sc.nextLong();
//		String ss = Long.toString(num);
//		char[] ch = ss.toCharArray();
//		int j = ch.length;
//		System.out.println(num + "��һ��" + j + "λ��");
//		System.out.println("�����������");
//		for (int i = j - 1; i >= 0; i--) {
//			System.out.print(ch[i]);
//		}
//		sc.close();
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����������");
		long num = sc.nextLong();
		String ss = Long.toString(num);
		char[] ch = ss.toCharArray();
		int j = ch.length;
		System.out.println(num+"��һ��"+j+"λ��");
		System.out.println("�������:");
		for(int i = j-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		sc.close();
	}
}
