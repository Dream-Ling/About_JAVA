/*
 * ����1.�ж�һ�����ǲ���2��N����
 * 
 * ----------����1-------
 * while (n % 2 == 0) {
			n = n / 2;
		}
		if(n==1) {
			System.out.println("yse");
		}else {
			System.out.println("NO");
		}
		
 * ----------����2-------
 * int n = 123;
 * for(;n%2==0;n=n/2){}
 * 	if(n==1) {
		System.out.println("yse");
	}else {
		System.out.println("NO");
	}
 * 
 * ����2.�ַ�����ɽ���ת��
 * String s="";
 * int n = 10;
 * while(n!=0){
 * 		s=n%2+s;
 *		n = n/2;
 * }
 * Syso(s);

 * 
 * */
public class java003_02 {
	public static void main(String[] args) {
		// int n = 14;

		// while (n % 2 == 0) {
		// n = n / 2;
		// }
		// if(n==1) {
		// System.out.println("yse");
		// }else {
		// System.out.println("NO");
		// }

		String s = "";
		int n = 10;
		while (n != 0) {
			s = n % 2 + s;
			n = n / 2;
		}
		System.out.println(s);

	}
}
