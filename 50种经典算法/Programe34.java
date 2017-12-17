import java.util.Scanner;

//题目：输入3个数a,b,c，按大小顺序输出。 
public class Programe34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数：");
		int b = sc.nextInt();
		System.out.println("请输入第三个数：");
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