import java.util.Scanner;

//��Ŀ����дһ������������nΪż��ʱ�����ú�����1/2+1/4+...+1/n,������nΪ����ʱ�����ú���
//1/1+1/3+...+1/n(����ָ�뺯��) 
public class Programe39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int num = sc.nextInt();
		fun ff = new fun();
		System.out.println("��Ϊ��"+ff.sum(num));
		sc.close();
	}

}
class fun{
	public double sum(int n) {
		double su=0;
		if(n%2==0) {
			for(int i=2;i<=n;i+=2) {
				su +=(double)1/i;
			}
		}else {
			for(int i=1;i<=n;i+=2) {
				su +=(double)1/i;
			}
		}
		return su;
	}
}