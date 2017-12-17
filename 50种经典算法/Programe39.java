import java.util.Scanner;

//题目：编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数
//1/1+1/3+...+1/n(利用指针函数) 
public class Programe39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num = sc.nextInt();
		fun ff = new fun();
		System.out.println("和为："+ff.sum(num));
		sc.close();
	}

}
class fun{
	public double sum(int n) {
		double su=0;
		if(n%2==0) {
			for(int i=2;i<=n;i+=2) {
				su +=(double)1/i;
			}
		}else {
			for(int i=1;i<=n;i+=2) {
				su +=(double)1/i;
			}
		}
		return su;
	}
}