/*//语法逻辑
 *
 *java 简介  
 *	//sun ---- 1995 年
 *	//Oracle ---- 2009年
 *
 * java平台
 * 		javaSE	java标准开发平台
 * 		javaME	java微型开发平台
 * 		javaEE	java企业开发平台
 * 
 * 		jdk:java开发工具
 * 		    jdk  1.2     时间	版本代号   j2se j2me j2ee
 * 			jdk	 1.5  java5    	
 * 			当前版本
 * 		
 * 		jre:
 * 
 * 		apache 	开源基金会
 * 	
 * 		IBM		《硅谷传奇》
 * 		
 * java 运行
 * 	
 * 		jvm :  java 虚拟机	跨平台     核心支撑	
 * 
 * 		.java ---> javac 编译  --->.class --->java运行
 * 
 * 	类是  java	程序 开发  最小单元
 *  类名  帕斯卡  字母  数字  下划线  不能以数字开头  通常是字母开头且   第一字母必须大写
 *  
 *  使用 	cmd 命令 	环境  编译  运行
 *  	cd 
 *  	dir
 *  	
 *  开发环境
 *  	eclipse	myeclips
 *  
 * 	  基本格式   
     *public class Hello{
	 * 		public static void main(String[] args){
	 * 			System.out.println("Hello World");
	 * 		}  
	 * }
 * -----------------------------------------
 * 
 * 语法逻辑
 *	数据类型：
 *		基本：	byte(-128~127) short(16位)  int(32位)  long(2的64次方位) float(64位) double char(16位)  
 *				boolean(true/false)
 *		引用：	面向对象精华
 * 		
 * 		内存中存储-----待运算的数据
 * 		
 * 		案例1.输出两个数
 * 			int a1 = 10;
 * 			int a2 = 20;
 * 			System.out.println(a1);
 * 			System.out.println(a1);
 * 
 * 		案例2.交换两个数
 * 			int a = 10;
 * 			int b = 20;
 * 			int temp = a;
 * 			a = b;
 * 			b = temp;
 * 			System.out.println(a);
 * 			System.out.println(b);
 * 
 * 		案例3.判断一个数是不是偶数（算数运算符）
 * 			int n = 10;
 * 			if(n%2 == 0){
 * 				System.out.println("yes");
 * 			}else{
 * 				System.out.println("no");
 * 			}
 * 	
 * 		案例4.得到一个3位正整数的个位
 * 			int k = 123;
 * 			int ge = k%10;		//个位
 * 			int shi = (k/10)%10;		//十位
 * 			int bai = k / 100;		//百位
 * 			System.out.println("no");
 * 
 * */


public class java001 {
}
