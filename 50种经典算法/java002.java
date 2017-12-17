/*
 * 语法逻辑
 * 		变量数据类型 + 运算符 + if + for
 * 建立基本的逻辑与算法    关系（固定模式）	--非常熟练
 * 
 * 灵活使用
 * 
 * ----------------------------------------------
 * 案例1.使用循环输出1~100
 * 		a.循环的基本结构		for(;条件 true/false;){}
 * 		b.循环执行的过程		for(1;2;3){操作}	//1只执行一次
 * 		c.高效使用循环		（入口  和  出口）
 * 
 * for(int i = 1; i <= 100; i++){
 * 		System.out.println(i);
 * }
 * 
 * 案例2.1-100 偶数
 * for(int i = 1; i <= 100; i++){
 * 		if(i%2 == 0){
 * 			System.out.println(i);
 * 		}
 * }
 * 
 * 案例3.1-100 和
 * int sum = 0;
 * for(int i = 1; i <= 100; i++){
 * 		sum = sum + i;	
 * }
 * System.out.println(sum);
 * 
 * 案例4.N的阶乘
 * int N = 6;
 * int ji = 1; 
 * for(int i = 1; i <= N; i++){
 * 		ji = ji * i;	
 * }
 * System.out.println(ji);
 * 
 * 案例5.两个数的最大公约数
 * int a = 15;
 * int b = 10;
 * int min = a>b?b:a;
 * for(int i = min; i>=1; i--){
 * 		if((a%i==0) && (b%i==0)){
 * 		System.out.println("最大公约数为："+i);
 * 		break;
 * 		}
 * }
 * 
 * 案例6.两个数的最小公倍数
 * int a = 15;
 * int b = 10;
 * int max = a<b?b:a;
 * for(int i = max; i<=a*b; i++){
 * 		if((i%a==0) && (i%b==0)){
 * 		System.out.println("最小公倍数为："+i);
 * 		break;
 * 		}
 * }
 * 
 * 案例7.找出三个数的最小值
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
	 * System.out.println("最小值为："+min);
 * 
 * 案例8.判断一个数是不是完数
 * int n = 123;
 * int sum = 0;
 * for(int i = 1; i < n; i++){
 * 		if(n%i==0){
 * 			sum = sum + i;
 * 		}
 * }
 * if(sum == n){
 * 		System.out.println(n+"是完数");
 * }
 * 
 * 案例9.判断一个数是不是素数（除了1和本身之外没有别的因子）
 * -------------方法1----------------
 *  int n = 19;
 *  int i = 2
 *  for(; i < n; i++){
 *  	if(n%i==0)
 *  	{
 *  		System.out.println(n+"不是素数");
 *  		break;
 *  	}
 *  }
 *  if(i==n){
 *  	System.out.println(n+"是素数")
 *  }
 *  
 * -------------方法2----------------
 *  int n = 19;
 *  int count = 0;
 *  for(int i = 2; i < n; i++){
 *  	if(n%i==0)
 *  	{
 *  		count++;
 *  		System.out.println(n+"不是素数");
 *  		break;
 *  	}
 *  }
 *  if(count==1){
 *  	System.out.println(n+"是素数");
 *  }
 * -------------方法3----------------
 *  int n = 19;
 *  boolean count = true;
 *  for(int i = 2; i < n; i++){
 *  	if(n%i==0)
 *  	{
 *  		count=false;
 *  		System.out.println(n+"不是素数");
 *  		break;
 *  	}
 *  }
 *  if(count){
 *  	System.out.println(n+"是素数");
 *  }
 *  
 * 案例10.
 * 输出：
 * 		*****
 * 
 * 	for(int i= 1; i <= 5; i++){
 * 		System.out.print("*");
 * }
 * 
 * 输出：
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
 *  * 输出：
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
 * 输出：
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
 *	案例10.九九乘法表
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
		// System.out.println(n + "不是素数");
		// break;
		// }
		// }
		// if (count == 0) {
		// System.out.println(n + "是素数");
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
