import java.util.Scanner;

//题目：写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。
public class Programe38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String str = sc.nextLine();
		System.out.println("字符串长度："+str.length());
		sc.close();
	}
}
