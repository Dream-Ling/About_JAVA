import java.util.Scanner;

//������6�� 
//��Ŀ����������������m��n���������Լ������С��������
//1.�������������շ������ 
public class Programe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������һ��������");
		Scanner print = new Scanner(System.in);
		int m1 = print.nextInt();
		System.out.println("������ڶ���������");
		int m2 = print.nextInt();
		int max=m1;
		int min=m1;
		max = m1<m2?m2:m1;
		min = m1>m2?m2:m1;
		//�����Լ��
		for(int i=min;i>=1;i--)
		{
			if(m1%i==0 && m2%i==0){
				System.out.println(m1+"��"+m2+"���Լ��Ϊ��"+i);
				break;
			}
		}
		//����С������
		for(int j = max; j < m1*m2; j++){
			if(j%m1==0 && j%m2==0) {
				System.out.println(m1+"��"+m2+"��С������Ϊ��"+j);
				break;
			}
		}	
		
		print.close();
		print.close();
	}

}
