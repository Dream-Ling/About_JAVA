import java.util.Scanner;

//题目：请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续 判断第二个字母。 周一 mo  周二 tu 周三 we 周四 th  周五 fr 周六 sa 周日 su
//1.程序分析：用情况语句比较好，如果第一个字母一样，则判断用情况语句或if语句判断第二个字母。 
public class Programe26 {
	public static void main(String[] args) {
		getChar gc = new getChar();
		System.out.println("请输入星期的第一个字母");
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
			System.out.println("请输入星期的第二个字母：");
			char ch2 = gc.getCharr();
			if (ch2 == 'U' || ch2 == 'u') {
				System.out.println("Tuesday");
			} else if (ch2 == 'H' || ch2 == 'h') {
				System.out.println("Thursday");
			} else {
				System.out.println("无法写入！");
			}
		}
			;
			break;
		case 'S':
		case 's': {
			System.out.println("请输入星期的第二个字母：");
			char ch2 = gc.getCharr();
			if (ch2 == 'U' || ch2 == 'u') {
				System.out.println("Sunday");
			} else if (ch2 == 'A' || ch2 == 'a') {
				System.out.println("Saturday");
			} else {
				System.out.println("无法写入！");
			}
		}
			;
			break;
		default:
			System.out.println("无法写入！");
		}

	}

}

class getChar {
	public char getCharr() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = str.charAt(0);
		if ((ch < 'A' || ch > 'Z')&&(ch < 'a' || ch > 'z')) {
			System.out.println("输入错误，请重新输入");
			ch = getCharr();
		}
		return ch;
	}
}