import java.util.Scanner;

//��Ŀ����n��������ʹ��ǰ�����˳�������m��λ�ã����m���������ǰ���m���� 
public class Programe36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������:");
		int num = sc.nextInt();
		System.out.println("������Ҫ�����ƶ���λ��:");
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
