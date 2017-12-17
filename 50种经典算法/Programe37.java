import java.util.Scanner;

//题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下
//的是原来第几号的那位。
public class Programe37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要排成一圈的人数：");
		int n = sc.nextInt();
		boolean[] arr = new boolean[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = true;
		}
		int leftCount = n;
		int countNum = 0;
		int index = 0;
		while(leftCount > 1) {
			if(arr[index] == true) {
				countNum++;
				if(countNum == 3) {
					countNum = 0;
					arr[index] = false;
					leftCount--;
				}
			}
			index++;
			if(index == n) {
				index = 0;
			}
		}
		for(int i = 0; i < n; i++) {
			if(arr[i] == true) {
				System.out.println("原来排在"+(i+1)+"位的人留下了");
			}
		}
		sc.close();
	}

}
