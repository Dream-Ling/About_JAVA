import java.util.Scanner;

//��Ŀ������һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ����� 
//1.�������������while���,����Ϊ������ַ���Ϊ'\n'. 
public class Programe7_1 {
	public static void main(String[] args) {
		char[] ch = null;
		Scanner sc = new Scanner(System.in);
		String str = null;
		System.out.println("�����������ַ�����");
		str = sc.nextLine();
		int shuzi=0;
		int zimu = 0;
		int kongge = 0;
		int qita = 0;
		ch = str.toCharArray();
		System.out.println("��������ַ�Ϊ��"+str.length());
		int i = 0;
		while(i<ch.length) {
			if(ch[i]>='0'&&ch[i]<='9') {
				shuzi++;
			}
			else if((ch[i]>='a'&& ch[i]<='z')||(ch[i]>='A' && ch[i]<='Z')) {
				zimu++;
			}
			else if(ch[i] == ' ') {
				kongge++;
			}
			else {
				qita++;
			}
			i++;
		}
		System.out.println("������ַ��������У�"+shuzi+"������ĸ�У�"+zimu+"�����ո��У�"+kongge+"���������У�"+qita+"��");
		sc.close();
		
	}
}