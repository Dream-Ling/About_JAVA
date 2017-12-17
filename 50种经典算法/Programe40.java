import java.util.Scanner;

//ÌâÄ¿£º×Ö·û´®ÅÅĞò¡£ 
public class Programe40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputtt ipt = new inputtt();
		String str = ipt.inputt();
		char[] ch = str.toCharArray();
		int j = ch.length;
		System.out.println("ÅÅĞòÇ°£º");
		for (int i = 0; i < j; i++) {
			System.out.print(ch[i]);
		}
		for (int i = 1; i < j; i++) {
			for (int k = 0; k < j; k++) {
				if (ch[k] > ch[i]) {
					char temp = ch[k];
					ch[k] = ch[i];
					ch[i] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("ÅÅĞòºó£º");
		for (int i = 0; i < j; i++) {
			System.out.print(ch[i]);
		}
	}

}

class inputtt {
	public String inputt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈë×Ö·û´®£º");
		String str = sc.nextLine();
		return str;
	}
}