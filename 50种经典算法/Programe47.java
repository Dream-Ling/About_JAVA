import java.util.Scanner;

//��Ŀ����ȡ7������1��50��������ֵ��ÿ��ȡһ��ֵ�������ӡ����ֵ�����ģ��� 
public class Programe47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("������һ��1-50֮���������");
		int num;
		for(int i = 0; i < 7;i++) {
			System.out.println("������һ��1-50֮���������");
			num = sc.nextInt();
			
			for(int j = 0; j<num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
