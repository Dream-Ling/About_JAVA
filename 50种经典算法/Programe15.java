import java.util.Scanner;

//��Ŀ��������������x,y,z���������������С��������� 
//1.���������������취����С�����ŵ�x�ϣ��Ƚ�x��y���бȽϣ����x>y��x��y��ֵ���н�����Ȼ������x
//��z���бȽϣ����x>z��x��z��ֵ���н�����������ʹx��С��
public class Programe15 {
	public static void main(String[] args) {
		inputt jiao = new inputt();
		System.out.println("�������һ������");
		int one = jiao.input();
		System.out.println("������ڶ�������");
		int two = jiao.input();
		System.out.println("���������������");
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
