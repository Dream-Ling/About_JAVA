public class demo {
	public static void main(String[] args) {
		/*
		 * int i = 1; int j = 2; i = i + j; j = i - j; i = i - j;
		 * System.out.println(i+"-------------33----"+j);
		 * ////////////////////////////////////////////////////////
		 * 
		 * 
		 * //���� ��һ���������ĸ�λy int k = 123; int n = k % 10; System.out.println(n);
		 * /////////////////////////////////////////////////////////
		 * 
		 * 
		 * //���� ��һ����������ʮλ�� int k = 123; int n = (k/10) % 10; System.out.println(n);
		 * boolean flag = 1 > 2; System.out.println(flag);
		 * /////////////////////////////////////
		 * 
		 * int n = 11; if(n%2 == 0) { System.out.println("ż��"); } else {
		 * System.out.println("����"); } //////////////////////////////////
		 * 
		 * 
		 * 
		 * //1~100�� int sum = 0; for (int i = 1; i <= 100; i++) {
		 * 
		 * sum = sum + i; } System.out.println(sum);
		 * ///////////////////////////////////////////////////
		 * 
		 * 
		 * //g.1-100 ż�� �� int sum = 0; for (int i = 1; i <= 100; i++) { if(i%2 == 0) {
		 * sum = sum + i; } } System.out.println(sum);
		 * 
		 * ///////////////////////////////////////////////////
		 * 
		 * //h.1-100 ���ܱ�3���� �� int sum = 0; for (int i = 1; i <= 100; i++) { if(i%3 != 0)
		 * { sum = sum + i; } } System.out.println(sum);
		 * 
		 * ///////////////////////////////////////////////////
		 * 
		 * //i.쳲��������� 1��1��2��3��5��8��13 int n1 = 1; int n2 = 1; int n3 = 0;
		 * System.out.print(n1 + " "); System.out.print(n2 + " "); for(int i = 2; i <
		 * 10; i++) { n3 = n1 + n2; System.out.print(n3+" "); n1 = n2; n2 = n3; } //����
		 * ���Լ�� ��С������ /////////////////////////////////////////////////////
		 * 
		 * //����1.�ҳ������������� int n1 = 1; int n2 = 2; int max = n1; if(max<n2) { max=n2; }
		 * System.out.println(max);
		 * /////////////////////////////////////////////////////
		 * 
		 * //����2.�ҳ������������� int n1 = 1; int n2 = 2; int n3 = 3; int max = n1; if(max <
		 * n2) { max = n2; } if(max < n3) { max = n3; } System.out.println(max);
		 * /////////////////////////////////////////////////////
		 * 
		 * //����3.�������������Լ�� int n1 = 15; int n2 = 10; int min;
		 * 
		 * min=n1>n2?n2:n1; int zdgys=min; for(int i = min; i >= 1; i--) { if(n1%i==0 &&
		 * n2%i==0) { zdgys = i; break; } } System.out.println(zdgys);
		 * /////////////////////////////////////////////////////
		 * 
		 * //����3.������������С������ int n1 = 15; int n2 = 10; int max;
		 * 
		 * max=n1>n2?n1:n2; int zxgb=max; for(int i = max; i <= n1*n2; i++) { if(i%n1==0
		 * && i%n2==0) { zxgb = i; break; } } System.out.println(zxgb);
		 * /////////////////////////////////////////////////////
		 * 
		 * 
		 * //�ж�һ�����Ƿ�Ϊ���� Scanner input = new Scanner(System.in);
		 * System.out.println("������һ��������"); int n = input.nextInt(); for(int i=2; i<=n;
		 * i++) { if(n%i==0 && i!=n) { System.out.print(n+" ��������"); break; } else
		 * if(i==n) { System.out.println(n+" ������"); } }
		 * 
		 * /////////////////////////////////////////////////////
		 * 
		 * //�ж�һ�����ǲ������� while(true) { Scanner input = new Scanner(System.in);
		 * System.out.println("������һ������ѯ����"); int n = input.nextInt(); //6 28 496 int sum
		 * = 0; for(int i = 1; i < n; i++) { if(n%i==0){ sum = sum + i; } } if(sum==n) {
		 * System.out.println(n+"��һ������"); } else { System.out.println(n+"����һ������"); }
		 * System.out.println("�Ƿ��������yes/no��"); Scanner str = new Scanner(System.in);
		 * String str1 = str.nextLine(); if(str1=="yes" || str1=="YES") continue; else
		 * if(str1 == "no" || str1=="NO") break;
		 * 
		 * } /////////////////////////////////////////////////////
		 * 
		 * 
		 * int count = 0; for (int i = 2; i < 200; i += 2) { boolean b = false; for (int
		 * j = 2; j <= Math.sqrt(i); j++) { if (i % j == 0) { b = false; break; } else {
		 * b = true; } } if (b == true) { count++; System.out.println(i); } }
		 * System.out.println("����������: " + count);
		 * /////////////////////////////////////////////////////
		 */
		
	}
}
