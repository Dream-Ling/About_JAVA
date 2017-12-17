//题目：求1+2!+3!+...+20!的和 
//1.程序分析：此程序只是把累加变成了累乘。 6！=6*5*4*3*2*1
public class Programe21 {
	public static void main(String[] args) {
		 long jiecheng=1;
		 long sum = 0;
		 for(int i = 1;i<=20;i++) {
		 jiecheng = i*jiecheng;
		 sum = sum+jiecheng;
		 }
		 System.out.println(sum);
    //2561327494111820313
//		long sum = 0;
//		long fac = 1;
//		for (int i = 1; i <= 20; i++) {
//			fac = fac * i;
//			sum += fac;
//		}
//		System.out.println(sum);
	}
}
