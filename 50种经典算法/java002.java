/*
 * �﷨�߼�
 * 		������������ + ����� + if + for
 * �����������߼����㷨    ��ϵ���̶�ģʽ��	--�ǳ�����
 * 
 * ���ʹ��
 * 
 * ----------------------------------------------
 * ����1.ʹ��ѭ�����1~100
 * 		a.ѭ���Ļ����ṹ		for(;���� true/false;){}
 * 		b.ѭ��ִ�еĹ���		for(1;2;3){����}	//1ִֻ��һ��
 * 		c.��Чʹ��ѭ��		�����  ��  ���ڣ�
 * 
 * for(int i = 1; i <= 100; i++){
 * 		System.out.println(i);
 * }
 * 
 * ����2.1-100 ż��
 * for(int i = 1; i <= 100; i++){
 * 		if(i%2 == 0){
 * 			System.out.println(i);
 * 		}
 * }
 * 
 * ����3.1-100 ��
 * int sum = 0;
 * for(int i = 1; i <= 100; i++){
 * 		sum = sum + i;	
 * }
 * System.out.println(sum);
 * 
 * ����4.N�Ľ׳�
 * int N = 6;
 * int ji = 1; 
 * for(int i = 1; i <= N; i++){
 * 		ji = ji * i;	
 * }
 * System.out.println(ji);
 * 
 * ����5.�����������Լ��
 * int a = 15;
 * int b = 10;
 * int min = a>b?b:a;
 * for(int i = min; i>=1; i--){
 * 		if((a%i==0) && (b%i==0)){
 * 		System.out.println("���Լ��Ϊ��"+i);
 * 		break;
 * 		}
 * }
 * 
 * ����6.����������С������
 * int a = 15;
 * int b = 10;
 * int max = a<b?b:a;
 * for(int i = max; i<=a*b; i++){
 * 		if((i%a==0) && (i%b==0)){
 * 		System.out.println("��С������Ϊ��"+i);
 * 		break;
 * 		}
 * }
 * 
 * ����7.�ҳ�����������Сֵ
 * 
	 * int a = 12;
	 * int b = 34;
	 * int c = 2356;
	 * 
	 * int min = a;
	 * if(b<min){
	 * 		min = b;
	 * }
	 * if(c<min){
	 * 		min = c;
	 * }
	 * System.out.println("��СֵΪ��"+min);
 * 
 * ����8.�ж�һ�����ǲ�������
 * int n = 123;
 * int sum = 0;
 * for(int i = 1; i < n; i++){
 * 		if(n%i==0){
 * 			sum = sum + i;
 * 		}
 * }
 * if(sum == n){
 * 		System.out.println(n+"������");
 * }
 * 
 * ����9.�ж�һ�����ǲ�������������1�ͱ���֮��û�б�����ӣ�
 * -------------����1----------------
 *  int n = 19;
 *  int i = 2
 *  for(; i < n; i++){
 *  	if(n%i==0)
 *  	{
 *  		System.out.println(n+"��������");
 *  		break;
 *  	}
 *  }
 *  if(i==n){
 *  	System.out.println(n+"������")
 *  }
 *  
 * -------------����2----------------
 *  int n = 19;
 *  int count = 0;
 *  for(int i = 2; i < n; i++){
 *  	if(n%i==0)
 *  	{
 *  		count++;
 *  		System.out.println(n+"��������");
 *  		break;
 *  	}
 *  }
 *  if(count==1){
 *  	System.out.println(n+"������");
 *  }
 * -------------����3----------------
 *  int n = 19;
 *  boolean count = true;
 *  for(int i = 2; i < n; i++){
 *  	if(n%i==0)
 *  	{
 *  		count=false;
 *  		System.out.println(n+"��������");
 *  		break;
 *  	}
 *  }
 *  if(count){
 *  	System.out.println(n+"������");
 *  }
 *  
 * ����10.
 * �����
 * 		*****
 * 
 * 	for(int i= 1; i <= 5; i++){
 * 		System.out.print("*");
 * }
 * 
 * �����
 *  	*****
 * 		*****
 * 		*****
 * 		*****
 * 		*****
 * 
 * 	for(int i= 1; i <= 5; i++){
 * 		for(int j = 1; j <= 5; j++){
 * 			System.out.print("*");
 * 		}
 * }
 * 
 *  * �����
 *  	*
 * 		**
 * 		****
 * 		*****
 * 		******
 * 
 * 	for(int i= 1; i <= 5; i++){
 * 		for(int j = 1; j <= i; j++){
 * 			System.out.print("*");
 * 		}
 * }
 * 
 * �����
 *  	*
 * 		***
 * 		*****
 * 		*******
 * 		*********
 * 
 * 	for(int i= 1; i <= 5; i++){
 * 		for(int j = 1; j <= 2*i-1; j++){
 * 			System.out.print("*");
 * 		}
 * }
 * 
 *	����10.�žų˷���
 *for(int i = 1; i <= 9; i++){
 *		for(int j = 1; j <= i; j++){
 *			System.out.print(j+"x"+i+"="+j*i+"\t");
 *		}
 *		System.out.println();
 *}
 * 
 * */

public class java002 {
	public static void main(String[] args) {
		// int n = 19;
		// int count = 0;
		// for (int i = 2; i < n; i++) {
		// if (n % i == 0) {
		// count++;
		// System.out.println(n + "��������");
		// break;
		// }
		// }
		// if (count == 0) {
		// System.out.println(n + "������");
		// }
		//
		// for (int i = 1; i <= 5; i++) {
		// for (int j = 1; j <= 2 * i - 1; j++) {
		// System.out.print("*");
		// }
		// System.out.println();
		// }
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "x" + i + "=" + j * i + "\t");
			}
			System.out.println();
		}

	}

}
