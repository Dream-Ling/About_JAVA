import java.util.Scanner;

//��Ŀ�������ַ������Ӵ����ֵĴ��� 
public class Programe49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ�����");
		String str1 = sc.nextLine();
		System.out.println("���������ַ�����");
		String str2 = sc.nextLine();
		int count=0;
		if(str1.equals("")||str2.equals("")) {
			System.out.println("��û�������ַ������ִ����޷��Ƚϣ�");
			System.exit(0);
		}
		else {
			for(int i = 0; i <str1.length()-str2.length();i++) {
				if(str2.equals(str1.substring(i, str2.length()+i))) {
					count++;
				}
				
			}
			System.out.println("�ִ����ַ����г����ˣ�"+count+"��");
		}
	}

}
