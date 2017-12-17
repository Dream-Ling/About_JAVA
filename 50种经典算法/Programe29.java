import java.util.Random;

//题目：求一个3*3矩阵对角线元素之和 
//1.程序分析：利用双重for循环控制输入二维数组，再将a[i][i]累加后输出。 
public class Programe29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 3;
		int sum = 0;
		Random random = new Random();
		int[][] arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = random.nextInt(10);
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(i==j) {
					sum=sum+arr[i][i];
				}
			}
		}
		System.out.println("此矩阵对角线和为："+sum);
	}

}
