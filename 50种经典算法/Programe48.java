import java.util.Scanner;

//题目：某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：每位数字
//都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。 
public class Programe48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// System.out.println("请输入一个四位数：");
		int num = 0, temp;
		do {
			System.out.println("请输入一个四位数：");
			num = sc.nextInt();
		} while (num < 1000 || num > 9999);
		int a[] = new int[4];
		a[0] = num % 1000; // 取千位的数字
		a[1] = (num / 100) % 10; // 取百位的数字
		a[2] = (num / 10) % 10; // 取十位的数字
		a[3] = num % 10; // 取个位的数字
		for (int i = 0; i < 4; i++) {
			a[i] += 5;
			a[i] %= 10;
		}
		for (int i = 0; i <= 1; i++) {
			temp = a[i];
			a[i] = a[3 - i];
			a[3 - i] = temp;
		}
		System.out.print("加密后的数字为：");
		for (int i = 0; i < 4; i++) {
			System.out.print(a[i]);
		}
	}

}
