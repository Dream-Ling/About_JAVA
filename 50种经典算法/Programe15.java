import java.util.Scanner;

//题目：输入三个整数x,y,z，请把这三个数由小到大输出。 
//1.程序分析：我们想办法把最小的数放到x上，先将x与y进行比较，如果x>y则将x与y的值进行交换，然后再用x
//与z进行比较，如果x>z则将x与z的值进行交换，这样能使x最小。
public class Programe15 {
	public static void main(String[] args) {
		inputt jiao = new inputt();
		System.out.println("请输入第一个数：");
		int one = jiao.input();
		System.out.println("请输入第二个数：");
		int two = jiao.input();
		System.out.println("请输入第三个数：");
		int three = jiao.input();
//		jiaohuan huan = new jiaohuan();
//		huan.jiao(one, two);
//		huan.jiao(one, three);
//		huan.jiao(two, three);
		if(one>two) {
			int temp = one;
			one = two;
			two = temp;
		}
		if(one>three) {
			int temp = one;
			one = three;
			three = temp;
		}
		if(two>three) {
			int temp = two;
			two = three;
			three = temp;
		}
		
		System.out.println(one + " " + two + " " + three);
	}
} 
class inputt {
	public int input() {
		int value = 0;
		Scanner s = new Scanner(System.in);
		value = s.nextInt();
		return value;

	}
}
//class jiaohuan{
//	public void jiao(int a, int b) {
//		if(a>b) {
//			int temp = a;
//			a = b;
//			b = temp;
//		}
//	}
//}
