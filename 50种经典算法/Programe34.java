import java.util.Scanner;

//��Ŀ������3����a,b,c������С˳������� 
public class Programe34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = sc.nextInt();
		System.out.println("������ڶ�������");
		int b = sc.nextInt();
		System.out.println("���������������");
		int c = sc.nextInt();
		if(a<b) {
			int temp = a;
			 a= b; 
			 b = temp;
		}
		if(a<c) {
			int temp = a;
			 a= c; 
			 c = temp;
		}
		if(b<c) {
			int temp = b;
			 b= c; 
			 c = temp;
		}
//		Sort so = new Sort();
//		so.sort(a, b);
//		so.sort(a, c);
//		so.sort(b, c);
		System.out.println(a + " " + b + " " + c);
		sc.close();
	}
}

//class Sort {
//	public void sort(int a, int b) {
//		if (a < b) {
//			a = a ^ b;
//			b = a ^ b;
//			a = a ^ b;
//		}
//	}
//}