import java.util.Scanner;

//��Ŀ�����������ڼ��ĵ�һ����ĸ���ж�һ�������ڼ��������һ����ĸһ��������� �жϵڶ�����ĸ�� ��һ mo  �ܶ� tu ���� we ���� th  ���� fr ���� sa ���� su
//1.�����������������ȽϺã������һ����ĸһ�������ж����������if����жϵڶ�����ĸ�� 
public class Programe26 {
	public static void main(String[] args) {
		getChar gc = new getChar();
		System.out.println("���������ڵĵ�һ����ĸ");
		char ch = gc.getCharr();
		switch (ch) {
		case 'M':
		case 'm':
			System.out.println("Monday");
			break;
		case 'W':
		case 'w':
			System.out.println("Wednesday");
			break;
		case 'F':
		case 'f':
			System.out.println("Friday");
			break;
		case 'T':
		case 't': {
			System.out.println("���������ڵĵڶ�����ĸ��");
			char ch2 = gc.getCharr();
			if (ch2 == 'U' || ch2 == 'u') {
				System.out.println("Tuesday");
			} else if (ch2 == 'H' || ch2 == 'h') {
				System.out.println("Thursday");
			} else {
				System.out.println("�޷�д�룡");
			}
		}
			;
			break;
		case 'S':
		case 's': {
			System.out.println("���������ڵĵڶ�����ĸ��");
			char ch2 = gc.getCharr();
			if (ch2 == 'U' || ch2 == 'u') {
				System.out.println("Sunday");
			} else if (ch2 == 'A' || ch2 == 'a') {
				System.out.println("Saturday");
			} else {
				System.out.println("�޷�д�룡");
			}
		}
			;
			break;
		default:
			System.out.println("�޷�д�룡");
		}

	}

}

class getChar {
	public char getCharr() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = str.charAt(0);
		if ((ch < 'A' || ch > 'Z')&&(ch < 'a' || ch > 'z')) {
			System.out.println("�����������������");
			ch = getCharr();
		}
		return ch;
	}
}