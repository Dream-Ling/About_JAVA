public class demo {
	public static void main(String[] args) {
		/*
		 * int i = 1; int j = 2; i = i + j; j = i - j; i = i - j;
		 * System.out.println(i+"-------------33----"+j);
		 * ////////////////////////////////////////////////////////
		 * 
		 * 
		 * //问题 求一个正整数的个位y int k = 123; int n = k % 10; System.out.println(n);
		 * /////////////////////////////////////////////////////////
		 * 
		 * 
		 * //问题 求一个正整数的十位？ int k = 123; int n = (k/10) % 10; System.out.println(n);
		 * boolean flag = 1 > 2; System.out.println(flag);
		 * /////////////////////////////////////
		 * 
		 * int n = 11; if(n%2 == 0) { System.out.println("偶数"); } else {
		 * System.out.println("奇数"); } //////////////////////////////////
		 * 
		 * 
		 * 
		 * //1~100和 int sum = 0; for (int i = 1; i <= 100; i++) {
		 * 
		 * sum = sum + i; } System.out.println(sum);
		 * ///////////////////////////////////////////////////
		 * 
		 * 
		 * //g.1-100 偶数 和 int sum = 0; for (int i = 1; i <= 100; i++) { if(i%2 == 0) {
		 * sum = sum + i; } } System.out.println(sum);
		 * 
		 * ///////////////////////////////////////////////////
		 * 
		 * //h.1-100 不能被3整除 和 int sum = 0; for (int i = 1; i <= 100; i++) { if(i%3 != 0)
		 * { sum = sum + i; } } System.out.println(sum);
		 * 
		 * ///////////////////////////////////////////////////
		 * 
		 * //i.斐波那契数列 1，1，2，3，5，8，13 int n1 = 1; int n2 = 1; int n3 = 0;
		 * System.out.print(n1 + " "); System.out.print(n2 + " "); for(int i = 2; i <
		 * 10; i++) { n3 = n1 + n2; System.out.print(n3+" "); n1 = n2; n2 = n3; } //素数
		 * 最大公约数 最小公倍数 /////////////////////////////////////////////////////
		 * 
		 * //问题1.找出两个数最大的数 int n1 = 1; int n2 = 2; int max = n1; if(max<n2) { max=n2; }
		 * System.out.println(max);
		 * /////////////////////////////////////////////////////
		 * 
		 * //问题2.找出三个数最大的数 int n1 = 1; int n2 = 2; int n3 = 3; int max = n1; if(max <
		 * n2) { max = n2; } if(max < n3) { max = n3; } System.out.println(max);
		 * /////////////////////////////////////////////////////
		 * 
		 * //问题3.求两个数的最大公约数 int n1 = 15; int n2 = 10; int min;
		 * 
		 * min=n1>n2?n2:n1; int zdgys=min; for(int i = min; i >= 1; i--) { if(n1%i==0 &&
		 * n2%i==0) { zdgys = i; break; } } System.out.println(zdgys);
		 * /////////////////////////////////////////////////////
		 * 
		 * //问题3.求两个数的最小公倍数 int n1 = 15; int n2 = 10; int max;
		 * 
		 * max=n1>n2?n1:n2; int zxgb=max; for(int i = max; i <= n1*n2; i++) { if(i%n1==0
		 * && i%n2==0) { zxgb = i; break; } } System.out.println(zxgb);
		 * /////////////////////////////////////////////////////
		 * 
		 * 
		 * //判断一个数是否为素数 Scanner input = new Scanner(System.in);
		 * System.out.println("请输入一个整数："); int n = input.nextInt(); for(int i=2; i<=n;
		 * i++) { if(n%i==0 && i!=n) { System.out.print(n+" 不是素数"); break; } else
		 * if(i==n) { System.out.println(n+" 是素数"); } }
		 * 
		 * /////////////////////////////////////////////////////
		 * 
		 * //判断一个数是不是完数 while(true) { Scanner input = new Scanner(System.in);
		 * System.out.println("请输入一个待查询整数"); int n = input.nextInt(); //6 28 496 int sum
		 * = 0; for(int i = 1; i < n; i++) { if(n%i==0){ sum = sum + i; } } if(sum==n) {
		 * System.out.println(n+"是一个完数"); } else { System.out.println(n+"不是一个完数"); }
		 * System.out.println("是否继续？（yes/no）"); Scanner str = new Scanner(System.in);
		 * String str1 = str.nextLine(); if(str1=="yes" || str1=="YES") continue; else
		 * if(str1 == "no" || str1=="NO") break;
		 * 
		 * } /////////////////////////////////////////////////////
		 * 
		 * 
		 * int count = 0; for (int i = 2; i < 200; i += 2) { boolean b = false; for (int
		 * j = 2; j <= Math.sqrt(i); j++) { if (i % j == 0) { b = false; break; } else {
		 * b = true; } } if (b == true) { count++; System.out.println(i); } }
		 * System.out.println("素数个数是: " + count);
		 * /////////////////////////////////////////////////////
		 */
		
	}
}
