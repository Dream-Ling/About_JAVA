import java.util.Scanner;

//��Ŀ���ж�һ�������ܱ�����9���� 
public class Programe45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����������");
		int num = sc.nextInt();
		int t = num;
		for(int i = 1;i<t;i++) {
			if(t%9==0) {
				count++;
				t=t/9;
			}
		}
		System.out.println(num+"�ܱ�9����"+count+"��");
		sc.close();
	}

}
