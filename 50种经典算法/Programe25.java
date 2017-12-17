import java.util.Scanner;

//题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千   位相同。 
public class Programe25 {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入一个位数为奇数的正整数：");
			long num = sc.nextLong();
			String ss = Long.toString(num);
			char[] ch = ss.toCharArray();
			int j = ch.length;
			boolean is = true;
			if (j % 2 == 0) {
				System.out.println("输入数值错误，请重新输入");
				continue;
			}
			for (int i = 0; i < j / 2; i++) {
				if(ch[i]!=ch[j-i-1]) {
					is = false;
				}
			}
			if(is==true) {
				System.out.println(num+"这是一个回文数");
			}
			else {
				System.out.println(num+"这不是一个回文数");
			}
		}
	}
}
