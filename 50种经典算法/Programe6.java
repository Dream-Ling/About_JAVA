import java.util.Scanner;

//【程序6】 
//题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
//1.程序分析：利用辗除法。 
public class Programe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入第一个整数：");
		Scanner print = new Scanner(System.in);
		int m1 = print.nextInt();
		System.out.println("请输入第二个整数：");
		int m2 = print.nextInt();
		int max=m1;
		int min=m1;
		max = m1<m2?m2:m1;
		min = m1>m2?m2:m1;
		//求最大公约数
		for(int i=min;i>=1;i--)
		{
			if(m1%i==0 && m2%i==0){
				System.out.println(m1+"与"+m2+"最大公约数为："+i);
				break;
			}
		}
		//求最小公倍数
		for(int j = max; j < m1*m2; j++){
			if(j%m1==0 && j%m2==0) {
				System.out.println(m1+"与"+m2+"最小公倍数为："+j);
				break;
			}
		}	
		
		print.close();
		print.close();
	}

}
