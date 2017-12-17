import java.util.Scanner;

//题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，
//几个数相加有键盘控制。 
//1.程序分析：关键是计算出每一项的值
public class Programe8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个待运算数：");
		long a = sc.nextInt();
		System.out.println("请输入要运算的次数：");
		int n = sc.nextInt();
		int i = 0;
		int sum = 0;
		long b = 0;
		while (i < n) {
			b+=a;
			sum+=b;
			a=a*10;
			++i;
		}
		System.out.println(sum);
		sc.close();
	}
}
