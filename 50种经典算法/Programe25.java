import java.util.Scanner;

//��Ŀ��һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧ   λ��ͬ�� 
public class Programe25 {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("������һ��λ��Ϊ��������������");
			long num = sc.nextLong();
			String ss = Long.toString(num);
			char[] ch = ss.toCharArray();
			int j = ch.length;
			boolean is = true;
			if (j % 2 == 0) {
				System.out.println("������ֵ��������������");
				continue;
			}
			for (int i = 0; i < j / 2; i++) {
				if(ch[i]!=ch[j-i-1]) {
					is = false;
				}
			}
			if(is==true) {
				System.out.println(num+"����һ��������");
			}
			else {
				System.out.println(num+"�ⲻ��һ��������");
			}
		}
	}
}
