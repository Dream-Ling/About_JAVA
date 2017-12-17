import java.util.Scanner;

//题目：判断一个整数能被几个9整除 
public class Programe45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个正整数：");
		int num = sc.nextInt();
		int t = num;
		for(int i = 1;i<t;i++) {
			if(t%9==0) {
				count++;
				t=t/9;
			}
		}
		System.out.println(num+"能被9整除"+count+"次");
		sc.close();
	}

}
