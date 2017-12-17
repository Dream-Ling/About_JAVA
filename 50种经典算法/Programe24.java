import java.util.Scanner;

//题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
public class Programe24 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入一个正整数：");
//		long num = sc.nextLong();
//		String ss = Long.toString(num);
//		char[] ch = ss.toCharArray();
//		int j = ch.length;
//		System.out.println(num + "是一个" + j + "位数");
//		System.out.println("按逆序输出：");
//		for (int i = j - 1; i >= 0; i--) {
//			System.out.print(ch[i]);
//		}
//		sc.close();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个正整数：");
		long num = sc.nextLong();
		String ss = Long.toString(num);
		char[] ch = ss.toCharArray();
		int j = ch.length;
		System.out.println(num+"是一个"+j+"位数");
		System.out.println("逆序输出:");
		for(int i = j-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		sc.close();
	}
}
