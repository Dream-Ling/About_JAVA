//题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。 
//1.程序分析：请抓住分子与分母的变化规律。 
public class Programe20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 double fenzi = 2.0;
//		 double fenmu = 1.0;
//		 double sum = 0;
//		 for (int i = 1; i <= 20; i++) {
//		 sum=sum+fenzi/fenmu;
//		 fenzi = fenmu+fenzi;
//		 fenmu = fenzi-fenmu;
//		 }
//		 System.out.println(sum);
		int x = 2, y = 1, t;
		double sum = 0;
		for (int i = 1; i <= 20; i++) {
			sum = sum + (double) x / y;
			t = y;
			y = x;
			x = y + t;
		}
		System.out.println("前20项相加之和是： " + sum);
	}

}
