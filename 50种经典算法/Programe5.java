import java.util.Scanner;

//������5�� 
//��Ŀ�����������������Ƕ������ɴ��⣺ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60������
//����C��ʾ�� 
//1.���������(a>b)?a:b��������������Ļ������ӡ�
public class Programe5 {
	public static void main(String[] args) {
		int x;
		char grade;
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���� ���ɼ���");
		x = sc.nextInt();
		if (x > 100 || x < 0) {
			System.out.println("����ɼ�����");
		} else {
			grade = x >= 90 ? 'A' : x >= 60 ? 'B' : 'C';
			sc.close();
		}
	}

}
