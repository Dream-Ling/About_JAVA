import java.util.Scanner;

//题目：读取7个数（1—50）的整数值，每读取一个值，程序打印出该值个数的＊。 
public class Programe47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("请输入一个1-50之间的整数：");
		int num;
		for(int i = 0; i < 7;i++) {
			System.out.println("请输入一个1-50之间的整数：");
			num = sc.nextInt();
			
			for(int j = 0; j<num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
