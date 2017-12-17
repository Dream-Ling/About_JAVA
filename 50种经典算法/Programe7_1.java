import java.util.Scanner;

//题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。 
//1.程序分析：利用while语句,条件为输入的字符不为'\n'. 
public class Programe7_1 {
	public static void main(String[] args) {
		char[] ch = null;
		Scanner sc = new Scanner(System.in);
		String str = null;
		System.out.println("请输入任意字符串：");
		str = sc.nextLine();
		int shuzi=0;
		int zimu = 0;
		int kongge = 0;
		int qita = 0;
		ch = str.toCharArray();
		System.out.println("你输入的字符为："+str.length());
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
		System.out.println("输入的字符中数字有："+shuzi+"个，字母有："+zimu+"，个空格有："+kongge+"个，其他有："+qita+"个");
		sc.close();
		
	}
}