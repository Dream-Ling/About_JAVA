/*
 * 案例1.判断一个数是不是2的N次幂
 * 
 * ----------方法1-------
 * while (n % 2 == 0) {
			n = n / 2;
		}
		if(n==1) {
			System.out.println("yse");
		}else {
			System.out.println("NO");
		}
		
 * ----------方法2-------
 * int n = 123;
 * for(;n%2==0;n=n/2){}
 * 	if(n==1) {
		System.out.println("yse");
	}else {
		System.out.println("NO");
	}
 * 
 * 案例2.字符串完成进制转换
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
