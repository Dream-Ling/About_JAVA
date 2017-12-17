import java.util.Scanner;

//题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数 
public class Programe36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int num = sc.nextInt();
		System.out.println("请输入要向右移动的位数:");
		int m = sc.nextInt();
		String ss = Integer.toString(num);
		char[] ch = ss.toCharArray();
		int j = ch.length;
		for(int i = j-m;i<j;i++) {
			System.out.print(ch[i]);
		}
		for(int i = 0; i<j-m;i++) {
			System.out.print(ch[i]);
		}
		sc.close();		
	}
}
