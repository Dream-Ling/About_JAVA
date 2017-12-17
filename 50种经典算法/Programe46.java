import java.util.Scanner;

//题目：两个字符串连接程序
public class Programe46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个字符串：");
		String str1 = sc.nextLine();
		System.out.println("请输入第二个字符串：");
		String str2 = sc.nextLine();
		System.out.println("第一个字符串: "+str1);
		System.out.println("第二个字符串: "+str2);
		System.out.println("连接以后的字符串: "+str1+str2);
		sc.close();
	}

}
