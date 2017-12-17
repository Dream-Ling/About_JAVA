import java.util.Scanner;

//题目：计算字符串中子串出现的次数 
public class Programe49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String str1 = sc.nextLine();
		System.out.println("请输入子字符串：");
		String str2 = sc.nextLine();
		int count=0;
		if(str1.equals("")||str2.equals("")) {
			System.out.println("你没有输入字符串或字串，无法比较！");
			System.exit(0);
		}
		else {
			for(int i = 0; i <str1.length()-str2.length();i++) {
				if(str2.equals(str1.substring(i, str2.length()+i))) {
					count++;
				}
				
			}
			System.out.println("字串在字符串中出现了："+count+"次");
		}
	}

}
