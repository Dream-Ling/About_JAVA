import java.util.Random;

//题目：将一个数组逆序输出。 
//1.程序分析：用第一个与最后一个交换。 
public class Programe31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 10;
		Random random = new Random();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = random.nextInt(100);	//产生0-99之间的随机数
		}
		System.out.println("排序之前：");
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("倒序输出：");
		for (int i = N-1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
